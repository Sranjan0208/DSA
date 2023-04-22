public class SimpleLocation {

    // Member variables: data the objects need to store
    private double latitude;
    private double longitude;

    // getter
    public double getLatitude(){
        return this.latitude;
    }

    // setter: set the value of the latitude
    public void setLatitude(double lat){
        if (lat<-180 || lat>180) {
            System.out.println("Illegal value of latitude");
        } else {
            this.latitude = lat;
        }

    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double lon) {
        this.longitude= lon;
    }

    // Methods: the things the class can do ex: distance

    // Constructor: Method to create a new object
    // it has no return type, indicating it is a constructor
    public SimpleLocation(double lat, double lon){ // Parameter constructor
        this.latitude = lat;
        this.longitude = lon;
    }

    // Default constructor
    public SimpleLocation(){
        this.latitude = 32.9;
        this.longitude = -117.2;
    }

    public double distance(SimpleLocation other){
        return getDist(this.latitude, this.longitude, other.latitude, other.longitude)
    }

    private double getDist() {
    }
}
