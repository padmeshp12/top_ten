package app.example.android.com.thet10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
    }
    public void cket(View view){
        Intent i =new Intent(sports.this,cricket.class);
        startActivity(i);
    }
    public void fball(View view){
        Intent j =new Intent(sports.this,fball.class);
        startActivity(j);
    }
    public void bball(View view){
        Intent k =new Intent(sports.this,basketball.class);
        startActivity(k);
    }
}
