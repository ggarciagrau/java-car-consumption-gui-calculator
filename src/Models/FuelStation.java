/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author gerardgg
 */
public class FuelStation {

    private static ArrayList<Fuel> fuelList;

    public FuelStation() {
        fuelList = new ArrayList<Fuel>();
        fuelList.add(new Fuel("Unleaded 95", 1.316));
        fuelList.add(new Fuel("Unleaded 98", 1.475));
        fuelList.add(new Fuel("Diesel oil", 1.189));
    }

    public static ArrayList<Fuel> getFuelList() {
        return fuelList;
    }

    public static double consumptionCalc(double quantity, double distance) {
        return Math.round(distance / quantity);
    }

    public static double totalPriceCalc(double quantity, double price) {
        return Math.round(quantity * price);
    }

    public static double kmPriceCalc(double distance, double price) {
        return Math.round(distance*price);
    }
}
