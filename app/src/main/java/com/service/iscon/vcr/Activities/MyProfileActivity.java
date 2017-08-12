package com.service.iscon.vcr.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.service.iscon.vcr.Handler.MyDBHelper;
import com.service.iscon.vcr.Model.UserInfo;
import com.service.iscon.vcr.R;

public class MyProfileActivity extends AppCompatActivity {

    EditText et_email,et_full_name,et_contact,et_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        et_email=(EditText)findViewById(R.id.et_email);
        et_full_name=(EditText)findViewById(R.id.et_full_name);
        et_contact=(EditText)findViewById(R.id.et_contact);
        et_city=(EditText)findViewById(R.id.et_city);

        MyDBHelper db = new MyDBHelper(this);
        UserInfo mUserInfo = db.getUserInfo();

        if(mUserInfo.getEmail()!=null){
            et_email.setText(mUserInfo.getEmail());
        }
        if(mUserInfo.getFullName()!=null){
            et_full_name.setText(mUserInfo.getFullName());
        }

        if(mUserInfo.getMobile()!=null){
            et_contact.setText(mUserInfo.getMobile());
        }
        /*if(mUserInfo.getEmail()!=null){
            et_city.setText(mUserInfo.getEmail());
        }
*/
        et_email.setEnabled(false);
        et_full_name.setEnabled(false);
        et_contact.setEnabled(false);
        et_city.setEnabled(false);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Contact us to update your details.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
