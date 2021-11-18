package Task2;

public class Main {
    public static void main(String[] args) {
        try(final Human human = new Human("Vladyslav546")) {
            System.out.println(human.getName());
        }
        catch (final Exception e){
            System.out.println(e.getMessage());
        }
    }
}
