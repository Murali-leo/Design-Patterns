package solidprinciples.dependencyinjection;
/**
 * DependencyInjection.java
 * 
 * High level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstraction should not depend on details.
 */
public class DependencyInjection {

    public static void main(String[] args) {
        WebStore webStore = new WebStore();
        webStore.purchaseItem();
    }
}
