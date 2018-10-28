package com.company;

@FunctionalInterface    //ta adnotacja zabezpiecza przed tym aby w tym interfejsie nie było więcej metod abstrakcyjnych
public interface FuncInterface {
    
    void method();
    
    default void method2(String arg1){    //dzięki słówku default można zaimplementować ją.
        
    };
}
