package com.mcacarrers.testapp1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onToggleClick(View view) {
        TextView textView = (TextView) findViewById(R.id.myTextView);
        boolean on = ((ToggleButton) view).isChecked();
        if(on)
            textView.setText("On Toggle Selected");
        else
            textView.setText("On Toggle Disabled");
    }

    public void onCbClicked(View view) {

        boolean on = ((CheckBox) view).isChecked();

        switch ( view.getId() )
        {
            case R.id.cbMilk:
                if(on)
                    Toast.makeText(getApplicationContext(),"Milk Checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Milk UnChecked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cbSugar:
                if(on)
                    Toast.makeText(getApplicationContext(),"Sugar Checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Sugar UnChecked",Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void onRBClicked(View view) {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();

        switch (id) {
            case R.id.rbMale:
                //
                break;
            case R.id.rbFemale:
                //
                break;
        }
    }
}
