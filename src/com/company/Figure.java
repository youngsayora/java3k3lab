package com.company;
import java.lang.annotation.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@haveArea(name = "Фигура")
public class Figure {
    int square;
    public Figure(int square){
        this.square = square;
    }
    @returnArea
    public void getSquare() {
        System.out.print(square);
    }
}
