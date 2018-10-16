package com.rommelrico.s5lambdaexpressionscollectionsandgenerics.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");

        boolean b = list instanceof List;

    }

}
