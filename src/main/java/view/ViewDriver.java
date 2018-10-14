package view;

import business.entities.Driver;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class ViewDriver implements Serializable {

    @Getter
    @Setter
    private Driver driver;
}
