package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Contacts> ContactsArrayList;
    customAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact =findViewById(R.id.listViewContacts);

        ContactsArrayList = new ArrayList<>();
        ContactsArrayList.add(new Contacts("Mary",65,65442334));
        ContactsArrayList.add(new Contacts("Ken",65,97442437));

        customAdapter = new customAdapter(this,R.layout.contacts_items,ContactsArrayList);
        lvContact.setAdapter(customAdapter);

    }

}
