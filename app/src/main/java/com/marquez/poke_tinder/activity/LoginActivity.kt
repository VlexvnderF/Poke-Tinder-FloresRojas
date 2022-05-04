package com.marquez.poke_tinder.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.marquez.poke_tinder.R
import com.marquez.poke_tinder.data.User
import com.marquez.poke_tinder.databinding.ActivityLoginBinding
import com.marquez.poke_tinder.util.SharedPreferenceUtil

class LoginActivity:BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    private lateinit var sharedPreferenceUtil: SharedPreferenceUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferenceUtil= SharedPreferenceUtil().also { SharedPreferenceUtil
            it.setSharedPreference(this)
        }
    }
    fun validateInput(){
        if(binding.edtEmail.text.isEmpty() && binding.edtPassword.text.isEmpty()){
            //Agregar toast
        }
    }
    fun startLogin(view: View){
        //Validate input
        if(binding.edtEmail.text.isEmpty() && binding.edtPassword.text.isEmpty()){
            Toast.makeText(this,"No ingreso sus datos",Toast.LENGTH_SHORT).show()
            //Agregar toast
        }else if(binding.edtEmail.text.isEmpty()) {
            Toast.makeText(this, "No ingreso el correo",Toast.LENGTH_SHORT).show()
        }else if(binding.edtPassword.text.isEmpty()){
            Toast.makeText(this, "No ingreso su contraseña",Toast.LENGTH_SHORT).show()
            binding.txtVista.text = "No ingreso su contraseña"
        }else{
            val user: User? =sharedPreferenceUtil.getUser()

            if(user?.email.equals(binding.edtEmail.text.toString()) && user?.password.equals(binding.edtPassword.text.toString())){
                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("user",user)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Error de usuario",Toast.LENGTH_SHORT).show()
            }
        }

    }
}