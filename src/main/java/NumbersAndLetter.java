public class NumbersAndLetter {

    // Java program generate a random AlphaNumeric String
// using Math.random() method


    // function to generate a random string of length n
    public static String getLetterandNumbers(int n)
    {

        System.out.println(n);

// choose a Character random from this String
        String NumberOnly = "ABCDEFGHIJKLMNOPRSTUWXYZ" + "abcdefghijklmnoprstuwxyz" + "0123456789";


// create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

// generate a random number between
// 0 to AlphaNumericString variable length
            int index
                    = (int)(NumberOnly.length()
                    * Math.random());

// add Character one by one in end of sb
            sb.append(NumberOnly
                    .charAt(index));
        }

        return sb.toString();

    }


}


