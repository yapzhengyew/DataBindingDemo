package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student ("W123","Alex")

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //binding.tvStudentid.text = student.studentID
        //binding.tvStudentname.text = student.studentName

        //easy to input alot of data
        binding.myData = student

        binding.btnUpdate.setOnClickListener(){

            student.studentName = "John"

            //binding.tvStudentname.text = student.studentName

            //better way, easy read, save code
            binding.apply {

                invalidateAll()
            }


        }
    }
}