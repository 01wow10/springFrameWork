package com.problem_01.converter;

import com.problem_01.model.NewDouble;
import org.jspecify.annotations.Nullable;
import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

public class SalaryConverter implements Converter<NewDouble, BigDecimal> {

    @Override
    public @Nullable BigDecimal convert(NewDouble  source) {
        double salary = source.getValue();
        return BigDecimal.valueOf(salary);
    }
}
