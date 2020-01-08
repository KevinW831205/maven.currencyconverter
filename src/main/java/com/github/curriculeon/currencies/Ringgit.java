package com.github.curriculeon.currencies;

import com.github.curriculeon.ConvertableCurrency;
import com.github.curriculeon.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        Double thisRate = CurrencyType.RINGGIT.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate/thisRate;
    }

}
