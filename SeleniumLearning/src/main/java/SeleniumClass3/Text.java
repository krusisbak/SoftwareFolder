package SeleniumClass3;

public class Text {
    public static void main(String[] args) {

        /* Syntax for xpath - //htmltag[@property='value']
        //input[@id='Email'] - creating xpath with 1 property


           2 properties:
           //htmltag[@property='value' and @property2='value']

           Contain() in xpath:
           syntax: //htmltag[contains(@property, 'value')]
           //button[contains(@class, 'search')]
           //button[contains(@id, 'newsletter')]

           With and without contains
           //button[@class='button-1 newsletter-subscribe-button' and contains(@id, 'newsletter')]

           text() in xpath:
            syntax: //htmltag[text()='value']
            //a[text()='Apply for vendor account']

            Relative xpath: exact location - short simple and meaningful

            Absolute/FULL xpath: Full absolute path
            - risky because something in the middle can be changed or deleted.

            Starts with:
            //input[starts-with(@class, 'pass')]
         */


    }
}

