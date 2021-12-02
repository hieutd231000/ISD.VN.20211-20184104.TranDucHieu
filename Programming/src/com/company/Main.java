package com.company;

import java.util.Objects;
import java.util.regex.Pattern;

public class Main {
    //Check validate PlaceOrderController
    public boolean validateName(String name){
        return Pattern.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", name);
    }
    public boolean validatePhoneNumber(String phoneNumber){
        if (phoneNumber.length() != 10) return false;
        if (!phoneNumber.startsWith("0")) return false;

        try{
            Integer.parseInt(phoneNumber);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public boolean validateAddress(String address){
        return Pattern.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", address);
    }
    //Check validate PlaceRushOrder
    public boolean validateTime(String time){
        String[] month ={"1","2","3","4","5","6","7","8","9","10","11","12"};
        Integer[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(!time.isEmpty()){
            String[] arrTime = time.split(" ", 2);
            System.out.println(arrTime[1]);
            if(Pattern.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]", arrTime[1])){
                String[] arrDate = arrTime[0].split("/", 3);
                for (String a : arrDate)
                    System.out.println(a);
                for(int i=0 ; i<month.length; i++){
                    if(Objects.equals(arrDate[0], month[i]) && (Integer.parseInt(arrDate[1]) > 0 && Integer.parseInt(arrDate[1]) < day[i]) && Integer.parseInt(arrDate[2]) >= 2021)
                        return true;
                }
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
