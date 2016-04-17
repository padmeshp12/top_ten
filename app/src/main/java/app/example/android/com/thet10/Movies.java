package app.example.android.com.thet10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Movies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
    }
    public void hwood(View view){
        Intent i =new Intent(Movies.this,hwood.class);
        startActivity(i);
    }
    public void bwood(View view){
        Intent j =new Intent(Movies.this,bwood.class);
        startActivity(j);
    }
    public void anm(View view){
        Intent k =new Intent(Movies.this,anm.class);
        startActivity(k);
    }
}
