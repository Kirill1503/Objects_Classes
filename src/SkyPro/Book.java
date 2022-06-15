package SkyPro;
public class Book {
    private Book(String nameAuthor, String surnameAuthor){
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    private String nameAuthor;
    private String surnameAuthor;
    private String title;
    private int yearPublication;

    public Book(String title, int yearPublication){
        this.title = title;
        this.yearPublication = yearPublication;
    }
    public String getTitle(){
        return title;
    }
    public String getNameAuthor(){
        return nameAuthor;
    }
    public String getSurnameAuthor(){
        return surnameAuthor;
    }
    public int getYearPublication(){
        return yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

}
