package com.capstone2.myclasstabletmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LoadingIntroduction extends Activity{

	@Override
	protected void onCreate(Bundle loadInterface) {
		// TODO Auto-generated method stub
		super.onCreate(loadInterface);
		setContentView(R.layout.loading); 
		
		Thread countdown = new Thread(){
			public void run(){
				try{
					sleep(3000);
				} catch(InterruptedException e){
					e.printStackTrace();
				} finally{
					Intent openStartingPoint = new Intent("com.capstone2.myclasstabletmanager.STARTINGPOINT");
					startActivity(openStartingPoint);
				}
			}
		};
		countdown.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
		
}
