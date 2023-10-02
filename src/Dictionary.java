import java.util.ArrayList;
public class Dictionary {
    /**
     *  attributes: dictionary
     *  methods:
     *          addWord(Word w)
     *          removeWord(Word w)
     *          getWord(Word w)
     *          findWord(Word w)
     */
    ArrayList<Word> dictionary = new ArrayList<>();

    public Dictionary() {

    }

    /**
     * Can find the word or not.
     * @param w the word to find
     * @return true if can find, false if not
     */
    public boolean findWord(Word w) {
        for(Word word : this.dictionary) {
            if(word.equals(w))
                return true;
        }
        return false;
    }

    /**
     * Checks if can find the word in dictionary or not, and add the word to dictionary.
     * @param w the word to add
     */
    public void addWord(Word w) {
        if(!findWord(w))
            this.dictionary.add(w);
    }

}
