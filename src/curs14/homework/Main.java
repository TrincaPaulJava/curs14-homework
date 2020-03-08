package curs14.homework;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CountryReader countryReader = new CountryReader();
       // System.out.println(countryReader.readCountries());
        List<Country> countries = countryReader.readCountries();
        CountryStatistics countryStatistics = new CountryStatistics(countries);
        System.out.println(countryStatistics.getCountryStartingWith("ica"));
        System.out.println(countryStatistics.getLargestCountry());
        System.out.println(countryStatistics.getMostPeopleCountry());
        System.out.println(countryStatistics.getMostDense());
        System.out.println(countryStatistics.getCountriesForDensity1(Type.LOW));
        System.out.println(countryStatistics.getCountriesForDensity2(500));
        countryStatistics.makeAdvanced("Afghanistan","idk");
        countryStatistics.makeAdvanced("Romania","good and cheap internet");
        countryStatistics.printWithTechnology();
    }
}
