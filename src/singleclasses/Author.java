package singleclasses;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return name == author.name && email == author.email && gender == author.gender;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + name.hashCode();
        code = 31 * code + email.hashCode();
        code = 31 * code + gender;
        return code;
    }
}
