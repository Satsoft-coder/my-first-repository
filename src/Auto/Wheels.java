package Auto;

public class Wheels {
    Double size;
    String name;
    Season season;

       public Wheels(Double size, String name, Season season) {
        this.size = size;
        this.name = name;
        this.season = season;
    }
    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", season=" + season +
                '}';
    }
}
