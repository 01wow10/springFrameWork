package com.converter;

import org.jspecify.annotations.Nullable;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter2 implements Converter<String, LocalDate> {

    @Override
    public @Nullable LocalDate convert(String source) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return LocalDate.parse(source,formatter);

    }
}
