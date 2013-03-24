package ukim.finki.slagalica;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class GamesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_games);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.games, menu);
		return true;
	}


	public void association(View view) {
		
		
	}
	

	public void quiz(View view) {
		
		
	}
	
	public void connections(View view) {
		
		
	}
	
	public void backToMainMenu(View view) {
		
		Intent intent = new Intent(this, SlagalicaMenu.class);
    	
    	startActivity(intent);
	}
	
	
}
