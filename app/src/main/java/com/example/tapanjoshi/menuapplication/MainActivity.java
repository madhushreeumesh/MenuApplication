package com.example.tapanjoshi.menuapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1=(TextView)findViewById(R.id.tv_getstarted);
        TextView tv2=(TextView)findViewById(R.id.tv_getaccount);

        tv1.setOnClickListener(new View.OnClickListener()
        {   public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener()
        {   public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }
        });
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu)
        {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item)
        {

            switch (item.getItemId())
            {
                case R.id.menu_save:
                    Toast.makeText(MainActivity.this, "Save is Selected", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                    return true;

                case R.id.menu_search:
                    Toast.makeText(MainActivity.this, "Search is Selected", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.menu_share:
                    Toast.makeText(MainActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
                    return true;

                default:
                    return super.onOptionsItemSelected(item);
            }
        }

    }


