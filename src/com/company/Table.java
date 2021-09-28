package com.company;

@haveArea(name = "Стол")
public class Table {

    int square;
    public Table(int square){
        this.square = square;
    }
    @returnArea
    public void getSquare() {
        System.out.print(square);
    }

}
