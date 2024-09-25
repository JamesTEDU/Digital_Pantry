package com.example.myapplication.backend

class IngredientSourceCollections(private var ingredients: MutableMap<Int, IngredientSource>){

    // This is a terrible way to do this. Ingredients should give an id to the item
    fun add(ingredient: IngredientSource) {
        this.ingredients[ingredient.id] = ingredient
    }


    fun getIngredient(id: Int): IngredientSource? {
        return ingredients[id]
    }

    fun remove(id: Int) {
        this.ingredients.remove(id)
    }

    fun size(): Int {
        return ingredients.size
    }

}

