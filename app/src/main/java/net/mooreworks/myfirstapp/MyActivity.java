/**
 * My First App net.mooreworks.myfirstapp follow the tutorial
 * https://developer.android.com/training/basics/firstapp/building-ui.html
 * DaleEMoore@gMail.Com's early Android Studio project to get a feel for developing in AS.
 *
 * Overview:
 *  Android Studio Keyboard Shortcuts
 *  http://www.lirent.net/2013/05/android-studio-keyboard-shortcuts/
 *
 * TODO (list):
 * Continue the tutorial: https://developer.android.com/training/basics/firstapp/building-ui.html
 *
 * Figure out AS documentation. How do I do my historic infoSubject.txt files in AS?
 *      javaDoc?
 * Figure out AS version control with notes about changes.
 * Follow along a tutorial to figure out how to write code into AS.
 * Capture current date and time.
 * Compare current date and time with previous.
 * If I've had enough motion since previous date and time reset everything for next check.
 * Else popup a not that it's time to wiggle about.
 * Set date and time in the future for another motion evaluation.
 * How do I calculate motion?
 *
 * Publish a few little AS projects I will use.
 *
 * Logs:
 * Mon Sep 14 06:38:36 CDT 2015
 * Created
 *
 */

package net.mooreworks.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * MyActivity is the main code for my activity.
 */
public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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
}
