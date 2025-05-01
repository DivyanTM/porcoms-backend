package com.divyan.porcoms_backend.Models;

public class Application {

    private String applicationNumber;
    private String status;
    private String commodityDescription;
    private String hscCode;
    private String CountryOfOrigin;
    private String CountryOfDestination;
    private String invoiceValue;
    private String typeofApplication;

    public Application(){

    }

    public Application(String applicationNumber,String commodityDescription,String hscCode,String CountryOfOrigin,String CountryOfDestination,String invoiceValue,String typeofApplication,String status){
        this.applicationNumber=applicationNumber;
        this.commodityDescription=commodityDescription;
        this.hscCode=hscCode;
        this.CountryOfOrigin=CountryOfOrigin;
        this.CountryOfDestination=CountryOfDestination;
        this.invoiceValue=invoiceValue;
        this.typeofApplication=typeofApplication;
        this.status=status;
    }

    public String getCommodityDescription() {
        return commodityDescription;
    }

    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }

    public String getHscCode() {
        return hscCode;
    }

    public void setHscCode(String hscCode) {
        this.hscCode = hscCode;
    }

    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        CountryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfDestination() {
        return CountryOfDestination;
    }

    public void setCountryOfDestination(String countryOfDestination) {
        CountryOfDestination = countryOfDestination;
    }

    public String getInvoiceValue() {
        return invoiceValue;
    }

    public void setInvoiceValue(String invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public String getTypeofApplication() {
        return typeofApplication;
    }

    public void setTypeofApplication(String typeofApplication) {
        this.typeofApplication = typeofApplication;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
