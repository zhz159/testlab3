package tests;

import android.test.ActivityInstrumentationTestCase2;
import com.example.max.testproject.*;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;

/**
 * Created by max on 4/19/2016.
 */
public class Junit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public Junit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
