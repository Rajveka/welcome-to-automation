package automationtest;

public class Variable_Q2 {
        int  id;
        String  name;

        // Create a Parametersied Constructor
    public Variable_Q2(int id, String name){
        this.id = id;
        this.name = name;

    }
    // Create a method with no return type and no parameter
    public void display(){
        System.out.println(id + " - " + name);
    }

    //Create main method
    public static void main(String[] args) {
        //Create the first object
        Variable_Q2 obj1 = new Variable_Q2(101, "YourName");
        //call the 'display' method in main method
        obj1.display();

        //create the second object
        Variable_Q2 obj2 = new Variable_Q2(102, "Prime");
        //call the 'display' method in main method
        obj2.display();


    }
}
