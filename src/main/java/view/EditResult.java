package view;

import business.ResultService;
import business.entities.Result;
import lombok.Getter;
import lombok.Setter;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class EditResult implements Serializable {

    @Inject
    private ResultService resultService;

    @Getter
    @Setter
    private Result result = new Result();

    public String saveResult() {
        resultService.saveResult(result);
        return "list_results?faces-redirect=true";
    }
}
