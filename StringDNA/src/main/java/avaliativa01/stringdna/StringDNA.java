
package avaliativa01.stringdna;

//classe
public class StringDNA {
    private String dnaString;

    //construtor
    public StringDNA(String inputString) {
        StringBuilder validChars = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (isValidDNAChar(c)) {
                validChars.append(c);
            }
        }

        this.dnaString = validChars.toString();
    }

    public String toString() {
        return dnaString;
    }

    public char characterAt(int index) {
        if (index >= 0 && index < dnaString.length()) {
            return dnaString.charAt(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }
    
    //retorna a quantidade de A
    public int countA() {
        return countCharacter('A');
    }
    //retorna a quantidade de C
    public int countC() {
        return countCharacter('C');
    }
    //retorna a quantidade de G
    public int countG() {
        return countCharacter('G');
    }
    //retorna a quantidade de T
    public int countT() {
        return countCharacter('T');
    }

    public int length() {
        return dnaString.length();
    }
    
    //método reversoComplementar 
    public StringDNA reverseComplement() {
        StringBuilder complementBuilder = new StringBuilder();

        for (int i = dnaString.length() - 1; i >= 0; i--) {
            char c = dnaString.charAt(i);
            char complement = getComplement(c);
            complementBuilder.append(complement);
        }

        String complementString = complementBuilder.toString();
        return new StringDNA(complementString);
    }

    public int compare(StringDNA other) {
        int score = 0;

        int minLength = Math.min(dnaString.length(), other.length());
        for (int i = 0; i < minLength; i++) {
            char c1 = dnaString.charAt(i);
            char c2 = other.characterAt(i);

            if (c1 == c2) {
                score += 3;
            } else if (isComplementary(c1, c2)) {
                score += 1;
            }
        }

        return score;
    }

    private boolean isValidDNAChar(char c) {
        return c == 'A' || c == 'C' || c == 'G' || c == 'T';
    }

    private int countCharacter(char c) {
        int count = 0;

        for (char currentChar : dnaString.toCharArray()) {
            if (currentChar == c) {
                count++;
            }
        }

        return count;
    }

    private char getComplement(char c) {
        switch (c) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                throw new IllegalArgumentException("Invalid DNA character: " + c);
        }
    }

    private boolean isComplementary(char c1, char c2) {
        return (c1 == 'A' && c2 == 'T') || (c1 == 'T' && c2 == 'A') ||
                (c1 == 'C' && c2 == 'G') || (c1 == 'G' && c2 == 'C');
    }
}
