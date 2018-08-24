package com.alfabank;


import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        /*FileReader reader = new FileReader();
        reader.readFile("C:/opt/test.properties");*/

        Config conf = Config.getInstance();

        System.out.println(conf.getPropint());
        System.out.println(conf.isPropbool());
        System.out.println(conf.getPropstring());
    }

}
