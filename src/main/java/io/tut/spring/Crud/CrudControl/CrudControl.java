package io.tut.spring.Crud.CrudControl;

import Model.Car;
import Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CrudControl {
    @Autowired
    private CrudService CSF;
    @RequestMapping(method = RequestMethod.GET ,value="/cars")
    public List<Car> getCars()
    {

        return CSF.getCars();
    }
    @RequestMapping(method = RequestMethod.GET ,value = "/car/{id}")

    public Car getCar(@PathVariable long id)
    {

        return CSF.getCar(id);
    }
    @RequestMapping(method = RequestMethod.DELETE ,value = "/car/{id}")
    public void deleteCar(@PathVariable  int id )
    {
        CSF.delete(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/cars")
    public void addCar(@RequestBody Car car)
    {
        CSF.add(car);
    }
    @RequestMapping(method = RequestMethod.PUT ,value = "/car/{id}")
    public void updateCar(@RequestBody Car car,@PathVariable int id )
    {
        CSF.update(car,id);
    }
}
