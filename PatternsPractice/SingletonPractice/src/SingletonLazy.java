public class SingletonLazy {
    private static SingletonLazy lazyInstance;

    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstance(){
        if (lazyInstance == null){
            lazyInstance = new SingletonLazy();
        }
        return lazyInstance;
    }
}
