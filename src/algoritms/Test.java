package algoritms;

public class Test {
    
    public static void main(String[] args) {
        
        //String phrase = "dal sarkar kartal kalkar, kartal kalkar dal sarkar";
        String phrase = "test 12 asda tetetaadasd";
        System.out.println("Phrase: " + phrase);
        System.out.println("Number of char: " + phrase.length());
        
        int i=0;
        int count=0;
        while (i < phrase.length()) {
            //System.out.println(i + "-" + phrase.charAt(i));
        	
        	if (phrase.charAt(i) != 'a') {
                
                continue;
            }
            count++;
            i++;
        }
        System.out.println("Number of a's: " + count);
        
    }
}