public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy_0 = SingletonLazy.getInstance();
        System.out.println(lazy_0);
        SingletonLazy lazy_1 = SingletonLazy.getInstance();
        System.out.println(lazy_0);
        System.out.println(lazy_0 == lazy_1);

        SingletonEager eager_0 = SingletonEager.getInstance();
        System.out.println(eager_0);
        SingletonEager eager_1 = SingletonEager.getInstance();
        System.out.println(eager_1);
        System.out.println(eager_0 == eager_1);

        SingletonHolder holder_0 = SingletonHolder.getInstance();
        System.out.println(holder_0);
        SingletonHolder holder_1 = SingletonHolder.getInstance();
        System.out.println(holder_1);
        System.out.println(holder_0 == holder_1);
    }
}
