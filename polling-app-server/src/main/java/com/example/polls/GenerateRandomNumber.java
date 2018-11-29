package com.example.polls;

import java.util.*; 

public class GenerateRandomNumber
{ 
	private static String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	private static String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
	private static String numbers = "0123456789"; 
	private static String symbols = "!@#$%^&*_=+-/.?<>)"; 

    public static void main(String[] args) { 
        int length = 8;
        System.out.println(getCHAR_SYMBOL_NUMBER_Password(length));
        System.out.println(getCHAR_Number_Password(length));
        System.out.println(getNumber_Password(length));
    }    
    static char[] getCHAR_SYMBOL_NUMBER_Password(int len) { 
        String values = Capital_chars + Small_chars + numbers + symbols;
        Random rndm_method = new Random(); 
        char[] password = new char[len]; 
        for (int i = 0; i < len; i++) { 
            password[i] = values.charAt(rndm_method.nextInt(values.length())); 
        } 
        return password; 
    } 
    static char[] getCHAR_Number_Password(int len) { 
        String values = Capital_chars + Small_chars + numbers;
        Random rndm_method = new Random(); 
  
        char[] password = new char[len]; 
  
        for (int i = 0; i < len; i++) { 
            password[i] = 
              values.charAt(rndm_method.nextInt(values.length())); 
        } 
        return password; 
    }
    static char[] getNumber_Password(int len) { 
        String values = numbers ;
        Random rndm_method = new Random(); 
  
        char[] password = new char[len]; 
  
        for (int i = 0; i < len; i++) { 
            password[i] = values.charAt(rndm_method.nextInt(values.length())); 
        } 
        return password; 
    } 
} 
