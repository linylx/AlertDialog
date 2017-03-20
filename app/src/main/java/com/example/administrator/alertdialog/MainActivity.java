package com.example.administrator.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText editTextuser=null;
    EditText editTextpassword=null;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editTextuser=(EditText)findViewById(R.id.user);
        editTextpassword=(EditText)findViewById(R.id.passward);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View myLoginView = layoutInflater.inflate(R.layout.login, null);
        Dialog alertDialog = new AlertDialog.Builder(MainActivity.this,AlertDialog.THEME_DEVICE_DEFAULT_DARK).
                setTitle("RNOIONO APP").
                setView(myLoginView).
                setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (editTextuser==null && editTextpassword==null){
                            Toast.makeText(MainActivity.this,"请输入信息", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if (editTextpassword!=null && editTextuser.getText().toString().equals("")){
                            Toast.makeText(MainActivity.this,"请输入帐号", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if (editTextuser!=null && editTextpassword.getText().toString().equals("")){
                            Toast.makeText(MainActivity.this,"请输入密码", Toast.LENGTH_SHORT).show();
                            return;
                        }

                    }
                }).
                setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).
                create();
        alertDialog.show();
    }
}

