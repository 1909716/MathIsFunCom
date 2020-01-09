package com.example.mathisfuncom


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener

import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mathisfuncom.databinding.MenuBinding
import kotlinx.android.synthetic.main.test.*
import java.util.ArrayList

class Test : AppCompatActivity(), OnClickListener {

    private lateinit var binding: MenuBinding
    var answer = 0
    var level=0
    var cat = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        val strCat = intent.getStringExtra("Category")
        val strLevel = intent.getStringExtra("Level")
        textView2.text = strCat
        textView3.text = strLevel

        level = Integer.parseInt(strLevel)
        cat = strCat
        
        generateQuestion()
        

        btn_answer1.setOnClickListener(this)
        btn_answer2.setOnClickListener(this)
        btn_answer3.setOnClickListener(this)
        btn_answer4.setOnClickListener(this)
        }

    private fun generateQuestion(){

        if(cat=="+")
            generateAddQuestion()
        else if(cat=="-")
            generateMinusQuestion()
        else if(cat=="*")
            generateTimesQuestion()
        else if(cat=="÷")
            generateDivideQuestion()
    }
    
    private fun generateAddQuestion() {


        var question=addQuestion()
        val button = mutableSetOf<Button>(btn_answer1,btn_answer2,btn_answer3,btn_answer4)
        var answerList = ArrayList<Int>(4)
        button.shuffled()
        question.addQuestion(level)
        txt_question.text = question.firstNumber.toString() + " " + question.sign+ " " + question.secondNumber.toString()
        answer=question.answer

        answerList.clear()

        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(answer)
        answerList.shuffle()

        for (i in 0..3){
            var tempButton = button.elementAt(i)
            tempButton.text= answerList[i].toString()
            tempButton.visibility=View.VISIBLE
        }
    }

    private fun generateMinusQuestion() {


        var question=minusQuestion()
        val button = mutableSetOf<Button>(btn_answer1,btn_answer2,btn_answer3,btn_answer4)
        var answerList = ArrayList<Int>(4)
        button.shuffled()
        question.minusQuestion(level)
        txt_question.text = question.firstNumber.toString() + " " + question.sign+ " " + question.secondNumber.toString()
        answer=question.answer

        answerList.clear()

        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(answer)
        answerList.shuffle()

        for (i in 0..3){
            var tempButton = button.elementAt(i)
            tempButton.text= answerList[i].toString()
            tempButton.visibility=View.VISIBLE
        }
    }

    private fun generateTimesQuestion() {


        var question=timesQuestion()
        val button = mutableSetOf<Button>(btn_answer1,btn_answer2,btn_answer3,btn_answer4)
        var answerList = ArrayList<Int>(4)
        button.shuffled()
        question.timesQuestion(level)
        txt_question.text = question.firstNumber.toString() + " " + question.sign+ " " + question.secondNumber.toString()
        answer=question.answer

        answerList.clear()

        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(answer)
        answerList.shuffle()

        for (i in 0..3){
            var tempButton = button.elementAt(i)
            tempButton.text= answerList[i].toString()
            tempButton.visibility=View.VISIBLE
        }
    }

    private fun generateDivideQuestion() {


        var question=divideQuestion()
        val button = mutableSetOf<Button>(btn_answer1,btn_answer2,btn_answer3,btn_answer4)
        var answerList = ArrayList<Int>(4)
        button.shuffled()
        question.divideQuestion(level)
        txt_question.text = question.firstNumber.toString() + " " + question.sign+ " " + question.secondNumber.toString()
        answer=question.answer

        answerList.clear()

        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(wrongAnswer(answer))
        answerList.add(answer)
        answerList.shuffle()

        for (i in 0..3){
            var tempButton = button.elementAt(i)
            tempButton.text= answerList[i].toString()
            tempButton.visibility=View.VISIBLE
        }
    }

    private fun wrongAnswer(ans: Int): Int {
        var tempAns=0
        tempAns= (ans-10..ans+10).random()
        if (tempAns!=ans){
            return tempAns
        }else{
            return (tempAns-3)
        }

    }


    override fun onClick(v: View?) {
        v as Button

        when(v.text){

            answer.toString() -> {
                Toast.makeText(this,"Correct!", Toast.LENGTH_SHORT).show()
                generateQuestion()
            }

            else -> {
                Toast.makeText(this, "Wrong! Answer is $answer", Toast.LENGTH_SHORT).show()
                generateQuestion()
            }
        }

    }

}

