package com.example.myapplication.backend

class IngredientSource(
    val id: Int, var name: String, var brand: String, var energy: Int,
    var energyType: String, var lastCost: Double
) {
    private val Id = id
    private var LastCost = lastCost
    private var EnergyType = energyType
    private var Energy = energy
    private var Brand = brand
    private var Name = name


}