package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * checks if the city belongs in the list
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals("City belongs in the list", list.hasCity(city));
    }

    /**
     *add a city to the list
     * obtain the size of the list
     * delete the city
     * check if the size of the list is one less than before
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        int listSize = list.getCount();
        list.delete(city);
        assertEquals(list.getCount(),listSize - 1);
    }

    /**
     * add a city to the list
     * check if the count is 1
     * add one more city to the list
     * check if the size of the list is one more than before
     */
    @Test
    public void countCitiesTest(){
        list = MockCityList();
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertEquals(1, list.countCity());
        City city2 = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertEquals(2, list.countCity());
    }
}
