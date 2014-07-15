package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ClassDetail extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
		
		Button task = (Button)findViewById(R.id.btnTask);
		task.setOnClickListener(this);

		Button stats = (Button)findViewById(R.id.btnStats);
		stats.setOnClickListener(this);
		
		Button lec = (Button)findViewById(R.id.btnLectures);
		lec.setOnClickListener(this);
	
		Button cog = (Button)findViewById(R.id.btnCGO);
		cog.setOnClickListener(this);
		
		Button student = (Button)findViewById(R.id.btnStudent);
		student.setOnClickListener(this);
		

	
}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		/*if(v.getId() == R.id.btnTask){
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
		 }*/
		
        switch(v.getId()) {
        case R.id.btnTask:
        	 Intent intent = new Intent(getBaseContext(), Task.class);
             startActivity(intent);
        case R.id.btnStats:
        	 Intent intent1 = new Intent(getBaseContext(), Stats.class);
             startActivity(intent1);
          break;
        case R.id.btnLectures:
            //Stop MediaPlayer
          	 Intent intent2 = new Intent(getBaseContext(), Lecture.class);
               startActivity(intent2);
            break;
        case R.id.btnCGO:
            //Stop MediaPlayer
          	 Intent intent3= new Intent(getBaseContext(), ClassOverallGrade.class);
               startActivity(intent3);
            break;
        case R.id.btnStudent:
            //Stop MediaPlayer 
          	 Intent intent4 = new Intent(getBaseContext(), ViewStudent.class);
               startActivity(intent4);
            break;
      }
   }
		

}

