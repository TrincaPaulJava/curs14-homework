package curs14.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryReader {

    public List<Country> readCountries() throws FileNotFoundException{
        List<Country> result = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader("countries.txt"));
        while (scanner.hasNext()){
            Country country = readCountry(scanner.nextLine());
            result.add(country);

        }
        return result;
    }
    private Country readCountry(String line){
        String[] tokens = line.split("[|]");
        return new Country(tokens[0], tokens[1],Long.parseLong(tokens[2]),Long.parseLong(tokens[3]));
    }
}
