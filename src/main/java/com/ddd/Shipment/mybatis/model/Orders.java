package com.ddd.Shipment.mybatis.model;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.RECEIVER_NAME
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String receiverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.RECEIVER_NUMBER
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String receiverNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.RECEIVER_EMAIL
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String receiverEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.SENDER_ADDRESS_ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private Integer senderAddressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.RECEIVER_CITY
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String receiverCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.RECEIVER_ADDRESS
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String receiverAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.RECEIVER_POSTAL_CODE
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String receiverPostalCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.PARCEL_INFO_ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private Integer parcelInfoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.TRACKING_NUMBER
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String trackingNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ORDERS.ADDITIONAL_INFO
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    private String additionalInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.ID
     *
     * @return the value of PUBLIC.ORDERS.ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.ID
     *
     * @param id the value for PUBLIC.ORDERS.ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.RECEIVER_NAME
     *
     * @return the value of PUBLIC.ORDERS.RECEIVER_NAME
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.RECEIVER_NAME
     *
     * @param receiverName the value for PUBLIC.ORDERS.RECEIVER_NAME
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.RECEIVER_NUMBER
     *
     * @return the value of PUBLIC.ORDERS.RECEIVER_NUMBER
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getReceiverNumber() {
        return receiverNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.RECEIVER_NUMBER
     *
     * @param receiverNumber the value for PUBLIC.ORDERS.RECEIVER_NUMBER
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.RECEIVER_EMAIL
     *
     * @return the value of PUBLIC.ORDERS.RECEIVER_EMAIL
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getReceiverEmail() {
        return receiverEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.RECEIVER_EMAIL
     *
     * @param receiverEmail the value for PUBLIC.ORDERS.RECEIVER_EMAIL
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.SENDER_ADDRESS_ID
     *
     * @return the value of PUBLIC.ORDERS.SENDER_ADDRESS_ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public Integer getSenderAddressId() {
        return senderAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.SENDER_ADDRESS_ID
     *
     * @param senderAddressId the value for PUBLIC.ORDERS.SENDER_ADDRESS_ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setSenderAddressId(Integer senderAddressId) {
        this.senderAddressId = senderAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.RECEIVER_CITY
     *
     * @return the value of PUBLIC.ORDERS.RECEIVER_CITY
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.RECEIVER_CITY
     *
     * @param receiverCity the value for PUBLIC.ORDERS.RECEIVER_CITY
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.RECEIVER_ADDRESS
     *
     * @return the value of PUBLIC.ORDERS.RECEIVER_ADDRESS
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.RECEIVER_ADDRESS
     *
     * @param receiverAddress the value for PUBLIC.ORDERS.RECEIVER_ADDRESS
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.RECEIVER_POSTAL_CODE
     *
     * @return the value of PUBLIC.ORDERS.RECEIVER_POSTAL_CODE
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getReceiverPostalCode() {
        return receiverPostalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.RECEIVER_POSTAL_CODE
     *
     * @param receiverPostalCode the value for PUBLIC.ORDERS.RECEIVER_POSTAL_CODE
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setReceiverPostalCode(String receiverPostalCode) {
        this.receiverPostalCode = receiverPostalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.PARCEL_INFO_ID
     *
     * @return the value of PUBLIC.ORDERS.PARCEL_INFO_ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public Integer getParcelInfoId() {
        return parcelInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.PARCEL_INFO_ID
     *
     * @param parcelInfoId the value for PUBLIC.ORDERS.PARCEL_INFO_ID
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setParcelInfoId(Integer parcelInfoId) {
        this.parcelInfoId = parcelInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.TRACKING_NUMBER
     *
     * @return the value of PUBLIC.ORDERS.TRACKING_NUMBER
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.TRACKING_NUMBER
     *
     * @param trackingNumber the value for PUBLIC.ORDERS.TRACKING_NUMBER
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ORDERS.ADDITIONAL_INFO
     *
     * @return the value of PUBLIC.ORDERS.ADDITIONAL_INFO
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ORDERS.ADDITIONAL_INFO
     *
     * @param additionalInfo the value for PUBLIC.ORDERS.ADDITIONAL_INFO
     *
     * @mbg.generated Sat May 08 13:31:26 EEST 2021
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}