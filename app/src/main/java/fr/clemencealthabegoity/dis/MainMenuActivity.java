package fr.clemencealthabegoity.dis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onclick_start(View view) {
        startActivity(new Intent(this, ChooseActivity.class));
    }

    public void onclick_timer(View view) {
        startActivity(new Intent(this, TimerActivity.class));
    }

    public void onclick_about(View view) {

        startActivity(new Intent(this, FakeOverviewActivity.class));
    }

    public void onclick_info(View view) {
        startActivity(new Intent(this, InfoActivity.class));
    }
}
