package edu.ggc.it.direction;

import edu.ggc.it.R;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DirectionActivity extends Activity {
	private Button findButton;
	private ImageButton bldAButton;
	private ImageButton bldBButton;
	private ImageButton bldCButton;
	private ImageButton bldDButton;
	private ImageButton bldEButton;
	private ImageButton bldFButton;
	private ImageButton bldHButton;
	private ImageButton bldLButton;
	private ImageButton bldIButton;
	private ImageButton parkingButton;
	
	private Context myContext;
	
	private LocationManager lm;
	private double latitude;
	private double longitude;
	private Location loc;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_direction);
		myContext = this;
		MyListener myListener = new MyListener();
		findButton = (Button) findViewById(R.id.ButtonFindaPlace);
		findButton.setOnClickListener(myListener);

		bldAButton = (ImageButton) findViewById(R.id.bldAButton);
		bldAButton.setOnClickListener(myListener);
		
		bldBButton = (ImageButton) findViewById(R.id.bldBButton);
		bldBButton.setOnClickListener(myListener);
		
		bldCButton = (ImageButton) findViewById(R.id.bldCButton);
		bldCButton.setOnClickListener(myListener);
		
		bldDButton = (ImageButton) findViewById(R.id.bldDButton);
		bldDButton.setOnClickListener(myListener);
		
		bldEButton = (ImageButton) findViewById(R.id.bldEButton);
		bldEButton.setOnClickListener(myListener);
		
		bldFButton = (ImageButton) findViewById(R.id.bldFButton);
		bldFButton.setOnClickListener(myListener);
		
		bldHButton = (ImageButton) findViewById(R.id.bldHButton);
		bldHButton.setOnClickListener(myListener);
		
		bldLButton = (ImageButton) findViewById(R.id.bldLButton);
		bldLButton.setOnClickListener(myListener);
		
		bldIButton = (ImageButton) findViewById(R.id.bldIButton);
		bldIButton.setOnClickListener(myListener);
		
		parkingButton = (ImageButton) findViewById(R.id.parkingButton);
		parkingButton.setOnClickListener(myListener);
		
		lm = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_direction, menu);
		return true;
	}
	public class MyListener implements OnClickListener {
		@Override
		public void onClick(View view) {
			if (view.getId() == R.id.ButtonFindaPlace) {
				loc = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
				latitude = loc.getLatitude();
				longitude = loc.getLongitude();
				//EditText instr = (EditText) findViewById(R.id.instruction_text);
				TextView instr = (TextView) findViewById(R.id.instruction_text);
				instr.setText("Your location is: \n Latitude: "+latitude+"\n Longtitude: "+longitude);
				Toast.makeText(myContext, "We are building this function, will be available soon..."+latitude+" : "+longitude, 100).show();
			} else if (view.getId() == R.id.bldAButton) {
				//startActivity(new Intent(myContext, News.class));
				Toast.makeText(myContext, "You click on Building A button", 100).show();
			} else if (view.getId() == R.id.bldBButton) {
				Toast.makeText(myContext, "You click on Building B button", 100).show();
			} else if( view.getId() == R.id.bldCButton) {
				Toast.makeText(myContext, "You click on Building C button", 100).show();
			} else if( view.getId() == R.id.bldDButton) {
				Toast.makeText(myContext, "You click on Building D button", 100).show();
			} else if( view.getId() == R.id.bldEButton) {
				Toast.makeText(myContext, "You click on Building E button", 100).show();
			} else if( view.getId() == R.id.bldFButton) {
				Toast.makeText(myContext, "You click on Building Fbutton", 100).show();
			} else if( view.getId() == R.id.bldHButton) {
				Toast.makeText(myContext, "You click on Building H button", 100).show();
			} else if( view.getId() == R.id.bldIButton) {
				Toast.makeText(myContext, "You click on Building I button", 100).show();
			} else if( view.getId() == R.id.bldLButton) {
				Toast.makeText(myContext, "You click on Building L button", 100).show();
			} else if( view.getId() == R.id.parkingButton) {
				Toast.makeText(myContext, "You click on Building Parking button", 100).show();
			}

		}
	}
}