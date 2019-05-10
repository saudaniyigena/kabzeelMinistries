package org.kabzeelinternationalministries.kabzeelministries;



import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //get the spinner from the xml.
        Spinner dropdown = (Spinner) findViewById(R.id.spinner2);
//create a list of items for the spinner.
        String[] items = new String[]{"Add view", "three"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);

    }

    public void changeProfile(View view){
        Intent intent = new Intent(this, ContactsContract.Profile.class);
        startActivity(intent);

    }
    public void changePassword(View view){
        Intent intent = new Intent(this, message.class);
        startActivity(intent);

    }


}