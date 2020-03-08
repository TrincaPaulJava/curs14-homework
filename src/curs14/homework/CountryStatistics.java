package curs14.homework;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries){
        this.countries = new ArrayList<>(countries == null ? new ArrayList<>() : countries);
    }

    private Country getCountryByName(String name) {
        for (Country country : countries) {
            if (country.getName().toLowerCase().equals(name.toLowerCase())) {
                return country;
            }
        }
        return null;
    }

    public List<Country> getCountryStartingWith(String letters){
        List<Country> result = new ArrayList<>();
        for(Country country : countries){
            if(country.getName().toLowerCase().contains(letters.toLowerCase())){
                result.add(country);
            }
        }
        return result;
    }

    public String getCountryCapital(String name){
        for(Country country : countries){
            if(country.getName().toLowerCase().equals(name.toLowerCase())){
                return country.getCapital();
            }
        }
        return "country not found";
    }

    public long getPopulation(String name){
        for(Country country : countries){
            if(country.getName().equals(name)){
                return country.getPopulation();
            }
        }
        return -1;
    }

    public long getArea(String name){
        for(Country country : countries){
            if(country.getName().equals(name)){
                return country.getArea();
            }
        }
        return -1;
    }

    public Country getLargestCountry(){
        long max = 0;
        for(Country country : countries){
            if(country.getArea()> max){
                max = country.getArea();
            }
        }
        for(Country country : countries){
            if(country.getArea() == max){
                return country;
            }
        }
        return null;
    }

    public Country getMostPeopleCountry(){
        long max = 0;
        for(Country country : countries){
            if(country.getPopulation()> max){
                max = country.getPopulation();
            }
        }
        for(Country country : countries){
            if(country.getPopulation() == max){
                return country;
            }
        }
        return null;
    }

    public Country getMostDense(){
        long max = 0;
        for(Country country : countries){
            if(country.getDensity()> max){
                max = country.getDensity();
            }
        }
        for(Country country : countries){
            if(country.getDensity() == max){
                return country;
            }
        }
        return null;
    }

    public List<Country>  getCountriesForDensity1(Type type){
        List<Country> result = new ArrayList<>();
        for(Country country : countries){
            if(country.getType().equals(type)){
                result.add(country);
            }
        }
        return result;
    }

    public List<Country>  getCountriesForDensity2(long density){  //in caz in care la asta te refereai prin for density
        List<Country> result = new ArrayList<>();
        for(Country country : countries){
            if(country.getDensity()-density < 10 && country.getDensity()-density > -10 ){ // pentru aproximare
                result.add(country);
            }
        }
        return result;
    }
    private int getIndexOfCountry(String name) {
        return this.countries.indexOf(getCountryByName(name));
    }

    public void makeAdvanced(String name, String technology) {
        Country country = getCountryByName(name);
        assert country != null;
        Country advancedCountry = new AdvancedCountry(country.getName(), country.getCapital(), country.getPopulation(), country.getArea(), technology);
        countries.set(getIndexOfCountry(name),advancedCountry);
    }

    public void printWithTechnology() {
        for (Country country : countries) {
            if (country instanceof AdvancedCountry) {
                System.out.println(country);
            }
        }
    }
}
