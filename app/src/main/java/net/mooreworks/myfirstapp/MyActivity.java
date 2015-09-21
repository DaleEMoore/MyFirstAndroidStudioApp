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
 * I stopped this project because the next step, the Action Bar, seems to be incomplete and take
 * lots of mastry to complete the code examples. I'm going to go looking for a different tutorial.
 *
 * Continue the tutorial: https://developer.android.com/training/basics/actionbar/index.html
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
 * Mon Sep 21 13:06:13 CDT 2015
 * I stopped this project because the next step, the Action Bar, seems to be incomplete and take
 * lots of mastry to complete the code examples. I'm going to go looking for a different tutorial.
 */

package net.mooreworks.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * MyActivity is the main code for my activity.
 */
public class MyActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /*
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
    */
}
