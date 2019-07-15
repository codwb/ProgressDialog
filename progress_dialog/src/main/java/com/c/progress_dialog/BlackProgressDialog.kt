package com.c.progress_dialog

import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.TextView
import com.flyco.dialog.widget.base.BaseDialog

/**
 *   Create by cwb on 2019/5/30
 *
 *   Describe: 项目加载dialog
 */
class BlackProgressDialog(context: Context, msg: String) : BaseDialog<BlackProgressDialog>(context) {

    //dialog内容
    private var tv: TextView? = null

    private lateinit var iv: ImageView

    private var text = msg

    override fun setUiBeforShow() {
        tv?.text = text
        val loadAnimation = AnimationUtils.loadAnimation(context, R.anim.progress_rotate)
        loadAnimation.interpolator = LinearInterpolator()
        iv.startAnimation(loadAnimation)
    }

    override fun onCreateView(): View {
        widthScale(0.5f)

        val view = View.inflate(context, R.layout.black_progress_dialog, null)
        tv = view.findViewById(R.id.tv_progress_msg)
        iv = view.findViewById(R.id.iv_progress)
        return view
    }

    fun setMsg(message: String) {
        text = message
    }

    override fun show(){
        super.show()
    }
}