package app.example.android.com.thet10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class series extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
    }
    public void comedy(View view){
        Intent i =new Intent(series.this,comedy.class);
        startActivity(i);
    }
    public void shrs(View view){
        Intent j =new Intent(series.this,shrs.class);
        startActivity(j);
    }
    public void anm(View view){
        Intent k =new Intent(series.this,anime.class);
        startActivity(k);
    }
}
