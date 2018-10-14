package view;

import business.ResultService;
import business.entities.Driver;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collection;

@Named
@RequestScoped
public class ListDrivers implements Serializable {

    @Inject
    private ResultService resultService;

    private Collection<Driver> drivers;

    public Collection<Driver> getDrivers() {
        if (drivers != null)
            return drivers;
        else
            return drivers = resultService.findAllDrivers();
    }

    public String removeDriver(Driver driver) {
        resultService.removeDriver(driver);
        return "list_drivers?faces-redirect=true";
    }
}