package com.company;

@haveArea(name = "Дом")
public class House {
    int square;
    public House(int square){
        this.square = square;
    }
    @returnArea
    public void getSquare() {
        System.out.print(square);
    }
}
