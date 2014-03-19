package com.rizal.sportsinfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Welcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		ImageButton football = (ImageButton) findViewById(R.id.football);        
        football.setOnClickListener(new OnClickListener(){        	
        	public void onClick(View v) {
        		startActivity(new Intent(Welcome.this, Football.class));
        	}
        });
        
        ImageButton hockey = (ImageButton) findViewById(R.id.hockey);        
        hockey.setOnClickListener(new OnClickListener(){        	
        	public void onClick(View v) {
        		startActivity(new Intent(Welcome.this, Hockey.class));
        	}
        });
        
        ImageButton soccer = (ImageButton) findViewById(R.id.soccer);        
        soccer.setOnClickListener(new OnClickListener(){        	
        	public void onClick(View v) {
        		startActivity(new Intent(Welcome.this, Soccer.class));
        	}
        });
        
        ImageButton baseball = (ImageButton) findViewById(R.id.baseball);        
        baseball.setOnClickListener(new OnClickListener(){        	
        	public void onClick(View v) {
        		startActivity(new Intent(Welcome.this, Baseball.class));
        	}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}
