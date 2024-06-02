package Service;


import Model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CrudService {
    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car( 1,   "ferrari" ,"GT120",2001, Car.Color.RED) ,
            new Car( 2,   "lamborgini" ,"TA45",2005, Car.Color.Blue),
            new Car( 3,   "marcedes" ,"546",2012, Car.Color.Green) ,
            new Car( 4,   "opel" ,"AS1456",2020, Car.Color.Blue) ,
            new Car( 5,   "megan" ,"JKG854",2016, Car.Color.RED)

    ));

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(long id)
    {
        return cars.stream().filter(car -> car.getId()==id).findFirst().orElse(null);
    }
    public void  delete(int id)
    {
        cars.removeIf(car -> car.getId()==id);
    }
    public void  add(Car car)
    {
        cars.add(car);
    }
    public void  update(Car car,int id)
    {
        cars.forEach(car1 ->
        {
            if (car.getId()==id)
                cars.set(cars.indexOf(car1),car );
        });
    }
    //console log
}
