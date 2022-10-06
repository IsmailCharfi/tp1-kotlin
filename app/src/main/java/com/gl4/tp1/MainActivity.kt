package com.gl4.tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var txtEmail: EditText;
    private lateinit var txtPass: EditText;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEmail = findViewById(R.id.editTextEmail);
        txtPass = findViewById(R.id.editTextPassword);
    }


    override fun onClick(p0: View?) {
        val email = txtEmail.text.toString();
        val password = txtPass.text.toString();
        if (p0?.id == R.id.btnLogin) {
            if (email == "gl4@insat.tn" && password == "1234") {
                val text = "Bienvenu";
                val duration = Toast.LENGTH_SHORT;

                val toast = Toast.makeText(applicationContext, text, duration);
                toast.show();
                val intent = Intent(p0.context, WelcomeActivity::class.java);
                intent.putExtra("email", email);
                startActivity(intent);
            } else {
                val text = "email $email ou mot de passe $password sont invalides";
                val duration = Toast.LENGTH_SHORT;

                val toast = Toast.makeText(applicationContext, text, duration);
                toast.show();
            }

        }
    }
}
