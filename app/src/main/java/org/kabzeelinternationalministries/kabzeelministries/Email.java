package org.kabzeelinternationalministries.kabzeelministries;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.util.Pattern;
import android.support.view.view;
import android.support.widget.EditText;
import android.support.widget.ProgressBar;
import android.support.widget.Toast;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.google.android.gms;
import com.google.android.gms;
import com.google.android.task.Task;
import com.google.android.auth.AuthResult;
import com.google.android.auth.FirebaseAuth;
import com.google.android.auth.FirebaseDatabase;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private  EditText editTextName ,editTextEmail,editTextPassword,editTextPhone;
    private ProgressBar ProgressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextUserame = findViewById(R.id.edit_text_username);
        editTextPassword = findViewById(R.id.edit_text_password);
        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.GONE);

        mAuth =FirebaseAuth.getInstance();

        findViewById(R.id.button_register).setOnClickListener(this);


    }
    @Override
    protected void onStart(){
        super.onStart();
        if (mAuth.getCurrentUser())!=null){
            //handle the already login user
        }

    }
    private void registerUser(){

        final String username = editTextName.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();

        if (username.isEmpty()){
            editTextUserame.setError(getString(R.string.input_error_username));
            editTextUsername.requestFocus();
            return;
        }

        if (password.isEmpty()){
            editTextPassword.setError(getString(R.string.input_error_password_lenght));
            editTextPassword.requestFocus();
            return;
        }
        if (password.length() < 6){
            editTextPassword.setError(getString(R.string.input_error_password_lenght));
            editTextPassword.requestFocus();
            return;

        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithUsernameAndPassword(username ,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>(){
                    @Override
                    public  void onComplete(@NonNull Task<kAuthResult> task){

                        if (task.isSuccessful()){
                            User user = new User(
                                    username,
                                    password,


                                    );
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                ProgressBar.setVisibility(View.GONE);
                                If(task.isSuccessfully()) {
                                    Toast.makeText(MainActivity.this.getString(R.string.registration_success), Toast.LENGTH_LONG).show();
                                } else{
                                    //display a failure message
                                }
                            }
                        });



                    }else{
                        Toast.makeText(MainActivity.this.task.getExpectation(),Toast.LENGTH_LONG).show();
                    }
                }

    });


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_register:
                registerUser();
                break;
        }
    }
}
