package oop;

class Singleton {

private static Singleton singleton = new Singleton( );

/* A private Constructor prevents any other
 * class from instantiating.
 */
private Singleton() { }

/* Static 'instance' method */
public static Singleton getInstance( ) {
    return singleton;
}

/* Other methods protected by singleton-ness */
protected void demoMethod( ) {
    System.out.println("demoMethod for singleton");
}
}
 class Tester2 {

    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance( );
        tmp.demoMethod( );
    }
}


class ClassicSingleton {

    private static ClassicSingleton instance = null;
    private ClassicSingleton() {
        // Exists only to defeat instantiation.
    }

    public static synchronized ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }

    protected void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}
 class Tester3 {

    public static void main(String[] args) {
        ClassicSingleton tmp = ClassicSingleton.getInstance( );
        tmp.demoMethod( );
    }
}

