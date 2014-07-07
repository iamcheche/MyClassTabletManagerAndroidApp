package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ClassDetails extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle classDetails) {
		// TODO Auto-generated method stub
		super.onCreate(classDetails);
		setContentView(R.layout.classdetails);
		
		Button task = (Button)findViewById(R.id.btnTask);
			task.setOnClickListener(this);
	
		Button stats = (Button)findViewById(R.id.btnStats);
			stats.setOnClickListener(this);
	
		Button lec = (Button)findViewById(R.id.btnLectures);
			lec.setOnClickListener(this);
			
		Button student = (Button)findViewById(R.id.btnStudent);
			student.setOnClickListener(this);
		
		Button cog = (Button)findViewById(R.id.btnCGO);
			cog.setOnClickListener(this);
			
		Button gformula = (Button)findViewById(R.id.btnClassGrading);
			gformula.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 if(v.getId() == R.id.btnTask){
		        Intent intent = new Intent(getBaseContext(), Task.class);
		                    startActivity(intent);   

		 }
		 else if(v.getId() == R.id.btnStats){
		        Intent intent = new Intent(getBaseContext(), Stats.class);
		            startActivity(intent);  
		 }
		 else if(v.getId() == R.id.btnLectures){
			 	Intent intent = new Intent(getBaseContext(), Lecture.class);
					startActivity(intent);  
		 }
		 else if(v.getId() == R.id.btnCGO){
			 	Intent intent = new Intent(getBaseContext(), ClassOverallGrade.class);
					startActivity(intent);  
		 }
		 else if(v.getId() == R.id.btnGFormula){
			 	Intent intent = new Intent(getBaseContext(), GradingFormula.class);
					startActivity(intent);  
		 }
		 
	}

	
}
