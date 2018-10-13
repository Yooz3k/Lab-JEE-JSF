package view;

import business.ResultService;
import business.entities.Driver;
import business.entities.Result;
import lombok.Getter;
import lombok.Setter;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collection;

@Named
@ViewScoped
public class EditDriver implements Serializable {

    @Inject
    private ResultService resultService;

    @Getter
    @Setter
    private Driver driver = new Driver();

    public Collection<Result> getResults() {
        return resultService.findAllResults();
    }

    public String saveDriver() {
        resultService.saveDriver(driver);
        return "list_drivers?faces-redirect=true";
    }
}
