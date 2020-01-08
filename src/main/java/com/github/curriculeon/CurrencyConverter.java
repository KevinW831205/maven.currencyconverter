package com.github.curriculeon;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        Double rate = sourceCurrencyType.convert(targetCurrencyType);
        return amountOfBaseCurrency * rate;
    }
}
