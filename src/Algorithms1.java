import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    // * TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // * TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!

    // * TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

    // * TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    // * TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // * TODO 6 - Skriv en test til randomName() metoden

    // * TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // * TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {

        exampleOfPredictableRandomNumber();

        System.out.println("*************** Drenge Navn ***************");
        Algorithms1 a1 = new Algorithms1();
        System.out.println(a1.randomBoyName(45));
        System.out.println("*************** Pige Navn ***************");
        System.out.println(a1.randomGirlName(45));
        System.out.println("*************** Begge array sammen ***************");
        String[] nameArray = a1.randomName();
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
        System.out.println("*************** Random Bokstav ***************");
        a1.ranodomBokstav(10);
        System.out.println("*************** plat eller krone man kan vælge antal kast  ***************");
        a1.platEllerKrone(10);




    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));



    }


    // Metoder: ***************************************************************************************************************************************

    // Metode der hente et randomnavn fra RandomDrengeNavnearryert.


    public String randomBoyName(int amount){
        if(amount > 45 ){
          amount = 45;
        }
        Data data = new Data();

        String[] name = data.getRandomDrengeNavne();

        return name[(int)(Math.random()* amount)];

    }



    // Metode der henter et random navn fra RandomPiheNavneArrayet:

    public String randomGirlName ( int amount){
        if(amount > 45 ){
            amount = 45;
        }

        Data data = new Data();

        String[] name = data.getRandomPigeNavne();
        return name[(int)(Math.random()*amount)];

    }


    // Metode der lave et array der indeholder både drenge og pige array.
    // skaber en metoder der returner et String Array,
    public String[] randomName(){
    // instancere et Data objekt.
        Data data = new Data();


    // skaber to array med drenge og pige navne.
        String[] girl = data.getRandomPigeNavne();
        String[] boy = data.getRandomDrengeNavne();


    // skaber et array der kan indeholde begge arrays data.

    String[] nameArray = new String[90];
    int position = 0;

        for (String name: girl) {
            nameArray[position] = name;
            position++;
        }

        for (String name: boy) {
            nameArray[position] = name;
            position++;
        }


        return nameArray;

    }


// Metode der skaber et random char.

    public void ranodomBokstav(int AmountOfLetters ){
    String[] bokstav = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","y","Z","Æ","Ø","Å"};


            System.out.print("{");
        for (int i = 0; i < AmountOfLetters; i++) {


            int randomInt = (int) ((Math.random() * 28) + 1);
            System.out.print(bokstav[i]);
            System.out.print(" , ");


            }
        System.out.println("}");
        }





        // Metode  der kast en mønt og slår plat eller krone

        public void platEllerKrone(int antalKast){

            for (int i = 0; i < antalKast; i++) {


                boolean check = false;

                int kast = (int) (Math.random() * 2);

                if (kast == 1) {
                    check = true;
                }

                if (check) {
                    System.out.println("Du har slået plat");


                } else System.out.println("Du har slået krone ");

            }
        }







    }






































//}
