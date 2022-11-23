package com.example.qlcaythuocnam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qlcaythuocnam.R;
import com.example.qlcaythuocnam.model.Thuoc;

import java.util.List;

public class ThuocAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Thuoc> arraylist;

    public ThuocAdapter(Context context, int layout, List<Thuoc> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }


    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflaler = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflaler.inflate(layout, null);
        Thuoc thuoc = arraylist.get(position);
        TextView tenkhoahoc = convertView.findViewById(R.id.tenkhoahoc);
        TextView tenthuongdung = convertView.findViewById(R.id.tenthuonggoi);
        TextView dactinh = convertView.findViewById(R.id.dactinh);
        TextView congdung = convertView.findViewById(R.id.congdung);
        TextView cachdung = convertView.findViewById(R.id.cachdung);
        ImageView pic = convertView.findViewById(R.id.pic);

        tenkhoahoc.setText(thuoc.getTenkhoahoc());
        tenthuongdung.setText(thuoc.getTenthuonggoi());
        dactinh.setText(thuoc.getDactinh());
        congdung.setText(thuoc.getCongdung());
        cachdung.setText(thuoc.getCachdung());
        pic.setImageResource(thuoc.getHinh());

        return convertView;
    }

}
