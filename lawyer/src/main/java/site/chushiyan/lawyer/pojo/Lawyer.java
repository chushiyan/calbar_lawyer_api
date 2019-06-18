package site.chushiyan.lawyer.pojo;

public class Lawyer {
    private String number;

    private String name;

    private String licenseStatus;

    private String city;

    private String admissionDate;

    private String address;

    private String county;

    private String phoneNumber;

    private String faxNumber;

    private String email;

    private String lawSchool;

    private String claSections;

    private String certifiedLegalSpecialty;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus == null ? null : licenseStatus.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber == null ? null : faxNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLawSchool() {
        return lawSchool;
    }

    public void setLawSchool(String lawSchool) {
        this.lawSchool = lawSchool == null ? null : lawSchool.trim();
    }

    public String getClaSections() {
        return claSections;
    }

    public void setClaSections(String claSections) {
        this.claSections = claSections == null ? null : claSections.trim();
    }

    public String getCertifiedLegalSpecialty() {
        return certifiedLegalSpecialty;
    }

    public void setCertifiedLegalSpecialty(String certifiedLegalSpecialty) {
        this.certifiedLegalSpecialty = certifiedLegalSpecialty == null ? null : certifiedLegalSpecialty.trim();
    }
}