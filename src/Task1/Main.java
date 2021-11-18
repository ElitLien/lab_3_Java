package Task1;

public class Main {
    public static void main(String[] args) {
        final Address address = new Address("Stryi");

        try {
            final User user1 = new User("Vla dyslav", "Miah kykh", address, Sex.MALE,-21, "vfdv213");
        }
        catch (final Exception er){
            System.out.println(er.getMessage() + '\n' + er.getHttpCode());
        }
    }
}
