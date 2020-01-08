package com.github.curriculeon.currencies;

import com.github.curriculeon.ConvertableCurrency;
import com.github.curriculeon.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        Double thisRate = CurrencyType.UNIVERSAL_CURRENCY.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate/thisRate;
    }

}
