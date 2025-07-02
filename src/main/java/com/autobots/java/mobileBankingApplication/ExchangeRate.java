package com.autobots.java.mobileBankingApplication;

public class ExchangeRate {

    public static double rate(Currency currency) {
        switch (currency) {
            case USD:
                return 1.0;
            case EUR:
                return 1.1;
            case KGS:
                return 0.011;
            default:
                throw new IllegalArgumentException("Unknown currency: " + currency);
        }
    }

    static double convert(double amount, Currency from, Currency to) {
        double currency = 0;
        if (from.equals(Currency.USD)) {
            switch (to) {
                case EUR:
                    currency = rate(to) * amount;
                    break;
                case KGS:
                    currency = amount / rate(to);
                    break;
            }
        } else if (from.equals(Currency.EUR)) {
            switch (to) {
                case USD:
                    currency = amount * rate(from);
                    break;
                case KGS:
                    currency = amount * rate(Currency.EUR) / rate(to);
                    break;
            }
        } else if (from.equals(Currency.KGS)) {
            switch (to) {
                case USD:
                    currency = amount * rate(to);
                    break;
                case EUR:
                    currency = amount * rate(Currency.KGS) / rate(to);
            }
        }
        return currency;
    }
}
