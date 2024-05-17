package automationtest;

public class ForLoop_Q4 {
    public void PrintMyName(String name, int howmanytime){
        //Write the forloop method
        for (int i = 0; i < howmanytime; i++){
            System.out.println(name);

        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();

        // call the method with your name and the number of time to print
        obj.PrintMyName("YourName", 10);
    }
}

