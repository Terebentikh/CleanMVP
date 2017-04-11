package com.appzoneltd.lastmile.customer.features.main.packageslist.viewholderfactory;

import android.view.View;

import com.appzoneltd.lastmile.customer.R;
import com.appzoneltd.lastmile.customer.features.main.packageslist.PackageViewHolder;
import com.base.abstraction.system.AppResources;

/**
 * Created by Wafaa on 12/19/2016.
 */

public class PackageReturned extends ViewHolderFactory {

    private PackageViewHolder packageViewHolder;


    public PackageReturned(PackageViewHolder viewHolder) {
        this.packageViewHolder = viewHolder;
    }

    @Override
    public void onDrawITemLayout() {
        packageViewHolder.imageBackground.setBackground(AppResources.getResources().getDrawable(R.drawable.package_list_item_top_background_yellow));
        packageViewHolder.image.setImageResource(R.drawable.returned);
    }
}