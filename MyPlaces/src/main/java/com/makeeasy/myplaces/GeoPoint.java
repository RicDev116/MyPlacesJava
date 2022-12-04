package com.makeeasy.myplaces;

import java.util.Objects;

public class GeoPoint {

    private double latitude,longitude;

    static public GeoPoint SIN_POSICION = new GeoPoint(0.0,0.0);

    public GeoPoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GeoPoint{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public double distance(GeoPoint point){
        final double EARTH_RADIUS = 6371000; //EN METROS
        double dLat = Math.toRadians(latitude - point.latitude);
        double dLong = Math.toRadians(longitude - point.longitude);
        double lat1= Math.toRadians(point.latitude);
        double lat2= Math.toRadians(latitude);

        double a  = Math.sin(dLat/2) * Math.sin(dLat/2) +
                    Math.sin(dLong/2) * Math.sin(dLong/2) *
                    Math.cos(lat1) * Math.cos(lat2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c  * EARTH_RADIUS;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public static GeoPoint getSinPosicion() {
        return SIN_POSICION;
    }

    public static void setSinPosicion(GeoPoint sinPosicion) {
        SIN_POSICION = sinPosicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoPoint geoPoint = (GeoPoint) o;
        return Double.compare(geoPoint.latitude, latitude) == 0 && Double.compare(geoPoint.longitude, longitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
}
