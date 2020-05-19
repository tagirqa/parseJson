import com.google.gson.annotations.SerializedName;

public class Currency {
    private int id;
    private String code;
    @SerializedName("name_short")
    private String nameShort;
    @SerializedName("name_full")
    private String nameFull;

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getNameShort() {
        return nameShort;
    }

    public String getNameFull() {
        return nameFull;
    }


}
