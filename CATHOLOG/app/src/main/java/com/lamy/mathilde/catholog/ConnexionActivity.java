package com.lamy.mathilde.catholog;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class ConnexionActivity extends AppCompatActivity {

    private EditText edtMail;
    private EditText edtPassword;
    private EditText edtConfirmation;
    private Button btnConnexion;
    private FirebaseAuth auth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(ConnexionActivity.this, MenuActivity.class));
            finish();
        }


        edtMail = (EditText) findViewById(R.id.editTextMail);
        edtPassword = (EditText) findViewById(R.id.editTextPassword);
        btnConnexion = (Button) findViewById(R.id.buttonConnexion);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


        final String mail = edtMail.getText().toString();
        final String password = edtPassword.getText().toString();


        btnConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = edtMail.getText().toString();
                final String password = edtPassword.getText().toString();

                if (TextUtils.isEmpty(mail)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);



                //authenticate user
                auth.signInWithEmailAndPassword(mail, password)
                        .addOnCompleteListener(ConnexionActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        edtPassword.setError(getString(R.string.minimum_password));
                                    } else {
                                        Toast.makeText(ConnexionActivity.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                                    }
                                } else {
                                    Intent intent = new Intent(ConnexionActivity.this, MapsActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });
            }



        });


    }

}

