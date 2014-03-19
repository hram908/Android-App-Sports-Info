package com.rizal.sportsinfo;

import android.net.Uri;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AmericanLeague extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] items_american_league = {"New York Mets","New York Yankees",
				"Los Angeles Dodgers","Los Angeles Angels","Chicago Cubs","Chicago White Sox",
				"Washington Nationals","Baltimore Orioles","Boston Red Sox","San Francisco Giants",
				"Oakland Athletics","Texas Rangers","",
				"                       BACK TO GAMES"};
		setListAdapter(new ArrayAdapter<String>(AmericanLeague.this, 
				android.R.layout.simple_list_item_1, items_american_league));
		ListView listview = getListView();
		listview.setBackgroundResource(R.drawable.baseball_background);
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
		switch(position){
		
			case 0:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/nym/")));
				break;
			
			case 1:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/nyy/")));
				break;
		
			case 2:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/lad/")));
				break;
		
			case 3:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://m.mlb.com/laa")));
				break;
			
			case 13:
				Intent intent = new Intent (AmericanLeague.this,Welcome.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.american_league, menu);
		return true;
	}

}
