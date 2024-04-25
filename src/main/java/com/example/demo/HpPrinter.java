package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component
public class HpPrinter implements Printer{


    private int count;

    @PostConstruct
    public void setup(){
        count = 5;
    }

    //@Override
    public void print(String message) {
        count--;
        System.out.println("HP Printer a:" + message);
        System.out.println("剩餘次數"+count);
    }
}
