public class Person implements Comparable<Person>{
    public String fullName;
    public int age;
    Gender gender;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public int compareTo(Person o) {
        return this.getFullName().compareTo(o.getFullName());
    }

    public int compare(Person o){
        return 0;
    }
}
