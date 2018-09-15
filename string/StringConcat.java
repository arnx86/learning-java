public class StringConcat {
    public static void main(String args[]) {
        String helloMessage = "Hello".concat(" World!");
        String greetMessage = "Welcome to" +  " JAVA";
        String combinedMessage = helloMessage.concat(greetMessage);

        System.out.println(helloMessage);
        System.out.println(greetMessage);
        System.out.println(combinedMessage);
    }
}