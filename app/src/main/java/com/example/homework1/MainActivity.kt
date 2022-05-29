package com.example.homework1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      }
    fun PersonMe(view: View) {
        val textView: TextView = findViewById(R.id.textViewResult)
        textView.text = generateData()
    }

    private fun generateData(): String {
        val Person1 = Person("Серж", "33")
     val Person2 = Person1.copy(age = "27") // по очереди выводит на экран
        val array = arrayOf(Person1, Person2)
        val arrayIndex = nextInt(array.size)
        return array[arrayIndex].toString()
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Привет, Учитель!", Toast.LENGTH_SHORT)
        myToast.show()
    }

     fun ObjectPersonMe(view: View) {
        val textView: TextView = findViewById(R.id.textViewResult)
        textView.text = genData()
    }
    private fun genData(): String {
        val woman2 = Woman.copy(age = "17")
        val array = arrayOf(woman2)
        val arrayIndex = nextInt(array.size)
        return array[arrayIndex].toString()
    }


private fun Any.copy(age: String) {}
}






