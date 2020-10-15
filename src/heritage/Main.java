package heritage;

import heritage.Elderly;
import heritage.Person;
import heritage.Student;

public class Main 
{
    public static void main(final String[] args) 
    {
        //Person dCrowley = new Person("David", 39, "Teacher");
        //dCrowley.work();
        Student aGoulart = new Student("Adam", 17, "Freelance programmer", 99.9);
        aGoulart.work();
        aGoulart.study();
        Elderly hCrowley = new Elderly("Helen", 87, "walking");
        hCrowley.retired();

        Person[] people = {aGoulart, hCrowley}; // polymorphism

        for (Person p : people)
        {
            System.out.println(p.getClass());
        }
    }
}
