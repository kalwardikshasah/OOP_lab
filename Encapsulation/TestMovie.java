class Movie {
    private String name;
    private double rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10)
            this.rating = rating;
        else
            System.out.println("Invalid rating");
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}

public class TestMovie {
    public static void main(String[] args) {
        Movie m = new Movie();

        m.setName("Inception");
        m.setRating(8.8);

        System.out.println("Movie: " + m.getName());
        System.out.println("Rating: " + m.getRating());
    }
}