package io.github.saymondev.apptweaker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class TweakSelector extends AppCompatActivity {

    /**
     * Don't set to any number, this can cause a bug with list view...
     */

    private ListView listView;
    private String TweakName[] = new String[TweakSelectorDB.ArrayLengthCalc()];
    private String TweakDescription[] = new String[TweakSelectorDB.ArrayLengthCalc()];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweak_selector);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getTweak();

        adapter_tweak_list Custom_listView;
        Custom_listView = new adapter_tweak_list(this, TweakName, TweakDescription);


        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(Custom_listView);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});
    }

    private void getTweak() {
        if (SelectApp.globalPackageName.equals("com.whatsapp")) {
            for (int i = 0; i < TweakSelectorDB.WATweakName.length; i++) {
                TweakName[i] = TweakSelectorDB.WATweakName[i];
            }

            for (int ii = 0; ii < TweakSelectorDB.WATweakDescription.length; ii++) {
                TweakDescription[ii] = TweakSelectorDB.WATweakDescription[ii];
            }
        }
    }

}
