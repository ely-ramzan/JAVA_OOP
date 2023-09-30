public class User {
    private String name;
    private int id;
    private Month birthmonth;
    private Gender gender;

    public User(String name, int id, Month birthmonth, Gender gender) {
        this.name = name;
        this.id = id;
        this.birthmonth = birthmonth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Month getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(Month birthmonth) {
        this.birthmonth = birthmonth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s,\t%d,\t%s,\t%s",name,id,birthmonth,gender);
    }
}
