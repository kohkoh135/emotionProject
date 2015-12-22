
package com.example.kohkoh135.emotionproj;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button happy_butn = (Button)findViewById(R.id.happy);
        Button good_butn = (Button)findViewById(R.id.good);
        Button well_butn = (Button)findViewById(R.id.well);
        Button notbad_butn = (Button)findViewById(R.id.notbad);
        Button soso_butn = (Button)findViewById(R.id.soso);
        Button surprised_butn = (Button)findViewById(R.id.surprised);
        Button bad_butn = (Button)findViewById(R.id.bad);
        Button terrible_butn = (Button)findViewById(R.id.terrible);
        Button fuck_butn = (Button)findViewById(R.id.fuck);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        happy_butn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(MainActivity.this, "happy", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        good_butn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(MainActivity.this, "good", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        well_butn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(MainActivity.this, "well", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        notbad_butn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(MainActivity.this, "not bad", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        soso_butn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(MainActivity.this, "so so", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        surprised_butn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(MainActivity.this, "surprised", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        terrible_butn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "surprised", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        bad_butn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "bad", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        fuck_butn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "fuck", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button join_butn = (Button)findViewById(R.id.login_join);
        join_butn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_graph) {
            Intent intent = new Intent(MainActivity.this, GraphActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_advice) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_store) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
