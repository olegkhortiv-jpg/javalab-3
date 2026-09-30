public class Friend {
    private static int count = 0;
    private int id;
    private String lastName;
    private String firstName;
    private int birthYear;
    private String interests;

    public Friend() {
        count++;
        this.id = count;
        this.lastName = "Невідомо";
        this.firstName = "Невідомо";
        this.birthYear = 2000;
        this.interests = "Немає";
    }

    public Friend(String lastName, String firstName, int birthYear, String interests) {
        count++;
        this.id = count;
        this.lastName = lastName;
        this.firstName = firstName;
        setBirthYear(birthYear);
        this.interests = interests;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 1950 && birthYear <= 2024) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Age " + birthYear + " is incorrect for friend!");
        }
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }
}