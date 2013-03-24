package ukim.finki.slagalica;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SlagalicaMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slagalica_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slagalica_menu, menu);
		return true;
	}
	
	 /** Called when the user clicks the newGame button */
    public void newGame(View view) {
        // Do something in response to button
    	
    	Intent intent = new Intent(this, GamesActivity.class);
    	
    	startActivity(intent);
    }
	
    /** Called when the user clicks the howToPlay button */
    public void howToPlay(View view) {
        // Do something in response to button
    	
    }

    /** Called when the user clicks the Continue button */
    public void continueGame(View view) {
        // Do something in response to button
    	
    }
    
    /** Called when the user clicks the highScores button */
    public void highScores(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, HighScoresActivity.class);
    	
    	startActivity(intent);
    }
    
    /** Called when the user clicks the menu button */
    public void menu(View view) {
        // Do something in response to button
    	
    }
    
    /** Called when the user clicks the settings button */
    public void settings(View view) {
        // Do something in response to button
    	
    }
}
