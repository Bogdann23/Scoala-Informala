package regEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bogdan 
 */
public class CodNumericPersonal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       String regex = "^[1-2]\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])(0[1-9]|[1-4]\\d|5[0-2]|99)(00[1-9]|0[1-9]\\d|[1-9]\\d\\d)\\d$";
 
        Pattern pattern = Pattern.compile(regex); //create a pattern using introduced regular expresion
        Scanner scannerSourceString = new Scanner(System.in);// read the source string using a new Scanner object

        System.out.println("Insert CNP to be validated: ");
        String source = scannerSourceString.next();// create the matcher as result of applying regex on source string
        Matcher matcher = pattern.matcher(source);
        boolean found = false;

// if the regular expression or pattern was found
        while (matcher.find()) {
            String result;
            result = String.format("The CNP is valid :)",
                      matcher.group(),
                      matcher.start(),
                      matcher.end());
            System.out.println(result);
            found = true;
        }
// if regular expression or pattern was not found in source string
        if (!found) {
            System.out.println("The CNP is not valid :(");
        }

    }
}
