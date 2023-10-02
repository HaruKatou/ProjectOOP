import java.util.Objects;

public class Word {
    private String wordTarget;
    private String wordExplain;

    public Word() {

    }

    public Word(String wordTarget, String wordExplain) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    public String getWordExplain() {
        return wordExplain;
    }

    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public String getWordTarget() {
        return wordTarget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(wordTarget, word.wordTarget) && Objects.equals(wordExplain, word.wordExplain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordTarget, wordExplain);
    }

    @Override
    public String toString() {
        return "Word{"
                + "wordTarget='" + wordTarget + '\''
                + ", wordExplain='" + wordExplain + '\'' + '}';
    }
}
