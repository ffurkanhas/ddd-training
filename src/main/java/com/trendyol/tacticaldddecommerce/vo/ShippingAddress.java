package com.trendyol.tacticaldddecommerce.vo;

public class ShippingAddress {
    private String recipientName;
    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public ShippingAddress(String recipientName,
                           String streetAddress,
                           String city,
                           String state,
                           String postalCode,
                           String country) {
        this.recipientName = recipientName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShippingAddress that = (ShippingAddress) o;

        return recipientName.equals(that.recipientName) &&
                streetAddress.equals(that.streetAddress) &&
                city.equals(that.city) &&
                state.equals(that.state) &&
                postalCode.equals(that.postalCode) &&
                country.equals(that.country);
    }

    @Override
    public int hashCode() {
        int result = recipientName.hashCode();
        result = 51 * result + streetAddress.hashCode();
        result = 51 * result + city.hashCode();
        result = 51 * result + state.hashCode();
        result = 51 * result + postalCode.hashCode();
        result = 51 * result + country.hashCode();
        return result;
    }
}
