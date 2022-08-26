package io.filluk.food.exceptions;

public class MealNotFoundException extends RuntimeException{
    public MealNotFoundException(Long id) {
        super("Could not find meal " + id);
    }
}
