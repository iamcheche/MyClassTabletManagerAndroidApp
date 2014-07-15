package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SeatPlanCategory extends Activity implements OnClickListener{

	
	@Override
	protected void onCreate(Bundle spCat) {
		// TODO Auto-generated method stub
		super.onCreate(spCat);
		setContentView(R.layout.seatcategory);
		
		Button cat1 = (Button)findViewById(R.id.btnCat1);
			cat1.setOnClickListener(this);
			
		Button cat2 = (Button)findViewById(R.id.btnCat2);
			cat2.setOnClickListener(this);
			
		Button cat3 = (Button)findViewById(R.id.btnCat3);
			cat3.setOnClickListener(this);
			
		Button cat4 = (Button)findViewById(R.id.btnCat4);
			cat4.setOnClickListener(this);
			
		Button cat5 = (Button)findViewById(R.id.btnCat5);
			cat5.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnCat1){
	        Intent intent = new Intent(getBaseContext(), CategoryOne.class);
	            startActivity(intent);   
		}
	 else if(v.getId() == R.id.btnCat2){
	        Intent intent = new Intent(getBaseContext(), CategoryTwo.class);
	            startActivity(intent);  
	 	}
	 else if(v.getId() == R.id.btnCat3){
		 	Intent intent = new Intent(getBaseContext(), CategoryThree.class);
				startActivity(intent);  
	 	}
	 else if(v.getId() == R.id.btnCat4){
		 	Intent intent = new Intent(getBaseContext(), CategoryFour.class);
				startActivity(intent);  
	 	}
	 else if(v.getId() == R.id.btnCat5){
		 	Intent intent = new Intent(getBaseContext(), CategoryFive.class);
				startActivity(intent);  
	 	}
	}

}
