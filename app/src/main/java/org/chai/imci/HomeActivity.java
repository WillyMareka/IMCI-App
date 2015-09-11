package org.chai.imci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.chai.imci.assessment.AssessmentActivity;
import org.chai.imci.counsel_mother.CounselMother;
import org.chai.imci.follow_up.FollowUpMain;
import org.chai.imci.hiv_care_children.NVPMain;
import org.chai.imci.treatchild.TreatTheChildActivity;

public class HomeActivity extends Activity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // referencing the buttons
        findViewById(R.id.btnAssessments).setOnClickListener(this);
        findViewById(R.id.btnFollowUp).setOnClickListener(this);
        findViewById(R.id.btnNVP).setOnClickListener(this);
        findViewById(R.id.btnTreatTheChild).setOnClickListener(this);
        findViewById(R.id.btnCounselMother).setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.help:
               /* Intent intent = new Intent(HomeActivity.this ,ScreenSlideActivity.class);
                startActivity(intent);*/
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAssessments:
                intent = new Intent(HomeActivity.this, AssessmentActivity.class);
                startActivity(intent);
                break;
            case R.id.btnFollowUp:
                intent = new Intent(HomeActivity.this, FollowUpMain.class);
                startActivity(intent);
                break;
            case R.id.btnNVP:
                intent = new Intent(HomeActivity.this, NVPMain.class);
                startActivity(intent);
                break;
            case R.id.btnTreatTheChild:
                intent = new Intent(HomeActivity.this, TreatTheChildActivity.class);
                startActivity(intent);
                break;
            case R.id.btnCounselMother:
                intent = new Intent(HomeActivity.this, CounselMother.class);
                startActivity(intent);
                break;

        }
    }
}
