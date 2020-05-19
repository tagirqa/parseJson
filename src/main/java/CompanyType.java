import com.google.gson.annotations.SerializedName;

public class CompanyType {
    private int id;
    @SerializedName("name_full")
    private String nameFull;
    @SerializedName("name_short")
    private String nameShort;

    public void setId(int id) {
        this.id = id;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public int getId() {
        return id;
    }

    public String getNameFull() {
        return nameFull;
    }

    public String getNameShort() {
        return nameShort;
    }
}
