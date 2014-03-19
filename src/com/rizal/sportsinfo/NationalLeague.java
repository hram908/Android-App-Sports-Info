package com.rizal.sportsinfo;

import android.net.Uri;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NationalLeague extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] items_national_league = {"Philadelphia Phillies","Houston Astros","Atlanta Braves",
				"Miami Marlins","Detroit Tigers","Arizona Diamondbacks","Seattle Mariners",
				"Minnesota Twins","Colorado Rockies","San Diego Padres","St. Louis Cardinals",
				"Cleveland Indians","Tampa Bay Rays","Pittsburgh Pirates","Cincinnati Reds",
				"Kansas City Royals","Milwaukee Brewers","",
				"                       BACK TO GAMES"};
		setListAdapter(new ArrayAdapter<String>(NationalLeague.this, 
				android.R.layout.simple_list_item_1, items_national_league));
		ListView listview = getListView();
		listview.setBackgroundResource(R.drawable.baseball_background);
	
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
		switch(position){
		
			case 0:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/phi/")));
			break;
			
			case 1:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/hou/")));
			break;
		
			case 2:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/atl/")));
			break;
		
			case 3:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/mia")));
				break;
			
			case 18:
				Intent intent = new Intent (NationalLeague.this,Welcome.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				break;
		
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.national_league, menu);
		return true;
	}

}
