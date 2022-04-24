
public class Birds {

    private String nameEnglish;
    private String nameLatin;
    private int count;

    public Birds(String nameEnglish, String nameLatin) {
        this.nameEnglish = nameEnglish;
        this.nameLatin = nameLatin;
    }

    public String getNameEnglish() {
        return this.nameEnglish;
    }

    public String getNameLatin() {
        return this.nameLatin;
    }

    public int getCount() {
        return this.count++;
    }

    public String toString() {
        return this.nameEnglish + " (" + this.nameLatin + "): " + this.count + " observations";
    }
}
