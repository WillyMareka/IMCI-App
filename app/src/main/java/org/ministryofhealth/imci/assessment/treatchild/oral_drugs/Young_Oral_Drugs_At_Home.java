package org.ministryofhealth.imci.assessment.treatchild.oral_drugs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.ministryofhealth.imci.R;

public class Young_Oral_Drugs_At_Home extends Activity{
	EditText ara;
	String[] fiilliste;
	Intent intent;
	// String [] fiilliste=
	// getResources().getStringArray(R.array.fragment_array_treatment);
	ArrayAdapter<String> adapter;
	private ListView vlist;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getActionBar().setHomeButtonEnabled(true);
	getActionBar().setDisplayHomeAsUpEnabled(true);
	getActionBar().setTitle("Teach mother to give oral drugs at home");
	setContentView(R.layout.young_oral_drugs_at_home);
	fiilliste = getResources().getStringArray(R.array.young_oral_drugs);

	vlist = (ListView) findViewById(R.id.list1_oral);
	adapter = new ArrayAdapter<String>(this, R.layout.simple_list_check, fiilliste);

	vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	vlist.setAdapter(adapter);
	vlist.setItemsCanFocus(true);
	// vlist.setTextFilterEnabled(true);
	vlist.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1,
				int position, long arg3) {
			super.getClass();
			// TODO Auto-generated method stub
			switch (position) {
			case 0:
				Intent intent = new Intent(getApplication(),Oral_Antibiotic.class);
				intent.putExtra("Position", 8);
				startActivity(intent);
				break;
			case 1:
				intent = new Intent(getApplication(),Oral_Antibiotic.class);
				intent.putExtra("Position", 9);
				startActivity(intent);
				break;
			
			
			}
		}

	});
	
}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		onBackPressed();
		return true;

	}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
}
}

