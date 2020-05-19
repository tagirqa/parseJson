import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class Securities {
    private String id;
    private String code;
    @SerializedName("name_full")
    private String nameFull;
    private String cfi;
    @SerializedName("date_to")
    private LocalDate dateTo;
    @SerializedName("state_reg_date")
    private LocalDate regDate;
    private State state;
    private Currency currency;


    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public void setCfi(String cfi) {
        this.cfi = cfi;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getNameFull() {
        return nameFull;
    }

    public String getCfi() {
        return cfi;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public State getState() {
        return state;
    }

    public Currency getCurrency() {
        return currency;
    }



}
