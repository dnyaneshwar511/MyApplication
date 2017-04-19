package imt.com.in.mygithubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OneMain extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_main);

        Toast.makeText(OneMain.this, "Ok", Toast.LENGTH_SHORT).show();

    }
}
