package io.github.saymondev.apptweaker;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by saymon on 08/12/16.
 */

public class adapter_tweak_list extends ArrayAdapter<String> {
    private String[] names;
    private String[] descriptions;
    private Activity context;

    public adapter_tweak_list(Activity context, String[] names, String[] descriptions) {
        super(context, R.layout.list_view_tweak_list, names);
        this.context = context;
        this.names = names;
        this.descriptions = descriptions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view_tweak_list, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.tweak_name);
        TextView textViewValue = (TextView) listViewItem.findViewById(R.id.tweak_description);

        textViewName.setText(names[position]);
        textViewValue.setText(descriptions[position]);
        return  listViewItem;
    }

}
