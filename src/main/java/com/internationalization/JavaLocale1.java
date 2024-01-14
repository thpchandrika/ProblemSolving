package com.internationalization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;


public class JavaLocale1 {
    public static void main(String[] args)
    {
        //Since java19, constructors of Locale class have been deprecated.
        //Instead use Locale.of() static constructors.
        Locale deLocale = new Locale("de","De"); //code for Germany de_De
        Locale usLocale = new Locale("en","US"); //code for United States en_US
        Locale npLocale = new Locale("ne","NP"); //code for Nepal ne_NP

        long number = 123456789L;
//        NumberFormat deNumberFormat = NumberFormat.getInstance(deLocale);
//        NumberFormat usNumberFormat = NumberFormat.getInstance(usLocale);
        NumberFormat npNumberFormat = NumberFormat.getInstance(npLocale);
//        System.out.println( deNumberFormat.format(number) );
//        System.out.println( usNumberFormat.format(number) );
        System.out.println( npNumberFormat.format(number) );

        Date now = new Date();
//        DateFormat usDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, usLocale);
//        DateFormat deDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, deLocale);
        DateFormat npDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, npLocale);
//        System.out.println( usDateFormat.format(now) );
//        System.out.println( deDateFormat.format(now) );
        System.out.println( npDateFormat.format(now) );

    }

}
