package com.bloemer.api.resourcebundle;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        //NAO FUNCIONA!
        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("message",new Locale("pt","BR"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("hello"));
    }
}
