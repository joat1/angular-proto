package org.arllen;

import org.springframework.hateoas.ResourceAssembler;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Car implements ResourceAssembler<Car, HateoasCar> {

    private final String make;
    private final String model;
    private final int year;

    @JsonCreator
    public Car(@JsonProperty("make") String make,
               @JsonProperty("model") String model,
               @JsonProperty("year") int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public HateoasCar toResource(Car car) {
        return null;
    }
}
