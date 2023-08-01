import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please write how many characters your password should be contains?");
        Scanner sc = new Scanner(System.in);
        //System.in is a standard input stream
        int passLength = sc.nextInt();
        System.out.println(passLength);
        System.out.println("If your password should contains only letter press l, if letters and number please write ln, " +
                "if letters, number and special characters please write lns");

        Scanner scc = new Scanner(System.in);
        String typeOfPassword = scc.nextLine();
        String s1 = "l";
        String s2 = "ln";
        String s3 = "lns";
        String result;
        String letterPassword;
        String numberletterSpecial;
        System.out.println(typeOfPassword);

            if (typeOfPassword.length() == 1) {
                char letter = typeOfPassword.charAt(0);
                if(letter == 'l'){
                    System.out.println("your password will be contains only letters");
                    letterPassword = LetterOnly.getLettersOnly(passLength);
                    System.out.println(letterPassword);
                }
            }
            if (typeOfPassword.length() == 2) {
               if(typeOfPassword.equals(s2)){
                   System.out.println("password will be contains letters and numbers");
                   result = NumbersAndLetter.getLetterandNumbers(passLength);
                   System.out.println(result);
               }
            }
            if(typeOfPassword.length() == 3){
                if (typeOfPassword.equals(s3)){
                    System.out.println("password will be contains letters, number and special character");
                    numberletterSpecial = NumbersLetterSpecialCharacters.getLetterSpecialCharachters(passLength);
                    System.out.println(numberletterSpecial);
                }

            }




    }


/*
        if (typeOfPassword == s1){
            System.out.println("you choosed password which contains only letter");

        } else if (typeOfPassword == s2) {
            System.out.println("you choosed password which contains  letter and numbers");


        }else if (typeOfPassword == s3){
            System.out.println("you choosed password which contains  letter,  numbers and special characters");
        }*/
    }



        /*
// Get the size n
        int n = 5;

// Get and display the alphanumeric string
        System.out.println(Generator
                .getAlphaNumericString(n));
    }

         */

