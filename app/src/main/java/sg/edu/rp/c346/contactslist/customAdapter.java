package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class customAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contacts> info;


    public customAdapter(@NonNull Context context, int resource,
                         @NonNull ArrayList<Contacts> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.info = objects;
    }

    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvcode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);
        Contacts currentItem = info.get(position);
        tvName.setText(currentItem.getName());
        tvcode.setText("+"+currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNum()+"");
        return rowView;

    }

}