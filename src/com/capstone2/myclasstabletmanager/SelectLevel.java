package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectLevel extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle selectLevel) {
		// TODO Auto-generated method stub
		super.onCreate(selectLevel);
		setContentView(R.layout.level); 
		
		Button primary = (Button)findViewById(R.id.btnPrim);
			primary.setOnClickListener(this);
		Button secondary = (Button)findViewById(R.id.btnSec);
			secondary.setOnClickListener(this);
		Button tertiary = (Button)findViewById(R.id.btnTer);
			tertiary.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnPrim){
	        Intent intent = new Intent(getBaseContext(), HomePage.class);
	            startActivity(intent);   
		}
	 else if(v.getId() == R.id.btnSec){
	        Intent intent = new Intent(getBaseContext(), HomePage.class);
	            startActivity(intent);  
	 	}
	 else if(v.getId() == R.id.btnTer){
		 	Intent intent = new Intent(getBaseContext(), HomePage.class);
				startActivity(intent);  
	 	}
		
	}
	
}
