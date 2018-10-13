package view.converters;

import business.ResultService;
import business.entities.Result;

import javax.enterprise.context.Dependent;
import javax.faces.convert.FacesConverter;

@Dependent
@FacesConverter(forClass = Result.class, managed = true)
public class ResultConverter extends AbstractEntityConverter<Result> {

    public ResultConverter() {
        super(Result::getId, ResultService::findResult);
    }
}
