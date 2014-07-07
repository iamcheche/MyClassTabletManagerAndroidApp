package com.capstone2.myclasstabletmanager;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;

public class HomePage extends Activity implements OnClickListener{
	 
	@Override
	protected void onCreate(Bundle homePage) {
		// TODO Auto-generated method stub
		super.onCreate(homePage);
		setContentView(R.layout.homepage); 
		
		Button logout = (Button)findViewById(R.id.btnLogOut);
			logout.setOnClickListener(this);
		
		Button ok = (Button)findViewById(R.id.btnOK);
			ok.setOnClickListener(this);
		
		Button add = (Button)findViewById(R.id.btnAdd);
			add.setOnClickListener(this);
		
		Button tutorial = (Button)findViewById(R.id.btnTutorial);
			tutorial.setOnClickListener(this);
		
		Button class1 = (Button)findViewById(R.id.btnClass1);
			class1.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 if(v.getId() == R.id.btnLogOut){
		        Intent intent = new Intent(getBaseContext(), StartingPoint.class);
		                    startActivity(intent);   

		 }
		 else if(v.getId() == R.id.btnAdd){
		        Intent intent = new Intent(getBaseContext(), NewClass.class);
		            startActivity(intent);  
		 }
		 else if(v.getId() == R.id.btnTutorial){
			 	Intent intent = new Intent(getBaseContext(), Tutorial.class);
					startActivity(intent);  
		 }
		 
		 else if(v.getId() == R.id.btnClass1){
			 	Intent intent = new Intent(getBaseContext(), Detail.class);
					startActivity(intent);  
		 }
		 
	}
}
