package com.makeeasy.myplaces;

public class Place {
    private String name;
    private String address;
    private GeoPoint position;
    private String photo;
    private PlaceType type;
    private int phone;
    private String url;
    private String comment;
    private long date;
    private float assessment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GeoPoint getPosition() {
        return position;
    }

    public void setPosition(GeoPoint position) {
        this.position = position;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public float getAssessment() {
        return assessment;
    }

    public void setAssessment(float assessment) {
        this.assessment = assessment;
    }

    public PlaceType getType() {
        return type;
    }

    public void setType(PlaceType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", position=" + position +
                ", photo='" + photo + '\'' +
                ", type=" + type +
                ", phone=" + phone +
                ", url='" + url + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", assessment=" + assessment +
                '}';
    }


    public Place(String name, String address, double latitude, double longitude, PlaceType type, int phone, String url, String comment, float assessment) {
        this.name = name;
        this.address = address;
        this.position = new GeoPoint(latitude,longitude);
        //this.photo = photo;
        this.type = type;
        this.phone = phone;
        this.url = url;
        this.comment = comment;
        this.date = System.currentTimeMillis();
        this.assessment = assessment;
    }


}