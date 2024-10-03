package com.example.funfactsapp

import androidx.compose.material3.Text
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class FactsModelView : ViewModel() {
    private val quotes = listOf( //facts from Today.com
        "The real name for a hashtag is an octothorpe.",
        "Neil Armstrong’s hair was sold in 2004 for $3,000.",
        "The longest English word is 189,819 letters long.",
        "The tiny pocket in jeans was designed to store pocket watches.",
        "People once ate arsenic to improve their skin.",
        "The Terminator script was sold for $1.",
        "Penicillin was first called mold juice.",
        "A fear of long words is called Hippopotomonstrosesquippedaliophobia.",
        "The quickest commercial flight in the world is in Scotland.",
        "The first commercial passenger flight lasted only 23 minutes.",
        "No number before 1,000 contains the letter A.",
        "There were active volcanoes on the moon when dinosaurs were alive.",
        "Sudan has more pyramids than any country in the world.",
        "The circulatory system is more than 60,000 miles long.",
        "The Pope can’t be an organ donor.",
        "The world’s longest concert lasted 453 hours.",
        "It’s impossible to hum while holding your nose.",
        "Africa is the only continent in all four hemispheres.",
        "All mammals get goosebumps.",
        "Japan has one vending machine for every 40 people."
    )

    fun getRandomFact(): String {
        return quotes[Random.nextInt(quotes.size)]
    }
}

