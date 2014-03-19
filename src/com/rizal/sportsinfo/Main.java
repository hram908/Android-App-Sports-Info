package com.rizal.sportsinfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageView main_screen = (ImageView) findViewById(R.id.main_screen);
        
        main_screen.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		startActivity(new Intent(Main.this, Welcome.class));
        	}
        });
        
   }
        
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
