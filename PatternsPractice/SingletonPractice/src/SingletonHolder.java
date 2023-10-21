public class SingletonHolder {
    private static class InstanceHolder {
        public static SingletonHolder holderInstance = new SingletonHolder();
    }

    private SingletonHolder(){
        super();
    }
    public static SingletonHolder getInstance(){
        return InstanceHolder.holderInstance;
    }
}
