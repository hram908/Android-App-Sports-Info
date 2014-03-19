package com.rizal.sportsinfo;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Baseball extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] items_baseball = {"About Baseball","History","Rules","MLB"};
		setListAdapter(new ArrayAdapter<String>(Baseball.this, android.R.layout.simple_list_item_1, items_baseball));
		ListView listview = getListView();
		listview.setBackgroundResource(R.drawable.teams_baseball);
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
		
		switch(position){
		
			case 0:				
			break;
			
			case 1:			
			break;
		
			case 2:
			break;
		
			case 3:
				startActivity(new Intent(Baseball.this, BaseballLeagues.class));
			break;
		
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.baseball, menu);
		return true;
	}

}
