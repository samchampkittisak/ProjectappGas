package e.a5835512034.projectappgas;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class Shopmain extends AppCompatActivity {
    private DrawerLayout mDrawerLayout ;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(Shopmain.this,
                mDrawerLayout,
                R.string.open_drawer,
                R.string.close_drawer);
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menumain, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }


    public void logout(MenuItem item) {
        Intent back = new Intent(this,MainActivity.class);
        startActivityForResult(back,1);
    }

    public void gotobuyonline(MenuItem item) {
        Intent buyonline = new Intent(this,Buyonline.class);
        startActivityForResult(buyonline,1);
    }

    public void status(MenuItem item) {
        Intent s = new Intent(this,StatusTrack.class);
        startActivityForResult(s,1);
    }

    public void Purch(MenuItem item) {
        Intent P = new Intent(this,Purchase.class);
        startActivityForResult(P,1);
    }

    public void gotonews(MenuItem item) {
        Intent N = new Intent(this,News.class);
        startActivityForResult(N,1);
    }

    public void gotoData(MenuItem item) {
        Intent D = new Intent(this,Datacom.class);
        startActivityForResult(D,1);
    }

    public void gotohelp(MenuItem item) {
        Intent H = new Intent(this,Helps.class);
        startActivityForResult(H,1);
    }
}
