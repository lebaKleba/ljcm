package de.leberkleber.ljcm.parser;

import java.util.Set;

/**
 * Implement {@link ConfigurationParser} to parse custom configuration class types.
 * Minimal set of implementations can be found at {@link de.leberkleber.ljcm.parser.impl}.
 * See: https://github.com/leberKleber/ljcm/wiki/Configurationparser
 */
public interface ConfigurationParser {
    /**
     * Should return set of classes for which {@link ConfigurationParser}
     * is responsible. Primitive Types can also applied to {@link Set<Class>}
     * e.g.: {@code int.class;}.
     *
     * @return {@link Set<Class>}
     */
    Set<Class> getResponsibleClasses();

    /**
     * Should parse {@param value} to one of responsible classes, given by
     * {@link ConfigurationParser#getResponsibleClasses()}
     *
     * @param value {@link String}
     * @return {@link Object instanceof Set<Class>}
     */
    Object parseValue(String value);
}
