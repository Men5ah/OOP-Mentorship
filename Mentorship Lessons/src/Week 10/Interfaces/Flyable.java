public interface Flyable {
    //Data fields
    final int MAX_ALTITUDE = 10000; // in feet
    final int MIN_ALTITUDE = 0; // in feet
    //Methods
    public String fly(String someArg);
    public void mate();
}