package dev.mati;

public abstract class AbstractA {
    abstract void doSth1();
}
 abstract class AbstractB extends AbstractA {
    protected final static boolean fieldAB = true;

    public void concreteMethod() {

    }
}
class NotAbstract extends AbstractB {

    @Override
    void doSth1() {
        System.out.println(AbstractB.fieldAB);
    }
}

class OuterA {
    public static void main(String[] args) {
        System.out.println(AbstractB.fieldAB);
    }
}


