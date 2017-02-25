package com.zele.sahil.fir;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnokay = (Button) findViewById(R.id.btnokay);
        btnokay.setOnClickListener(new Click());

    }

    public class Click implements View.OnClickListener
    {   @Override
        public void onClick(View v)
        {
            EditText edtanyname=(EditText) findViewById(R.id.edtanyname);
            String data=edtanyname.getText().toString();
            edtanyname.setText(data.toUpperCase());
            Log.i(TAG, data);
        }
    }
}
