package com.example.android_view_kt.fragment_tuHoc_17

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android_view_kt.R
import kotlinx.android.synthetic.main.activity_main_fragment_tu_hoc17.*

class MainActivityFragmentTuHoc17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment_tu_hoc17)
        val sub1= Fragment1tuHoc17();
        val sub2 = Fragment2tuHoc17();

//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.FrameLayout_tuHoc_17, sub1)
//            commit()
//        }
// Click vào button nào thì hiển thịFragment đó

        btn_fragment_1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FrameLayout_tuHoc_17, sub1)
                commit()
            }

        }

        btn_fragment_2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FrameLayout_tuHoc_17, sub2)
                commit()
            }

        }
    }
}