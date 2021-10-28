package com.example.exercicio05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add){
            Toast.makeText(this, R.string.add_message, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.edit){
            Toast.makeText(this, R.string.edit_message, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.remove){
            Toast.makeText(this, R.string.remove_message, Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.help){
            Toast.makeText(this, R.string.help_message, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}