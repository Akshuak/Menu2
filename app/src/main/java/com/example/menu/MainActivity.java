package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {
        switch(item.getItemId()) {
            case R.id.basty_bet:
                Toast.makeText(this, "Basty bet", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.aqparat:
                Toast.makeText(this, "Aqparat", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.forum:
                Toast.makeText(this, "Forum", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.kitaphana:
                Toast.makeText(this, "Kitaphana", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.audioo:
                Toast.makeText(this, "Audioo", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.qazaqsha:
                Toast.makeText(this, "Qazaqsha", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.agylshynsha:
                Toast.makeText(this, "Sub Qazaqsha 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.orysha:
                Toast.makeText(this, "Sub Qazaqsha 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }

}