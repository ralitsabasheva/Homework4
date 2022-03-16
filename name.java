package homework;

import java.util.Scanner;

public class name {
    public static void main(String[] args){
        /*
        Напишете програма, която:
        1. Извежда името ви в конзолата.
         */
        Scanner myData = new Scanner(System.in);
        System.out.println("Please enter your first name :");
        String myName = myData.next();
        System.out.println("Yours first name is :\t" + myName);

        /*
        Сравнява го с име на приятел/ка, като използвате equals(),
        equalsIgnoreCase(), compareTo(), резултатите да излизат на отделни редове.
         */

        Scanner friendData = new Scanner(System.in);
        System.out.println("Please enter your friend's first name:" );
        String friendName = friendData.next();
        System.out.println("Your friend's first name is: " +friendName);
        boolean equalsName = true;

        if(myName.equals(friendName) == equalsName){
            System.out.println("Your name match your friend's name");
        } else{
            System.out.println("Your name don't mach your friend's name");
        }

       if(myName.equalsIgnoreCase(friendName) == equalsName){
           System.out.println("The names is match:");
       }else{
           System.out.println("The names don't mach");
       }

        int compareName = myName.compareTo(friendName);
        if (compareName == 0){
            System.out.println("The names match");
        } else if(compareName > 0){
            System.out.println("My name's  bigger than my friend");
        }else{
            System.out.println("My name's  less than my friend");
        }

        /*
        3. Долепя до името ви вашата фамилия, на нов ред.
         */

        System.out.println("Please enter your last name");
        String myLastName = myData.next();
        System.out.println("Your last name is:\t" + myLastName);
        System.out.println("Your first and last name are:\t" + myName + "\t" + myLastName);

        /*
        4. Извежда ваата възраст нов ред.
         */

        System.out.println("Enter your age");
        int myAge = myData.nextInt();
        System.out.println("Your age is:\t" + myAge);

        /*
        5. Извежда името фамилията и годините ви на един ред
         */

        System.out.println("Your names and age are :" + myName +"\t" + myLastName + "\t" + myAge);

        /*
        6. Извежда името фамилията и годините на приятелят/ката ви на нов ред.
         */

        System.out.println("Enter yours friend's age:");
        int friendAge = friendData.nextInt();
        System.out.println("Enter your friend's last name:");
        String friendsLastName = friendData.next();
        System.out.println("Your friend's name and age are " + friendName + "\t" + friendsLastName + "\t" + friendAge);



    }
}
