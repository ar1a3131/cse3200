package com.example.k2025_02_01.model

class AllQuestions {

    public val allQuestions = arrayOf(
        Question<Boolean>("Mitochondria is the powerhouse of the cell.", true, Difficulty.EASY),
        Question<Boolean>("China is the country with the largest population",false,Difficulty.MEDIUM),
        Question<Int>("What year was the United States born?",1776,Difficulty.EASY),
        Question<Int>("2+2=_?",4,Difficulty.EASY),
        Question<String>("The highest award in computing is named after Alan _____ ", "Turing", Difficulty.EASY),
        Question<String>("What is the capital of New York?","Albany", Difficulty.EASY)
    )

    fun totalQuestions() : Int {
        return allQuestions.size
    }
}