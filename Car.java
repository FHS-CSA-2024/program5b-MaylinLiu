public class Car {
    // Private class parameters
    private String carName;
    private int milesDriven;
    private int gallonsUsed;

    // Constructor with no parameters (default values)
    public Car() {
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }

    // Constructor with parameters
    public Car(String name, int miles, int gallons) {
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }

    // Getter for carName
    public String getCarName() {
        return carName;
    }

    // Setter for carName
    public void setCarName(String name) {
        carName = name;
    }

    // Getter for milesDriven
    public int getMilesDriven() {
        return milesDriven;
    }

    // Setter for milesDriven
    public void setMilesDriven(int miles) {
        milesDriven = miles;
    }

    // Getter for gallonsUsed
    public int getGallonsUsed() {
        return gallonsUsed;
    }

    // Setter for gallonsUsed
    public void setGallonsUsed(int gallons) {
        gallonsUsed = gallons;
    }

    // Method to calculate average miles per gallon
    public double calculateAverage() {
        if (gallonsUsed == 0) {
            return 0.0; // Avoid division by zero
        }
        double average = (double) milesDriven / gallonsUsed;
        return Math.round(average * 10) / 10.0; // Round to the nearest tenth
    }

    // toString method to return formatted string
    public String toString() {
        return carName + " averaged " + calculateAverage() + " m/g";
    }
}

