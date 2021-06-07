package Ex13;

import java.text.NumberFormat;
import java.util.Locale;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class BankAccount{
    private double principal,rate;
    private int num_years,per_year;
    public void setPrincipal(double principal)
    {
        this.principal = principal;
    }
    public void setRate(double rate)
    {
        this.rate = rate / 100.0;
    }
    public void setYears(int num_years)
    {
        this.num_years = num_years;
    }
    public void perYear(int per_year)
    {
        this.per_year = per_year;
    }
    public void Amount()
    {
        Locale locale = new Locale("en", "US");
        NumberFormat cur_format = NumberFormat.getCurrencyInstance(locale);
        double Amount = principal * Math.pow(1 + rate / per_year,per_year*num_years);
        System.out.print(cur_format.format(principal) + " invested at " + (rate * 100.0) + "% for " +
                 num_years + " years compounded " + per_year + " times per year is " +
                cur_format.format(Amount));
    }
}
