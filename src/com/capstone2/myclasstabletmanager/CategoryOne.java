package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CategoryOne extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle category1) {
		// TODO Auto-generated method stub
		super.onCreate(category1);
		setContentView(R.layout.category1);
		
		Button sp = (Button)findViewById(R.id.btnSeatPlan);
		sp.setOnClickListener(this);
		
		Button gf = (Button)findViewById(R.id.btnFormula);
		gf.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnSeatPlan){
	        Intent intent = new Intent(getBaseContext(), ArrangeSeat.class);
	                    startActivity(intent);   

		}
		else if(v.getId() == R.id.btnFormula){
	        Intent intent = new Intent(getBaseContext(), GradingFormula.class);
	                    startActivity(intent);   

		}

	}

}
