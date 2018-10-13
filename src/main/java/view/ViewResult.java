package view;

import business.entities.Result;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ViewResult {

    @Getter
    @Setter
    private Result result;
}
