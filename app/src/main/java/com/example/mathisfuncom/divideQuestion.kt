package com.example.mathisfuncom


import android.util.Log

class divideQuestion {
    var firstNumber = 0
    var secondNumber = 0
    var sign = "÷"
    var answer = 0
    var level = 1
    var tempAnswer = 0


    fun divideQuestion(lvl: Int) {
        level = lvl
        firstNumber = randomNumber(lvl)
        secondNumber = randomNumber(lvl)
        answer = calAnswer(firstNumber, secondNumber)

    }

    private fun calAnswer(firstNum: Int, secondNum: Int): Int {
        tempAnswer = 0
        if(secondNum!=0 && firstNum!=0){
            if((firstNum%secondNum) != 0){
                divideQuestion(level)
            }
            else{
                tempAnswer=firstNum/secondNum
            }
        }
        else{
            divideQuestion(level)
        }
        Log.e(
            "EMRE", "1.Number: " + firstNum.toString() + "'2.Number: " + secondNumber.toString() +
                    "Sign: " + sign + "Answer: " + tempAnswer.toString()
        )
        return tempAnswer
    }


    private fun randomNumber(level: Int): Int {

        var tempNumber = 0

        if (level == 1) {
            tempNumber = (1..10).random()
        } else if (level == 2) {
            tempNumber = (1..50).random()
        } else if (level == 3) {
            tempNumber = (1..99).random()
        }

        return tempNumber
    }
}
