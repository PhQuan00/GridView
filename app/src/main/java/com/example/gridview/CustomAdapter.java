package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private Context ctx;
    private int layout;
    private ArrayList<Cat> arrayList;

    public CustomAdapter(Context ctx, int layout, ArrayList<Cat> arrayList) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;
        if(view==null){
            view = LayoutInflater.from(ctx).inflate(layout,viewGroup,false);

            viewHolder = new ViewHolder();

            viewHolder.tvName = view.findViewById(R.id.tvName);
            viewHolder.tvreducePercent = view.findViewById(R.id.tvreducePercent);
            viewHolder.tvpeppleRate = view.findViewById(R.id.tvpeopleRate);
            viewHolder.tvnewPrice = view.findViewById(R.id.tvnewPrice);
            viewHolder.imgCat = view.findViewById(R.id.imgCat);
            viewHolder.rtBar= view.findViewById(R.id.rtBar);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tvName.setText(arrayList.get(i).getName());
        viewHolder.tvnewPrice.setText(String.valueOf(arrayList.get(i).getNewPrice()));
        viewHolder.tvpeppleRate.setText(String.valueOf(arrayList.get(i).getPeopleRate()));
        viewHolder.tvreducePercent.setText(String.valueOf(arrayList.get(i).getReducePercent()));

        viewHolder.imgCat.setImageResource(arrayList.get(i).getImageCat());
        viewHolder.rtBar.setRating(arrayList.get(i).getRate());
        return view;
    }

    private class ViewHolder {
        TextView tvName;
        TextView tvnewPrice;
        TextView tvpeppleRate;
        TextView tvreducePercent;
        ImageView imgCat;
        RatingBar rtBar;
    }
}
