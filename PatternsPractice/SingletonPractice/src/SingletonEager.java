public class SingletonEager {
    private static SingletonEager eagerInstance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return eagerInstance;
    }

}
