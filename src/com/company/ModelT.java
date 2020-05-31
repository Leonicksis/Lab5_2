package com.company;

import java.util.InputMismatchException;

public class ModelT extends SiemensMob{

    private String model_name;
    private char chip1, chip2;
    private int memory;


    @Override
    public void Info() {
        System.out.println(company + ' ' + model_name);
        System.out.print("Chip 1: ");
        System.out.println(chip1);
        System.out.print("Chip 2: ");
        System.out.println(chip2);

    }

    public ModelT(String s, char c1, char c2) throws  Exept{
        model_name = s;
        chip1 = c1;
        chip2 = c2;
        if (c1==c2) {
            throw new Exept(1);
        }

    }

}