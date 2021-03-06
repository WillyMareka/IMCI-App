package org.ministryofhealth.imci.assessment.follow_up;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.follow_up.starter.Follow_UpMainTwo;
import org.ministryofhealth.imci.assessment.follow_up.starter.Infant_Follow_UpMain;

public class FollowUpMain extends Activity implements View.OnClickListener {
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		setContentView(R.layout.activity_follow_up);
		findViewById(R.id.two_months).setOnClickListener(this);
		findViewById(R.id.sixty_months).setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
switch (v.getId()){
	case R.id.two_months:
		intent = new Intent(FollowUpMain.this,Infant_Follow_UpMain.class);
		startActivity(intent);
		break;
	case R.id.sixty_months:
		intent = new Intent(FollowUpMain.this,Follow_UpMainTwo.class);
		startActivity(intent);
		break;
}
	}
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("----Fragmentactivity---onStart---");
		overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		onBackPressed();
		return true;

	}
}
