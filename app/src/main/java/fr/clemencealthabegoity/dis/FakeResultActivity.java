package fr.clemencealthabegoity.dis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class FakeResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakeresult);
    }

    public void onclick_menu(View view) {
        startActivity(new Intent(this, MainMenuActivity.class));
        finish();
    }
}
