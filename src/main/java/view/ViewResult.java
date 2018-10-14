package view;

import business.entities.Result;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class ViewResult implements Serializable {

    @Getter
    @Setter
    private Result result;
}
