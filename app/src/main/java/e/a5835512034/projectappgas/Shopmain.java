package e.a5835512034.projectappgas;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Shopmain extends AppCompatActivity implements ItemClickListener{
    private DrawerLayout mDrawerLayout ;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    RecyclerViewAdapter adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopmain);

        String[] list = {"48 kg.","15 kg.","7 kg.","4 kg."};

        int[] image = {R.drawable.gas48kg_ptt,R.drawable.gas15kg_ptt,R.drawable.gas7kg_ptt,R.drawable.gas4kg_ptt};

        List<Actor> setv = new ArrayList<Actor>();
        for(int i=0;i< list.length;i++)
            setv.add(new Actor(list[i],image[i]));

        RecyclerView listView = findViewById(R.id.type);
        listView.setLayoutManager(new LinearLayoutManager(this));
        adap = new RecyclerViewAdapter(this,setv);
        adap.setClickListener(this);
        listView.setAdapter(adap);
        //=================================================================//

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

    public void basket(MenuItem item) {
        Intent B = new Intent(this,BasketActivity.class);
        startActivityForResult(B,1);
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
