import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;
import java.util.List;

public class Company extends CompanyType {
    private String code;
    private String inn;
    @SerializedName("company_type")
    private CompanyType companyType;
    private String ogrn;
    @SerializedName("egrul_date")
    private LocalDate dateCreate;
    private Country country;
    @SerializedName("fio_head")
    private String fioHead;
    private String address;
    private String phone;
    @SerializedName("e_mail")
    private String email;
    private String www;
    @SerializedName("is_resident")
    private boolean isResident;
    private List<Securities> securities;

    public void setSecurities(List<Securities> securities) {
        this.securities = securities;
    }

    public List<Securities> getSecurities() {
        return securities;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setFioHead(String fioHead) {
        this.fioHead = fioHead;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public void setResident(boolean resident) {
        isResident = resident;
    }

    public String getCode() {
        return code;
    }

    public String getInn() {
        return inn;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public String getOgrn() {
        return ogrn;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public Country getCountry() {
        return country;
    }

    public String getFioHead() {
        return fioHead;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getWww() {
        return www;
    }

    public boolean isResident() {
        return isResident;
    }

}
