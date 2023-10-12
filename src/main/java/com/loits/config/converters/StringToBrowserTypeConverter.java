package com.loits.config;

import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserTypeConverter implements Converter <BrowserType> {

    @Override
    public BrowserType convert(Method method, String s) {
        return null;
    }
}
