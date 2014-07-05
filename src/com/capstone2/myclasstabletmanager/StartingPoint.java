package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartingPoint extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle startingPoint) {
		super.onCreate(startingPoint);
		setContentView(R.layout.activity_starting_point);
		
		Button b1 = (Button) findViewById(R.id.btnOK);
        b1.setOnClickListener(this);
        
        Button b2 = (Button) findViewById(R.id.btnCancel);
        b2.setOnClickListener(this);
	}

	@Override		
	// TODO Auto-generated method stub

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnOK){
	        Intent intent = new Intent(getBaseContext(), SelectLevel.class);
	                    startActivity(intent);   

	    }else if(v.getId() == R.id.btnCancel){
	        Intent intent = new Intent(getBaseContext(), HomePage.class);
	            startActivity(intent);  
	    }
        
	}
	
	
}
