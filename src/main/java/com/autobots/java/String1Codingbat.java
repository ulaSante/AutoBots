package com.autobots.java;

public class String1Codingbat {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
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
        } else if (str.length() == 1) {
            return str.concat("@");
        } else {
            return str.concat("@@");
        }
    }

    public String lastChars(String a, String b) {
        String firstChar = "";
        String lastChar = "";

        if (a.length() >= 1 && b.length() >= 1) {
            firstChar = a.substring(0, 1);
            lastChar = b.substring(b.length() - 1);
            return firstChar + lastChar;

        } else if (a.length() >= 1 && b.isEmpty()) {
            firstChar = a.substring(0, 1);
            lastChar = b.replace(b, "@");
            return firstChar + lastChar;

        } else if (b.length() >= 1 && a.isEmpty()) {
            firstChar = a.replace(a, "@");
            lastChar = b.substring(b.length() - 1);
            return firstChar + lastChar;

        } else {
            firstChar = a.replace(b, "@");
            lastChar = b.replace(b, "@");
            return firstChar + lastChar;
        }
    }

    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a.concat(b);
        } else if ((!a.isEmpty() || !b.isEmpty()) && a.substring(a.length() - 1).equalsIgnoreCase(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1).concat(b);
        } else {
            return a.concat(b);
        }
    }

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            String predLast = str.substring(str.length() - 2, str.length() - 1);
            String last = str.substring(str.length() - 1);
            String withoutLastTwoLetters = str.substring(0, str.length() - 2);
            return withoutLastTwoLetters.concat(last).concat(predLast);
        } else {
            return str;
        }
    }

    public boolean frontAgain(String str) {
        String lastTwo = str.substring(str.length() - 2);
        if (str.length() >= 2 && str.endsWith(lastTwo)) {
            return true;
        } else {
            return false;
        }
    }

    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        String shortA = a.substring(a.length() - minLength);
        String shortB = b.substring(b.length() - minLength);
        return shortA + shortB;
    }

    public String without2(String str) {
        if (str.length() >= 2) {
            String withoutStr = str.substring(str.length() - 2);
            if (str.startsWith(withoutStr)) {
                return str.substring(2);
            }
        }
        return str;
    }

    public String deFront(String str) {
        if (str.length() >= 2 && str.startsWith("a") && str.substring(1, 2).equalsIgnoreCase("b")) {
            return str;
        } else if (str.startsWith("a")
                && str.length() >= 2
                && !str.substring(1, 2).equalsIgnoreCase("b")) {
            String a = str.substring(0, 1);
            return a.concat(str.substring(2));
        } else if (str.length() >= 2 && str.substring(1, 2).equalsIgnoreCase("b")) {
            String b = str.substring(1, 2);
            return b.concat(str.substring(2));
        }
        return str.length() <= 2 ? "" : str.substring(2);
    }

    public String startWord(String str, String word) {
        if (str.length() >= word.length()) {
            if (str.startsWith(word)) {
                return str.substring(0, word.length());
            } else if (str.substring(1).startsWith(word.substring(1))) {
                return str.substring(0, word.length());
            }
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);

        }
        return str;
    }

    public String withoutX2(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() == 1 && str.charAt(0) == 'x') {
            return (str.charAt(0) == 'x') ? "" : str;
        } else {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x'){
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            } else {
                return str;
            }
        }
    }


}
