package com.example.myapplication.backend

import android.util.Size
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test
import kotlin.collections.ArrayList

class IngredientSourceTest {

    private var testCollections = IngredientSourceCollections(ArrayList<IngredientSource>())

    private var testIngredient = IngredientSource(id = 123,
        brand = "testBrand",
        energy = 1000,
        energyType = "cal",
        lastCost = 9.27,
        name = "testFood")
    @Test
    fun getId() {
        assertEquals(testIngredient.id, 123)
    }

    @Test
    fun getName() {
        assertEquals(testIngredient.name,"testFood")
    }

    @Test
    fun setName() {
        testIngredient.name = "foodChange"
        assertEquals(testIngredient.name,"foodChange")
    }

    @Test
    fun getBrand() {
        assertEquals(testIngredient.brand,"testBrand")
    }

    @Test
    fun setBrand() {
        testIngredient.brand = "brandChange"
        assertEquals(testIngredient.brand,"brandChange")
    }

    @Test
    fun getEnergy() {
        assertEquals(testIngredient.energy,1000)
    }

    @Test
    fun setEnergy() {
        testIngredient.energy = 900
        assertEquals(testIngredient.energy,900)
    }

    @Test
    fun getEnergyType() {
        assertEquals(testIngredient.energyType,"cal")
    }

    @Test
    fun setEnergyType() {
        testIngredient.energyType = "kj"
        assertEquals(testIngredient.energyType,"kj")
    }

    @Test
    fun getLastCost() {
        assertEquals(testIngredient.lastCost, 9.27,1e-15)
    }

    @Test
    fun setLastCost() {
        testIngredient.lastCost = 27.52
        assertEquals(testIngredient.lastCost,27.52,1e-15)

    }

    @Test
    fun add() {
        val x = testCollections.size()
        testCollections.add(testIngredient)
        assertNotEquals(x, testCollections.size())
    }

    @Test
    fun getValue() {
        testCollections.add(testIngredient)
        val compareSource = testCollections.getIngredient(123)
        assertEquals(compareSource,testIngredient)
    }

    @Test
    fun remove() {
        testCollections.remove(testIngredient.id)
        AssertionError(testCollections.getIngredient(testIngredient.id))
    }


}
class IngredientTest {

    @Before
    fun setUp() {

    }


}