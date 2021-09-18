package by.bsuir.wt.classesAndObjects.book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;


    @Override
    public boolean equals(Object pb) {
        if (super.equals(pb)) {
            ProgrammerBook programmerBook = (ProgrammerBook) pb;
            return level == programmerBook.level &&
                    Objects.equals(language, programmerBook.language);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "ProgrammerBook info:" +
                super.toString()+
                "language='" + language +
                "', level=" + level +
                '.';
    }
}
