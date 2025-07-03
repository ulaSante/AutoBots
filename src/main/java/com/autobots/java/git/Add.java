package com.autobots.java.git;

public class Add {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    public String middleThree(String str) {
        int middleThree = str.length() / 2;
        return str.substring(middleThree - 1, middleThree + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equalsIgnoreCase("bad")
                || str.length() >= 4 && str.substring(1, 4).equalsIgnoreCase("bad")) {
            return true;
        } else {
            return false;
        }
    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1){
            return str.concat("@");
        } else {
            return str.concat("@@");
        }
    }
}
