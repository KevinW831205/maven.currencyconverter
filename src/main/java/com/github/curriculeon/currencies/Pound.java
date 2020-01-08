package com.github.curriculeon.currencies;

import com.github.curriculeon.ConvertableCurrency;
import com.github.curriculeon.CurrencyType;

public class Pound implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        Double thisRate = CurrencyType.POUND.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate/thisRate;
    }

}
