public class Person {
    private int id;
    private String fio;
    private Long cardNumber;
    private Long hashPass;
    private String login;

    public Person(int id, String fio, Long cardNumber, Long hashPass, String login) {
        this.id = id;
        this.fio = fio;
        this.cardNumber = cardNumber;
        this.hashPass = hashPass;
        this.login = login;
    }

    public int getID(){
        return id;
    }

    public String getFIO(){
        return fio;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public Long getHashPass(){
        return hashPass;
    }

    public void setHashPass(Long hashPass){
        this.hashPass = hashPass;
    }
}
