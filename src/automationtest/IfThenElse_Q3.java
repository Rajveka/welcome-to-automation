package automationtest;

public class IfThenElse_Q3 {
    public boolean isteen(int age){
        if(age <= 18){
            return true;
        }else {
            return false;
        }
    }

    //Create main method
    public static void main(String[] args) {
        //Create the object
        IfThenElse_Q3 obj = new IfThenElse_Q3();

        //Test with age 15
        int age1 = 15;
        boolean result1 = obj.isteen(age1);
        System.out.println(age1 + " - " + result1);

        //Test with age 25
        int age2 = 25;
        boolean result2 = obj.isteen(age2);
        System.out.println(age2 + " - " + result2);
    }
}
