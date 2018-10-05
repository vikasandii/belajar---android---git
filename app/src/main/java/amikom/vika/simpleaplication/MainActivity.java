package amikom.vika.simpleaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonActivity, buttonFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonActivity = (Button) findViewById(R.id.fragmen2);
        buttonFragment = (Button) findViewById(R.id.fragmen1);

        buttonActivity.setOnContextClickListener());
        @Override

    }
}
