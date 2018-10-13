package view;

import business.entities.Driver;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ViewDriver {

    @Getter
    @Setter
    private Driver driver;
}
