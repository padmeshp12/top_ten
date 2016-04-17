package app.example.android.com.thet10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sport(View view) {
        Intent i = new Intent(MainActivity.this, sports.class);
        startActivity(i);

    }
    public void bwood(View view) {
        Intent i = new Intent(MainActivity.this, Movies.class);
        startActivity(i);

    }
    public void srs(View view) {
        Intent i = new Intent(MainActivity.this,series.class);
        startActivity(i);

    }
    public void cts(View view) {
        Intent i = new Intent(MainActivity.this,cts.class);
        startActivity(i);

    }
    public void crs(View view) {
        Intent i = new Intent(MainActivity.this,crs.class);
        startActivity(i);

    }
}
