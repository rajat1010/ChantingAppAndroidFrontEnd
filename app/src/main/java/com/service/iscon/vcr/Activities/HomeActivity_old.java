package com.service.iscon.vcr.Activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class HomeActivity_old extends AppCompatActivity
 {

    TextView nav_name, nav_total_round, nav_last_login;

    int minteger = 0,mintegertwo=0;
    int totalround=0,totalbead=0;
    TextView displayCount,totalrounds,totalbeads;
    //MediaPlayer object
    static MediaPlayer mPlayer;
    Button btn_finish;

    ImageView chantbtn;
    String str_totakbead;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View header=navigationView.getHeaderView(0);

        nav_name = (TextView)header.findViewById(R.id.nav_name);
        nav_total_round = (TextView)header.findViewById(R.id.nav_total_round);
        nav_last_login = (TextView)header.findViewById(R.id.nav_last_login);
        btn_finish=(Button)findViewById(R.id.btn_finish);
        chantbtn=(ImageView)findViewById(R.id.btn_chant);
         displayCount = (TextView) findViewById(
                 R.id.todays_count);
         totalrounds = (TextView) findViewById(
                 R.id.todays_round);
         totalbeads = (TextView) findViewById(
                 R.id.todays_beads);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
*/
/*
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
*//*


                long date = System.currentTimeMillis();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = sdf.format(date);
                String binder="T";

                SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
                String dateString1 = sdf2.format(date);
                String startTime=dateString+binder+dateString1;

                System.out.println("Start time1"+dateString);

                System.out.println("Start time2"+dateString1);
                System.out.println("Start time3"+startTime);





                minteger = minteger + 1;
                totalbead=totalbead+1;

                display(minteger);
                displaybead(totalbead);
            }


        });
        // save values in db
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // // Save in DB and need to reset all values like count,beads,rounds

               // Callwebservice:,http://139.59.56.139:8080/chantingapprest-0.0.1-SNAPSHOT/rest/user/save_new_chanting_session

                jsoncall();

         */
/*       {"userName":"test@yahoo.com","password" :"test","chantingSessionDate" :"2017-02-27T13:23:21",
                        "chantingSessionStartTime":"2017-02-27T16:23:21","chantingSessionEndTime":"2017-02-27T18:42:21",
                        "numberOfBeads":"265"}
*//*


               // http://ec2-54-190-12-192.us-west-2.compute.amazonaws.com:8080/chantingapprest-0.0.1-SNAPSHOT/rest/user/save_new_chanting_session




            }
        });

        // play audio on chant btn click

        chantbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //When Om chant is not playing
                    if (mPlayer==null || !mPlayer.isPlaying()) {
                        //Set button background image as 'Pause'
                       chantbtn.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.button_blue_pause));
                        //Create MediaPlayer object with raw resource 'om.mp3'
                        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hkmm);
                        //Start playing mp3
                        mPlayer.start();
                        //Set player to be looping to continuously play om.mp3
                        mPlayer.setLooping(true);
                    } else {
                        //When Om chant is playing
                        if (mPlayer != null && mPlayer.isPlaying()) {
                            //Set button background image as 'Play'
                            chantbtn.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.iconpause));
                            //Stop playing om.mp3
                            mPlayer.stop();
                        }
                    }
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                  //  Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                //    Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

     */
/*   MyDBHelper db = new MyDBHelper(HomeActivity.this);
        UserInfo mUserInfo = db.getUserInfo();
        if (mUserInfo != null) {
            if (mUserInfo.getFullName() != null)
                nav_name.setText(mUserInfo.getFullName());
            if (mUserInfo.getLastLogin() != null)
                nav_last_login.setText("Last Login: " + mUserInfo.getLastLogin());
        }*//*

    }

    public void jsoncall() {
*/
/*Post data*//*

        Map<String, String> jsonParams = new HashMap<String, String>();


      //  final String URL = "http://ec2-54-190-12-192.us-west-2.compute.amazonaws.com:8080/chantingapprest-0.0.1-SNAPSHOT/rest/user/save_new_chanting_session";
// Post params to be sent to the server
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("userName", "Sushma");
        params.put("password", "Sushma123");
        params.put("chantingSessionDate", "2017-03-24T13:23:21");
        params.put("chantingSessionStartTime", "2017-03-24T13:23:21");
        params.put("chantingSessionEndTime", "2017-03-24T14:30:54");
        params.put("numberOfBeads", str_totakbead);


        JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST,"http://139.59.56.139:8080/chantingapprest-0.0.1-SNAPSHOT/rest/user/save_new_chanting_session",new JSONObject(jsonParams),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("Json Response", response.toString());
                        //  pd.dismiss();

                        String      chantingSessionSaved= null;
                        try {
                            chantingSessionSaved = response.getString("chantingSessionSaved");
                            message=response.getString("technicalStatus");
                            String    responseCode=response.getString("responseCode");

                            System.out.println("Response:----");

                            System.out.println("message...."+message);
                            System.out.println("responseCode...."+responseCode);
                            System.out.println("chantingSessionSaved...."+chantingSessionSaved);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

*/
/*
                        {
                            "technicalStatus": "SUCCESS",
                                "responseCode": "0",
                                "chantingSessionSaved": true
                        }
*//*


                        if(message.equals("Success")){
                            Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                            System.out.println("USER ALL DETAILS WEBSERVICE");
                            }
                        else{
                            Toast.makeText(getApplicationContext(), "Data could not save!", Toast.LENGTH_SHORT).show();
                        }
                        }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //   Handle Error
                    }
                }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json; charset=utf-8");
                headers.put("User-agent", System.getProperty("http.agent"));
                return headers;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(HomeActivity.this);
        requestQueue.add(postRequest);
    }
    private void display(int number) {
        displayCount.setText("" + number);
        if(minteger%10==0){
            totalround=totalround + 1;
            totalrounds. setText("" + totalround);
            minteger=0;
            displayCount.setText("" + minteger);
        }

    }
    private void displaybead(int totalbead) {
        totalbeads.setText(""+totalbead);
         str_totakbead=Integer.toString(totalbead);
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
        getMenuInflater().inflate(R.menu.home, menu);
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
        Intent i = new Intent();
        if (id == R/.id.nav_home) {
            // Handle the camera action
            i = new Intent(this, RegistrationActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_history) {
            i = new Intent(this, HistoryActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_about_us) {
            i = new Intent(this, AboutActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_setting) {
            i = new Intent(this, SettingsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_sign_out) {
            //call service to logout

            //clearing local storage
            MyDBHelper db = new MyDBHelper(this);
            db.clearUser();

            i = new Intent(this, LoginActivity.class);
            startActivity(i);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
*/
    }
}
