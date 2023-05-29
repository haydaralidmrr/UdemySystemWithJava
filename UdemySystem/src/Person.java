public class Person {
    private String name;
    private String identifyWord;
    private String userName;

    public Person(String name,String identifyWord,String userName){
        this.name=name;
        this.identifyWord=identifyWord;
        this.userName=userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifyWord() {
        return identifyWord;
    }

    public void setIdentifyWord(String identifyWord) {
        this.identifyWord = identifyWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identifyWord='" + identifyWord + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
