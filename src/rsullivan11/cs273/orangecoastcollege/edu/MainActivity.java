package rsullivan11.cs273.orangecoastcollege.edu;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    // Define button as instenced variable
    Button speakButton

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Restoring user setting from pervious session
        super.onCreate(savedInstanceState);
        // Inflating the layout called main
        setContentView(R.layout.main);

        // Hook up speakButton to one in view
        speakButton = (Button) findViewById(R.id.speakButton);
    }
}
