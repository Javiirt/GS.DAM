public  class Acronym {

    String phrase = "";

    Acronym(String phrase) {
         this.phrase = phrase;
    }
Acronym() {
         this.phrase = "";
    }

    String get() {
        return newAcronym(phrase);
    }

    public String newAcronym(String phrase) {
        String acronym = "";
        acronym += phrase.substring(0, 1);
        for (int i = 1; i < phrase.length(); i++) {
            if (phrase.substring(i, i + 1).equals(" ") || phrase.substring(i, i + 1).equals("-")) {
                acronym += phrase.substring(i + 1, i + 2);
            }
        }
        final String s = acronym.toUpperCase();
        return s;
    }

}