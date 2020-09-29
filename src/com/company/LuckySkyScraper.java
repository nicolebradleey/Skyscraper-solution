package com.company;

public class LuckySkyScraper {

    static public void floorList(int totalRealFloors){
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("realFloorNo: " + realFloor + " fakeFloor: " + fakeFloor);
        do{
            fakeFloor++;
            }while (fakeFloor % 10 == 4 || fakeFloor % 100 == 13);  //add one to fakeFloor and continue adding 1 as long as fakeFloor ends with 4 or 13.
        }
    }





}
