package com.marquez.poke_tinder.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.marquez.poke_tinder.R
import com.marquez.poke_tinder.data.User
import com.marquez.poke_tinder.databinding.ActivityRegisterBinding
import com.marquez.poke_tinder.util.SharedPreferenceUtil

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(ActivityRegisterBinding::inflate){
    private lateinit var sharedPreferenceUtil: SharedPreferenceUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferenceUtil = SharedPreferenceUtil().also {
            it.setSharedPreference(this)
        }
    }

    fun registerUser(view: View){
        val user = User(
            "1",
            binding.edtUserName.text.toString(),
            binding.edtEmail.text.toString(),
            binding.edtPassword.text.toString())
        sharedPreferenceUtil.saveFacebookUser(user)
        val intent = Intent(applicationContext, LoginActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
    fun loginUser(view: View){
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }
}