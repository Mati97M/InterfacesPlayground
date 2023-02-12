package dev.mati;

public interface IA {
    default void test() {
        System.out.println("Atest");
    }
}
interface IB {
    default void test() {
        System.out.println("Btest");
    }
}

interface IC extends IA,IB {

    @Override
    default void test() {
        IA.super.test();    //or IB.super.test() or sth else
    }
}