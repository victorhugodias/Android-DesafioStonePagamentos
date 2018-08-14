package com.example.victo.virtualstore.HELPER;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.victo.virtualstore.Entitie.Product;
import com.example.victo.virtualstore.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by victo on 13/11/2017.
 */

public class ListAdapter extends ArrayAdapter<Product> {


    ArrayList<Product> products;
    Context context;
    int resource;


    public ListAdapter(Context context, int resource, ArrayList<Product> products) {
        super(context, resource, products);
        this.products = products;
        this.context = context;
        this. resource = resource;

    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout, null, true);
        }


        Product product = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewProduct);
        Picasso.with(context).load(product.getImage()).into(imageView);

        TextView txtTitle = (TextView) convertView.findViewById(R.id.txtNome);
        txtTitle.setText(product.getTitle());

        TextView txtPrice = (TextView) convertView.findViewById(R.id.txtPrice);
        txtPrice.setText(product.getFormattedPrice());

        TextView txtSeller = (TextView) convertView.findViewById(R.id.txtSeller);
        txtSeller.setText(product.getSeller());

        return convertView;
    }


}


