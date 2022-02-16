package com.company;

public class Main {

    public static void main(String[] args) {
        Swimable[] ocean= {new Duck(), new Shark(), new Turtle()};
        for (Swimable res:ocean) {
            res.swim();

        }
    }
}
