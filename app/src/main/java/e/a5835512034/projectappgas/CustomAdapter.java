package e.a5835512034.projectappgas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by 5835512034 on 4/19/2018.
 */

public class CustomAdapter extends BaseAdapter{
    Context context;
    String [] list;
    private TextView tvName;

    public CustomAdapter(Context applicationContext, String[] list) {
        context = applicationContext;
        this.list =  list;
    }

    @Override
    public int getCount() {    return  list.length;    }

    @Override
    public Object getItem(int position) {     return list[position];    }

    @Override
    public long getItemId(int position) {   return position;    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(view == null)
            view = mInflater.inflate(R.layout.listview_row, parent, false);

        tvName = view.findViewById(R.id.tvName);
        tvName.setText(list[position]);
        return view;
    }
}
