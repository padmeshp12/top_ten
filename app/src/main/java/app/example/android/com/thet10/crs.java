package app.example.android.com.thet10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class crs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crs);
    }
    public void sdn(View view){
        Intent i =new Intent(crs.this,sdn.class);
        startActivity(i);
    }
    public void hbk(View view){
        Intent j =new Intent(crs.this,hbk.class);
        startActivity(j);
    }
    public void suv(View view){
        Intent k =new Intent(crs.this,suv.class);
        startActivity(k);
    }
}
