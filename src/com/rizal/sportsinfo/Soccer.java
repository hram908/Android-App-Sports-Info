package com.rizal.sportsinfo;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Soccer extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] items_soccer = {"About Soccer","History","Rules","MLS"};
		setListAdapter(new ArrayAdapter<String>(Soccer.this, 
				android.R.layout.simple_list_item_1, items_soccer));
		
		ListView listview = getListView();
		listview.setBackgroundResource(R.drawable.soccer_background);
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
		switch(position){
		
			case 0:				
			break;
			
			case 1:			
			break;
		
			case 2:
				startActivity(new Intent(Soccer.this, SoccerRules.class));
			break;
		
			case 3:
			break;
		
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.soccer, menu);
		return true;
	}

}
