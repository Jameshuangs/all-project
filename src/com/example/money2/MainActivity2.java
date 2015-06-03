package com.example.money2;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;


public class MainActivity2 extends Activity {
	EditText date2;
	EditText dollar2;
	EditText detail2;
	Button clear;
	Button enter;
	

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        
        clear=(Button)findViewById(R.id.clear);
        enter=(Button)findViewById(R.id.enter);
        date2=(EditText)findViewById(R.id.date2);
        dollar2=(EditText)findViewById(R.id.dollar2);
        detail2=(EditText)findViewById(R.id.detail2);

        Intent intent = this.getIntent();


        clear.setOnClickListener( new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				date2.setText("");
				dollar2.setText("");
				detail2.setText("");
			}
			
        });
        
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}