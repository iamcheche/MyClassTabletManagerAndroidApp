package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Category2 extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle category2) {
		// TODO Auto-generated method stub
		super.onCreate(category2);
		setContentView(R.layout.category2);
		
		Button sp = (Button)findViewById(R.id.btnSeatPlan);
		sp.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnSeatPlan){
	        Intent intent = new Intent(getBaseContext(), ArrangeSeat.class);
	                    startActivity(intent);   

	 }
	}

}
