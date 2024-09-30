package com.example.myapplication.backend
import java.util.Date
import java.util.UUID

class Ingredient(
                val id: UUID = UUID.randomUUID(),
                val sourceIngredient: UUID,
                var expiryDate : Date? = null,
                var remaining : Double = 1.00)
{




}