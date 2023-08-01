public class LetterOnly {

    public static String getLettersOnly(int n)
    {

        System.out.println(n);

// choose a Character random from this String
        String LetterOnly = "ABCDEFGHIJKLMNOPRSTUWXYZ" + "abcdefghijklmnoprstuwxyz";


// create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

// generate a random number between
// 0 to AlphaNumericString variable length
            int index
                    = (int)(LetterOnly.length()
                    * Math.random());

// add Character one by one in end of sb
            sb.append(LetterOnly
                    .charAt(index));
        }

        return sb.toString();

    }
}
