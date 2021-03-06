package io.github.leberkleber.ljcm.parser.impl;

import io.github.leberkleber.ljcm.parser.ConfigurationParserException;
import io.github.leberkleber.ljcm.parser.ConfigurationParser;

import java.util.HashSet;
import java.util.Set;

public class ShortParser implements ConfigurationParser {
    @Override
    public Set<Class> getResponsibleClasses() {
        Set<Class> responsibleClasses = new HashSet<>();

        responsibleClasses.add(Short.class);
        responsibleClasses.add(short.class);
        return responsibleClasses;
    }

    @Override
    public Short parseValue(String value, Class targetType) {
        if(value == null) throw new ConfigurationParserException("Could not parse 'null' to short");
        return Short.parseShort(value);
    }
}
