package com.jags.pbm.ui.shop;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jags.pbm.Interface.selectiListner;
import com.jags.pbm.Modal.shopModal;
import com.jags.pbm.Product;
import com.jags.pbm.R;

import java.util.ArrayList;

public class ShopFragment extends Fragment implements selectiListner {
    RecyclerView shoprv;
    ArrayList<shopModal>list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop, container, false);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        shoprv.setLayoutManager(layoutManager);
        return view;
    }

    @Override
    public void onItemClicked(shopModal sm) {
        Intent intent =new Intent(getActivity(), Product.class);
        startActivity(intent);
    }
}