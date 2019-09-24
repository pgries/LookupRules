package lookup;

public class LookupDemo {

    public static void main(String[] args) {

        Parent parentParent = new Parent();
        Child childChild = new Child();
        Parent parentChild = new Child();

        System.out.println("Instance variables");
        System.out.println("------------------");
        System.out.println("Parent ref->Parent obj " + parentParent.num);
        System.out.println("Child ref –> Child obj " + childChild.num);
        System.out.println("Parent ref-> Child obj " + parentChild.num);
        System.out.println();

        System.out.println("Static variables");
        System.out.println("----------------");
        System.out.println("Parent ref->Parent obj " + parentParent.statNum);
        System.out.println("Child ref –> Child obj " + childChild.statNum);
        System.out.println("Parent ref-> Child obj " + parentChild.statNum);
        System.out.println();

        System.out.println("Instance methods");
        System.out.println("----------------");
        System.out.println("Parent ref->Parent obj");
        System.out.println(parentParent.getNum());
        System.out.println("Child ref –> Child obj");
        System.out.println(childChild.getNum());
        System.out.println("Parent ref-> Child obj");
        System.out.println(parentChild.getNum());
        System.out.println();

        System.out.println("Static methods");
        System.out.println("--------------");
        System.out.println("Parent ref->Parent obj");
        System.out.println(parentParent.getStatNum());
        System.out.println("Child ref –> Child obj");
        System.out.println(childChild.getStatNum());
        System.out.println("Parent ref-> Child obj");
        System.out.println(parentChild.getStatNum());
        System.out.println();

        // Rules:
        // 1. Use the type of the reference when looking up an instance variable,
        //    static variable, or static method.
        // 2. Use the type of the object when looking up an instance method.

        // When do you cast?
        Child obj4 = (Child) parentChild; // need to cast
        Child obj5 = childChild; // no need to cast
    }
}
