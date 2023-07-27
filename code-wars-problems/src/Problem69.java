public class Problem69 {
     b  public String sayHello(String [] name, String city, String state){
        String full_name = " ";

        for (int i = 0; i < name.length; i++){
            full_name += name[i] + " ";
        }

        String greeting = "Hello, " + full_name.strip() + "! Welcome to " + city + ", " + state + "!";
        return greeting;
    }
}
