package demo.seer.com.androiddeployautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    public String LAG = String.valueOf(MainActivity.this);

    private Button  btnGoToNextScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnGoToNextScreen = (Button) findViewById(R.id.btnGoToNextScreen);

        btnGoToNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(MainActivity.this, NextScreenActivity.class);
                startActivity(nextScreen);
            }
        });


        Log.i(LAG, "testing git hooks");
    }
}
