/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {

    // * TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH

    // * TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH


    public static void main(String[] args) {
        System.out.println("*************lineSearch of array for a chosen number");
        Algorithms2 a2 = new Algorithms2();
        System.out.println(a2.lineSearchNum(271));
        System.out.println("*************lineSearch of array for a chosen Name");
        System.out.println(a2.lineSearchName("Awesome"));



    }



    public String lineSearchNum(int n){
        Data data = new Data();

        int[] intArray = data.getRandomNumbers1000();

        for (int i = 0; i < intArray.length; i++) {
            if (n == intArray[i])
                return "The number is " + n + " and is located in the array on the " + i + " position:";
            }
            return "The number " + n + " is not in the array";

        }




    public String lineSearchName(String Name){
        Data data = new Data();

        String[] stringArray = data.getRandomDrengeNavne();

        for (int i = 0; i < stringArray.length; i++) {
            if ( Name.equals(stringArray[i]))
                return "The name you are looking for is  " + Name + " and is located in the array on the " + i + " position:";
        }
        return "The name " + Name + " is not in the array";

    }


}




























