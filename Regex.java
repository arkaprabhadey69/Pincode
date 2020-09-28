//package Regex;

//package com.oops;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {

    public static void main(String[] args){

        System.out.println("Welcome to Pincode problem");
       
        while (true) {
            
            String pincode="^\\d{6}";
           
            Pattern pattern = Pattern.compile(pincode);
            Scanner s2=new Scanner(System.in);
            String y=s2.nextLine();

            Matcher matcher =  pattern.matcher(y);

            boolean found = false;
            while (matcher.find()) {
                System.out.println("Valid Pincode");
                found = true;
            }
            if(!found){
                System.out.println("Invalid pincode");
            }
        }
    }
}
