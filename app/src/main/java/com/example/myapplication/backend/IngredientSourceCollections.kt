package com.example.myapplication.backend

class IngredientSourceCollections (private var ingredients : ArrayList<IngredientSource>){

    // This is a terrible way to do this. Ingredients should give an id to the item
    // TODO: Setup an auto-incrementing system that means collections handles the id
    // TODO: Potentially replace system for dictionary, probably easier to do with JSON
    fun add(ingredient: IngredientSource) {
        this.ingredients.add(ingredient)
    }


    fun getIngredient(id: Int): IngredientSource? {
        return ingredients.find { x -> id == x.id }
    }

    fun remove(id: Int) {
        this.ingredients.removeIf { x -> id == x.id }
    }

    fun size(): Int {
        return ingredients.size
    }

}

