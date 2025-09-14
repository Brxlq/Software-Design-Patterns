package SDP;
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .brand("Toyota")
                .model("Corolla")
                .year(2022)
                .build();

        System.out.println(car);
    }
}


class Car {
    private final String brand;
    private final String model;
    private final int year;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }

    // --- Builder ---
    static class Builder {
        private String brand;
        private String model;
        private int year;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
