package com.nyp.sit.dit.it2107.intermediatemovierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.review, menu)
        return super.onCreateOptionsMenu(menu)
    }
}