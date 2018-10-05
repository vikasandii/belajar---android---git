package amikom.vika.simpleaplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.prefs.Preferences;

import amikom.vika.simpleaplication.MainActivity;
import amikom.vika.simpleaplication.util.PreferencesHelper;

public class SplashScreen extends AppCompatActivity {
    PreferencesHelper instantance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    instantance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (!intance.isLogin)} {
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                }
            }, splashInterval);

    }
}
