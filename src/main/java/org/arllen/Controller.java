package org.arllen;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
public class Controller {

    private static List<Car> vehicles;

    @RequestMapping("/")
    public String index() {
        return "test";
    }


//    @RequestMapping(path = "/vehicle/")
//    public HttpEntity<Resources> listVehicles() {
//        return HttpEntity<>(new ResourceSupport<>(vehicles) vehicles));
//        return new ResponseEntity(HttpStatus.OK, new Resources(vehicles));
//    }

    @RequestMapping(path = "/vehicle/{year}/{make}/{model}", method = RequestMethod.PUT)
    public HttpEntity<Car> newCar(
            @RequestParam(value = "make", required = true) String make,
            @RequestParam(value = "model", required = true) String model,
            @RequestParam(value = "year", required = true) int year) {

        Car car = new Car(make, model, year);
        vehicles.add(car);

//        return new ResponseEntity(HttpStatus.CREATED, car.add(linkTo(methodOn(Controller.class).newCar(make, model, year)).withSelfRel());
 return null;
    }

}