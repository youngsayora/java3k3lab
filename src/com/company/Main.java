package com.company;

import java.lang.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
	Figure figure = new Figure(7);
    Table table = new Table(200);
    House house = new House(10000);
    answerMethod(figure);
    answerMethod(table);
    answerMethod(house);
    }

    public static void answerMethod(Object obj) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {

        Class cl = obj.getClass();

        boolean hasReturn=false;
        Method[] method = cl.getMethods();
        for(Method md: method){
            if (md.isAnnotationPresent(returnArea.class)) {
                md.invoke(obj);
                haveArea annotation = obj.getClass().getAnnotation(haveArea.class);
                System.out.println(" - " + annotation.name());
            }


        }





    }

}
