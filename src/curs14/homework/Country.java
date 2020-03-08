package curs14.homework;

import java.util.Objects;

public class Country {
    private final String name;
    private final String capital;
    private final long population;
    private final long area;
    private final Type type;

    public Country(String name, String capital, long population, long area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.type = Type.calculateType(population / (area == 0 ? 1 : area));

    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public long getArea() {
        return area;
    }

    public Type getType() {
        return type;
    }

    public long getDensity() {
        return population / (area == 0 ? 1 : area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                area == country.area &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                type == country.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, population, area, type);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", type=" + type +
                '}';
    }
}