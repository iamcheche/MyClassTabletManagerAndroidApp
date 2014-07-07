package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewClass extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle newClass) {
		// TODO Auto-generated method stub
		super.onCreate(newClass);
		setContentView(R.layout.newclass); 
		
		Button grade = (Button)findViewById(R.id.btnClassGrading);
			grade.setOnClickListener(this);

		Button seat = (Button)findViewById(R.id.btnSeatPlan);
			seat.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnClassGrading){
	        Intent intent = new Intent(getBaseContext(), GradingFormula.class);
	                    startActivity(intent);   

	 }
	 else if(v.getId() == R.id.btnSeatPlan){
	        Intent intent = new Intent(getBaseContext(), SeatPlanCategory.class);
	            startActivity(intent);  
	 }
	}
	

}
