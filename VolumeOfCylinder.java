package com.alina.VolumeOfCylinder;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        int radiusCylindra;
        int heightCylindra;
        radiusCylindra=5;
        heightCylindra=2;
        double volumeOfCylinder = calculateVolumeOfCylinder(radiusCylindra, heightCylindra);

        System.out.println(volumeOfCylinder);
    }

    public static double calculateVolumeOfCylinder(int radius, int height) {
        double volume;
        volume = Math.PI * radius * radius * height;
        return volume;
    }
}
