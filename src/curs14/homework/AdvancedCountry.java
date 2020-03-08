package curs14.homework;

import java.util.Objects;

public class AdvancedCountry extends Country{
    //nu stiu exact cum sa fac sa se afiseze technology cand printez asa ca cam asta e singura optiune la care m-am gandit...
    private final String technology;
    private final String name;
    private final String capital;
    private final long population;
    private final long area;
    private final Type type;

    public AdvancedCountry(String name, String capital, long population, long area, String technology) {
        super(name, capital, population, area);
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.type = Type.calculateType(population / (area == 0 ? 1 : area));
        this.technology = technology;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdvancedCountry that = (AdvancedCountry) o;
        return population == that.population &&
                area == that.area &&
                Objects.equals(technology, that.technology) &&
                Objects.equals(name, that.name) &&
                Objects.equals(capital, that.capital) &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), technology, name, capital, population, area, type);
    }

    @Override
    public String toString() {
        return "AdvancedCountry{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", type=" + type +
                ", technology = '" + technology + '\'' +
                '}';
    }
}
