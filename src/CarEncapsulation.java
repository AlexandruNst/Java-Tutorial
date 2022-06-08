public class CarEncapsulation {
    private String make;
    private int year;

    CarEncapsulation(String make, int year){
        this.setMake(make);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
