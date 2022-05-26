public class MainRunner{
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance("First");
        Singleton obj2 = Singleton.getInstance("Second");

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
