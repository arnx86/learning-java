public class StringFormat {
    public static void main(String args[]){
        String city = "Trivandrum";
        float temperature = 35.5f;
        System.out.printf("Temperature at %s is %f degree celcius (%f degree farenhiet) \n", 
                            city, temperature, temperature * 1.8 + 32);
        String message = String.format("Today's temperature at %s is %f degree celcius \n", 
                                        city, temperature);                             
        System.out.println(message);
    }
}