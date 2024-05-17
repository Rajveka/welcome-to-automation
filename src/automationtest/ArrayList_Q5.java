package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    //Create main method
    public static void main(String[] args) {
        //ArrayList Declaration
        ArrayList<String> tools = new ArrayList<>();
        tools.add("Scrum");
        tools.add("Java");
        tools.add("Jira");
        tools.add("Selenium");
        tools.add("Cucumber");
        tools.add("Postman");
        tools.add("Rest Assured");

        //Print the list using a forEach loop
        tools.forEach(System.out::println);

    }
}
