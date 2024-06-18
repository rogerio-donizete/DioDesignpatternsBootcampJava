import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Testsingleton {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
        System.out.println(holder);
        System.out.println("###################################################3");
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        eager = SingletonEager.getInstance();
        System.out.println(eager);
        holder = SingletonLazyHolder.getInstacia();
        System.out.println(holder);
    }
}