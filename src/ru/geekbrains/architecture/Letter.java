package ru.geekbrains.architecture;

public class Letter implements Document{
    private Long id;
    private String otherCompanyName;
    private String documentNumber;
    private String documentDate;
    private String description;

    public Letter() {
    }

    public Letter(Long id, String otherCompanyName, String documentNumber, String documentDate, String description) {
        this.id = id;
        this.otherCompanyName = otherCompanyName;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.description = description;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String getOtherCompanyName() {
        return null;
    }

    @Override
    public String getDocumentNumber() {
        return null;
    }

    @Override
    public String getDocumentDate() {
        return null;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOtherCompanyName(String otherCompanyName) {
        this.otherCompanyName = otherCompanyName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
