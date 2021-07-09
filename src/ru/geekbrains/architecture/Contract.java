package ru.geekbrains.architecture;

public class Contract implements Document{
    private Long id;
    private String otherCompanyName;
    private String documentNumber;
    private String documentDate;
    private Double amount;

    public Contract() {
    }

    public Contract(Long id, String otherCompanyName, String documentNumber, String documentDate, Double amount) {
        this.id = id;
        this.otherCompanyName = otherCompanyName;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.amount = amount;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getOtherCompanyName() {
        return otherCompanyName;
    }

    @Override
    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public String getDocumentDate() {
        return documentDate;
    }

    public Double getAmount() {
        return amount;
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

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
