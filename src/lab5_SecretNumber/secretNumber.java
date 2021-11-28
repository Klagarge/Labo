package lab5_SecretNumber;

import hevs.utils.Input;

public class secretNumber {

    public static void displayMenu() {
        String s = "";
        s += "************************************* \n";
        s += "* Secret Number - Can you find it ? * \n";
        s += "************************************* \n";
        s += "Choose difficulty level : \n";
        s += "      (1) Rookie level    (1 to 10) \n";
        s += "      (2) Easy level      (1 to 100) \n";
        s += "      (3) Normal level    (1 to 1000) \n";
        s += "      (4) Nightmare level (1 to 100000) \n";
        System.out.println(s);
    }

    public static int askUser(String s) {
        System.out.print(">> " + s);
        return Input.readInt();
    }

    public static int generateSecretNumber(int max) {
        double random = Math.random();
        random *= max;
        return (int) Math.floor(random)+1;
    }

    public static int compare(int secret, int guess) {
        if (secret == guess) {
            return 0;
        } else if (secret < guess){
            return -1;
        } else { // secret > guess
            return 1;
        }

    }

    public static boolean end(int nbrTry, int minTries) {
        if (nbrTry<minTries){
            System.out.println("\n!!!! Congratulations !!!!");
        }
        System.out.println("You succed with " + nbrTry + " tries.");
        System.out.println("");
        char foo;
        do {
            System.out.print("Do you want to play another party ? (y/n)");
            foo = Input.readChar();
            if(foo == 'n'){
                System.exit(1);
            }
        } while (foo != 'y');
        return true;
    }

    public static int dichotomie(int secretNumber, int upper) {
        int nbrMin = 0;
        int min = 0;
        int max = upper;
        int test = 0;
        do {
            nbrMin++;
            test = (max-min)/2+min;
            if (test>secretNumber){
                max = test;
            }
            if (test<secretNumber){
                min = test;
            }
            if ( (max-min)==1 ){
                test = max;
            }
        } while (test != secretNumber);
        return nbrMin;
    }

    public static void main(String[] args) {
        while (true) {

            int nbrTry = 0;
            displayMenu();
            int choice;
            do {
                choice = askUser("What is your choice ? ");
            } while (choice<1 || choice>4);

            int upperLimit = 0;
            switch (choice) {
                case 1:
                    upperLimit = 10;
                    break;
                case 2:
                    upperLimit = 100;
                    break;
                case 3:
                    upperLimit = 1000;
                    break;
                case 4:
                    upperLimit = 100000;
                    break;
                default:
                    System.exit(-1);
                    break;
            }
            int secretNumber = generateSecretNumber(upperLimit);
            //System.out.println("Secret number is " + secretNumber);
            int minTries = dichotomie(secretNumber, upperLimit);
            System.out.println("You can find with " + minTries);
            boolean search = true;

            while (search) {
                choice = askUser("Enter your guess : ");
                if (choice == 0){
                    System.out.println("The good answer was "+secretNumber);
                    System.exit(1);
                }
                nbrTry++;
                switch (compare(secretNumber, choice)) {
                    case 0:
                        search = false;
                        if(end(nbrTry, minTries)){
                            System.out.println("");
                        }
                        break;
                    case 1:
                        System.out.println("The number is bigger than " + choice);
                        break;
                    case -1:
                        System.out.println("The number is smaller than " + choice);
                        break;
                
                    default:
                        System.exit(-1);
                        break;
                }
            }
        }
    }
}