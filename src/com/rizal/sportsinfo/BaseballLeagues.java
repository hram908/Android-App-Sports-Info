package com.rizal.sportsinfo;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BaseballLeagues extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] baseball_leagues = {"American League","National League","",
				"                       BACK TO GAMES"};
		setListAdapter(new ArrayAdapter<String>(BaseballLeagues.this, 
				android.R.layout.simple_list_item_1, baseball_leagues));
		ListView listview = getListView();
		listview.setBackgroundResource(R.drawable.baseball_background);		
		
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
		switch(position){
		
			case 0:
				startActivity(new Intent(BaseballLeagues.this, AmericanLeague.class));
				break;
			
			case 1:
				startActivity(new Intent(BaseballLeagues.this, NationalLeague.class));
				break;
			case 3:
				Intent intent = new Intent (BaseballLeagues.this,Welcome.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.baseball_leagues, menu);
		return true;
	}

}
