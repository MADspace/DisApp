package fr.clemencealthabegoity.dis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ChooseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        View cook = findViewById(R.id.cook);
    }

    public void onclick_cook(View view) {
        startActivity(new Intent(this, DisconnectedActivity.class));
        finish();
    }

}
