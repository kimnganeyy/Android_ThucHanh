package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> mproducts;

    public void setData(List<Product> list){
        this.mproducts = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = mproducts.get(position);
        if(product == null){
            return;
        }
        holder.imageProduct.setImageResource(product.getResourceid());
        holder.tvTitle.setText(product.getTitle());
        holder.tvPrice.setText(product.getPrice());
    }

    @Override
    public int getItemCount() {
        if (mproducts != null){
            return mproducts.size();
        }
        return 0;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageProduct;
        private TextView tvTitle;
        private TextView tvPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageProduct = itemView.findViewById(R.id.img_product);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvPrice = itemView.findViewById(R.id.tv_price);

        }
    }
}

