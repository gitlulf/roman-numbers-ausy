package com.ausy.javamorslets.romannumbers;

/**
 * Implementations of this class can translate roman to arabic numbers
 */
public interface NumberTranslateable {

    /**
     * Translates roman to arabic numbers
     * @param romanNumber the number to translate
     * @return the roman number, translated to an arabic number
     */
    int translateToArabicNumber(String romanNumber);
    
}
