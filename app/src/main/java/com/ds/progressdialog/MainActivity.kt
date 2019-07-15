package com.ds.progressdialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.c.progress_dialog.BlackProgressDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_dialog.setOnClickListener {
            val dialog = BlackProgressDialog(this, "正在加载中...")
            dialog.show()
        }
    }
}
