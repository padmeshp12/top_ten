package app.example.android.com.thet10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cts);
    }
    public void cst(View view){
        Intent i =new Intent(cts.this,cst.class);
        startActivity(i);
    }
    public void lgt(View view){
        Intent j =new Intent(cts.this,lgt.class);
        startActivity(j);
    }
    public void rct(View view){
        Intent k =new Intent(cts.this,rct.class);
        startActivity(k);
    }
}
