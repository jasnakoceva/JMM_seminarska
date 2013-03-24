package ukim.finki.slagalica;


import java.util.Date;

import ukim.finki.slagalica.adapters.HighScoresAdapter;
import ukim.finki.slagalica.model.ScoreItem;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.widget.ListView;

public class HighScoresActivity extends Activity {

	private ListView ScoreItemsList;
	private HighScoresAdapter Adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_high_scores);
		loadViews();
		initList();
	}

	/**
	 * Inflates the views from the xml layout
	 */
	private void loadViews() {
		
		ScoreItemsList = (ListView) findViewById(R.id.scoresListView);
	}
	
	private void initList() {
		Adapter = new HighScoresAdapter(this);
		
		//proba
		ScoreItem it1 = new ScoreItem();
		it1.setName("Marija Maci");
		it1.setScore(3000);
		Date d = new Date();
		it1.setDate(d);
		Adapter.add(it1);
		ScoreItem it2 = new ScoreItem();
		it2.setName("Jasna ");
		it2.setScore(1000);
		Date d2 = new Date();
		it2.setDate(d2);
		Adapter.add(it2);
		ScoreItem it3 = new ScoreItem();
		it3.setName("Ivnaaaaaa ");
		it3.setScore(1000);
		Date d3 = new Date();
		it3.setDate(d3);
		Adapter.add(it3);
		ScoreItem it4 = new ScoreItem();
		it4.setName("Kateeeeee ");
		it4.setScore(1000);
		Date d4 = new Date();
		it4.setDate(d4);
		Adapter.add(it4);
		
		
		ScoreItemsList.setAdapter(Adapter);
		//ScoreItemsList.setOnItemClickListener(mAdapter);
		/*ScoreItemsList.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(TodoList.this, "Item long click",
						Toast.LENGTH_LONG).show();
				return true;
			}
		}); */

	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.high_scores, menu);
		return true;
	}

}
