package com.capstone2.myclasstabletmanager;

//import java.util.ArrayList;
//import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.ArrayAdapter;
import android.widget.Button;
//import android.widget.ListView;

public class HomePage extends Activity implements OnClickListener{

	 //private ListView lv;
	 
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
		
		/*ListView lv = (ListView) findViewById(R.id.lvClass);
		lv.setOnItemClickListener((OnItemClickListener) this);

         List<String> class_array = new ArrayList<String>();
         class_array.add("English101");
         class_array.add("Speech101");
         class_array.add("CommArts101");
         
         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                 this, 
                 android.R.layout.simple_list_item_1,
                 class_array );

         lv.setAdapter(arrayAdapter); */
		
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
			 	Intent intent = new Intent(getBaseContext(), ClassDetails.class);
					startActivity(intent);  
		 }
		 
	}

	/*public void onItemClick(AdapterView<?> l, View v, int position, long id) {
            // Then you start a new Activity via Intent
            Intent intent = new Intent();
            intent.setClass(this, ClassDetails.class);
            intent.putExtra("position", position);
            // Or / And
            intent.putExtra("id", id);
            startActivity(intent);
    }*/
}
