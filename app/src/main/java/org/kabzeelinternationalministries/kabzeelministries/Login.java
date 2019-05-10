package org.kabzeelinternationalministries.kabzeelministries;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void openMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}

