package view;

import business.ResultService;
import business.entities.Result;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collection;

@Named
@RequestScoped
public class ListResults implements Serializable {

    @Inject
    private ResultService resultService;

    private Collection<Result> results;

    public Collection<Result> getResults() {
        if (results != null)
            return results;
        else
            return results = resultService.findAllResults();
    }

    public String removeResult(Result result) {
        resultService.removeResult(result);
        return "list_results?faces-redirect=true";
    }
}