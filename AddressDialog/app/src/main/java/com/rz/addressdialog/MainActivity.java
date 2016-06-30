package com.rz.addressdialog;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.rz.addressdialogs.activity.AddressDialog;

public class MainActivity extends Activity implements AddressDialog.CallBacks{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddressDialog dialog = new AddressDialog();
        dialog.show(getFragmentManager(), "AddressDialog");
    }
    public void getResult(String mCurrentProviceName, String mCurrentCityName, String mCurrentDistrictName, String mCurrentZipCode)
    {
        Toast.makeText(MainActivity.this,mCurrentProviceName+"、"+mCurrentCityName+"、"+mCurrentDistrictName+"、"+
                mCurrentZipCode,Toast.LENGTH_LONG).show();
    }
}
