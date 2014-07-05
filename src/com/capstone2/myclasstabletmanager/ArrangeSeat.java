package com.capstone2.myclasstabletmanager;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ArrangeSeat extends Activity{

	
	@Override
	protected void onCreate(Bundle arrangeSeat) {
		// TODO Auto-generated method stub
		super.onCreate(arrangeSeat);
		setContentView(R.layout.seatplanarrange);
		ArrayAdapter <CharSequence> adapter =
				  new ArrayAdapter <CharSequence> (this, android.R.layout.simple_spinner_item );
				adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				adapter.add("Top-Bottom");
				adapter.add("Bottom-Top");
				adapter.add("Right-Left");
				adapter.add("Left-Right");
				
				Spinner s = (Spinner) findViewById(R.id.spinnerPattern);
				s.setAdapter(adapter);
	}

}
