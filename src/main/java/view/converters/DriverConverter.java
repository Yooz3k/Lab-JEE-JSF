package view.converters;

import business.ResultService;
import business.entities.Driver;

import javax.enterprise.context.Dependent;
import javax.faces.convert.FacesConverter;

@Dependent
@FacesConverter(forClass = Driver.class, managed = true)
public class DriverConverter extends AbstractEntityConverter<Driver> {

    public DriverConverter() {
        super(Driver::getId, ResultService::findDriver);
    }
}
