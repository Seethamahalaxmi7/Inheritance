// Superclass A
class A {
    int valueA = 10; // Data member in class A

    // Specific methods in A
    void methodA1() {
        System.out.println("Method A1 in class A");
    }
    
    void methodA2() {
        System.out.println("Method A2 in class A");
    }

    // Overridden method
    void show() {
        System.out.println("Show method in class A");
    }
}

// Subclass B extending A
class B extends A {
    int valueB = 20; // Data member in class B

    // Specific methods in B
    void methodB1() {
        System.out.println("Method B1 in class B");
    }
    
    void methodB2() {
        System.out.println("Method B2 in class B");
    }

    // Overriding show() method
    @Override
    void show() {
        System.out.println("Show method in class B");
    }
}

// Subclass C extending B
class C extends B {
    int valueC = 30; // Data member in class C

    // Specific methods in C
    void methodC1() {
        System.out.println("Method C1 in class C");
    }
    
    void methodC2() {
        System.out.println("Method C2 in class C");
    }

    // Overriding show() method
    @Override
    void show() {
        System.out.println("Show method in class C");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Object of Class A
        A objA = new A();
        System.out.println("Object of Class A:");
        objA.methodA1();
        objA.methodA2();
        objA.show();
        System.out.println("ValueA: " + objA.valueA);
        System.out.println("------------------------");

        // Object of Class B
        B objB = new B();
        System.out.println("Object of Class B:");
        objB.methodA1(); // Inherited from A
        objB.methodA2(); // Inherited from A
        objB.methodB1();
        objB.methodB2();
        objB.show();
        System.out.println("ValueA: " + objB.valueA);
        System.out.println("ValueB: " + objB.valueB);
        System.out.println("------------------------");

        // Object of Class C
        C objC = new C();
        System.out.println("Object of Class C:");
        objC.methodA1(); // Inherited from A
        objC.methodA2(); // Inherited from A
        objC.methodB1(); // Inherited from B
        objC.methodB2(); // Inherited from B
        objC.methodC1();
        objC.methodC2();
        objC.show();
        System.out.println("ValueA: " + objC.valueA);
        System.out.println("ValueB: " + objC.valueB);
        System.out.println("ValueC: " + objC.valueC);
        System.out.println("------------------------");

        // Runtime Polymorphism - Using superclass reference
        A ref1;
        
        ref1 = objB; // A reference to B object
        System.out.println("Calling overridden method with A reference to B object:");
        ref1.show(); // Calls B's show()
        System.out.println("ValueA using reference: " + ref1.valueA); // Access A's data member
        System.out.println("------------------------");

        ref1 = objC; // A reference to C object
        System.out.println("Calling overridden method with A reference to C object:");
        ref1.show(); // Calls C's show()
        System.out.println("ValueA using reference: " + ref1.valueA); // Access A's data member
        System.out.println("------------------------");

        // Runtime Polymorphism with Data Members
        B ref2;
        ref2 = objC; // B reference to C object
        System.out.println("Accessing values using B reference to C object:");
        System.out.println("ValueA using reference: " + ref2.valueA); // From A
        System.out.println("ValueB using reference: " + ref2.valueB); // From B
        // System.out.println("ValueC using reference: " + ref2.valueC); // Not allowed
    }
}
