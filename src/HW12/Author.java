package HW12;

import java.util.Objects;

public class Author {
    private String firstName;
    private String surename;

    public Author(String firstName, String surename) {
        this.firstName = firstName;
        this.surename = surename;
    }

    public String getFirstNameName() {
        return this.firstName;
    }
    public String getSurename() {
        return this.surename;
    }

    public String toString() {
        return this.firstName + " " + this.surename;
    }
    //public boolean equals(Object other) {
       // if (this.getClass() != other.getClass()) {
          //  return false;
       // }
       // Author author = (Author) other;
       // return author.equals(author.firstName);
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(surename, author.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surename);
    }
}
