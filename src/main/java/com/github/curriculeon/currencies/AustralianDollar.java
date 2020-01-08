package com.github.curriculeon.currencies;

import com.github.curriculeon.ConvertableCurrency;
import com.github.curriculeon.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        Double thisRate = CurrencyType.AUSTRALIAN_DOLLAR.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate/thisRate;
    }
}
