package com.example.myapplication.backend

import java.util.UUID

class IngredientSourceCollections(private var ingredients: MutableMap<UUID, IngredientSource>){

    // This is a terrible way to do this. Ingredients should give an id to the item
    fun add(ingredient: IngredientSource) {
        this.ingredients[ingredient.id] = ingredient
    }


    fun getIngredient(id: UUID): IngredientSource? {
        return ingredients[id]
    }

    fun remove(id: UUID) {
        this.ingredients.remove(id)
    }

    fun size(): Int {
        return ingredients.size
    }

}

