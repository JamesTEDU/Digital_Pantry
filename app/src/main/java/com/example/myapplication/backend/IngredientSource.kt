package com.example.myapplication.backend

import java.util.UUID

class IngredientSource constructor(
    val id : UUID = UUID.randomUUID(),
    var name: String,
    var brand: String,
    var energy: Int,
    var energyType: String,
    var lastCost: Double
) {
}



