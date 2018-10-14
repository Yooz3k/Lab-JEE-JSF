package business;

import business.entities.Driver;
import business.entities.Result;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

@SessionScoped
public class ResultService implements Serializable {

    private SortedMap<Integer, Result> results = new TreeMap<>();

    private SortedMap<Integer, Driver> drivers = new TreeMap<>();

    @PostConstruct
    public void init() {

        Result res1 = new Result(1, 5, new BigDecimal("18.208"), 1, true, "Monza");
        Result res2 = new Result(2, 2, new BigDecimal("8.705"), 1, true, "Monza");

        Driver driver1 = new Driver(1, "Max", "Verstappen", "Holandia", "Red Bull",
                returnDate(1997, 9, 30), false, Arrays.asList(res1));
        Driver driver2 = new Driver(2, "Kimi", "Raikkonen", "Finlandia", "Ferrari",
                returnDate(1979, 10, 17), true, Arrays.asList(res2));

        results.put(res1.getId(), res1);
        results.put(res2.getId(), res2);

        drivers.put(driver1.getId(), driver1);
        drivers.put(driver2.getId(), driver2);
    }

    public Collection<Result> findAllResults() {
        return results.values();
    }

    public Result findResult(Integer id) {
        if (id == null)
            return null;

        return results.get(id);
    }

    public Collection<Driver> findAllDrivers() {
        return drivers.values();
    }

    public Driver findDriver(Integer id) {
        if (id == null)
            return null;

        return drivers.get(id);
    }

    public void removeResult(Result result) {
        if (result != null && result.getId() != null)
            results.remove(result.getId());
    }

    public void removeDriver(Driver driver) {
        if (driver != null && driver.getId() != null)
            drivers.remove(driver.getId());
    }

    public void saveResult(Result result) {
        if (result != null) {
            if (result.getId() == null) {
                result.setId(results.lastKey() + 1);
            }

            results.put(result.getId(), result);
        }
    }

    public void saveDriver(Driver driver) {
        if (driver != null) {
            if (driver.getId() == null) {
                driver.setId(drivers.lastKey() + 1);
            }

            drivers.put(driver.getId(), driver);
        }
    }

    private Date returnDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.getTime();
    }
}
