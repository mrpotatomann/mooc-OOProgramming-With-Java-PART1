
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
            if(guessedLetters.contains(letter)){}
            else
            {
                guessedLetters=guessedLetters+letter;
                
                
                if(word.contains(letter)){}
                
                else {numberOfFaults++;}
            }
        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        int i = 0;
        String hiddenWord="";
        
        
        while(i<word.length()){
            String helper = "";
            helper += word.charAt(i); //megnézi a rejtett szó első karakterét, majd a másodikat és így tovább...
            
            if(guessedLetters.contains(helper)){ //ha a rejtett szó első karakterét tartalmazza a guessedLetters, akkor hozzá lesz adva szóhoz a 
                                                 //betű, majd a második és így tovább
                hiddenWord += word.charAt(i);
            }   else 
            {
                hiddenWord+="_"; // ha meg az első betűnél nincs ott, akkor kap egy "_"-t majd a másodiknál is, ha ott sincs és így tovább....
            }
            
            i++;
        } 
            
        
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        
        // return the hidden word at the end
        return hiddenWord;
    }
}
