package com.github.curriculeon.currencies;

import com.github.curriculeon.ConvertableCurrency;
import com.github.curriculeon.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        Double thisRate = CurrencyType.SINGAPORE_DOLLAR.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate/thisRate;
    }

}
