package Homework;
import java.util.Scanner;

public class task {
    public static void main(String[] arg){
        /*
        Напишете програма :
        Която извежда името ви в конзолата
         */
        Scanner myName = new Scanner(System.in);
        System.out.println("Please enter your name:\t");
        String name = myName.next();
        System.out.println("Your name is :\t" + name);

        /*
        Сравнява името с име на приятел/ка като използвате equals(), equalsIgnoreCase(), compareTo(),
        езултатите да излизат на отделни редове
         */

        Scanner friendName = new Scanner(System.in);
        System.out.println("Please enter your friend's name:");
        String frName = friendName.next();
        System.out.println("Your friend's name is :\t" + frName);
        boolean equalsNane = true;

        if(frName.equals(name) == equalsNane) {
                System.out.println("The names match");
    }
        else
        {
            System.out.println("The names do not match");
        }

        if(frName.equalsIgnoreCase(name) == equalsNane) {
            System.out.println("The names match");
        }
        else
        {
            System.out.println("The names do not match");
        }


        int compareName = name.compareTo(frName);
        if (compareName == 0){
            System.out.println("The names match");
        }
        else if(compareName > 0){
            System.out.println("My name's  bigger than my friend");
        }
        else{
            System.out.println("My name's  less than my friend");
        }

        Scanner lastName = new Scanner(System.in);
        System.out.println("Please enter your last name");
        String myLastName = lastName.next();
        System.out.println("My surname is :\t" + myLastName);
        System.out.println("Мy first and last name are:\t" + name + "\t"+ myLastName );

        Scanner age = new Scanner(System.in);
        System.out.println("Please enter your age: \t");
        int myAge = age.nextInt();
        System.out.println("I'm\t" + myAge + "years old");
        System.out.println("My name's :\t" + name + "\t" + myLastName + "and I'm\t" + myAge + "years old" );

        Scanner frLastName = new Scanner(System.in);
        System.out.println("[lease enter your friend's last name:\t ");
        String friendLastName = frLastName.next();
        Scanner frAge = new Scanner(System.in);
        System.out.println("Please enter your friend's age");
        int myFriendAge = frAge.nextInt();
        System.out.println("My friend's name is: \t" + frName + "\t" + friendLastName + "\t" + "He/She is\t" + myFriendAge + "\t" +"\t" + "years old");




    }
}
