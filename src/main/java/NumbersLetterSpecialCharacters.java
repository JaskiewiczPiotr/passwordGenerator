public class NumbersLetterSpecialCharacters {

    public static String getLetterSpecialCharachters(int n)
    {

        System.out.println(n);

// choose a Character random from this String
        String NumberLetterSpecial = "ABCDEFGHIJKLMNOPRSTUWXYZ" + "abcdefghijklmnoprstuwxyz" + "0123456789" + "!@#$%^&*()_+-={}|:<";


// create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

// generate a random number between
// 0 to AlphaNumericString variable length
            int index
                    = (int)(NumberLetterSpecial.length()
                    * Math.random());

// add Character one by one in end of sb
            sb.append(NumberLetterSpecial
                    .charAt(index));
        }

        return sb.toString();

    }
}
