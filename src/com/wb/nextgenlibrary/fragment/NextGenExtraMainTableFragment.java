package com.wb.nextgenlibrary.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.wb.nextgenlibrary.NextGenExperience;
import com.wb.nextgenlibrary.R;
import com.wb.nextgenlibrary.activity.ECGalleryActivity;
import com.wb.nextgenlibrary.activity.ECSceneLocationActivity;
import com.wb.nextgenlibrary.activity.ECVideoActivity;
import com.wb.nextgenlibrary.activity.TheTakeShopCategoryActivity;
import com.wb.nextgenlibrary.activity.WebViewActivity;
import com.wb.nextgenlibrary.data.MovieMetaData;
import com.wb.nextgenlibrary.data.MovieMetaData.ExperienceData;
import com.wb.nextgenlibrary.util.utils.F;

import java.util.List;

/**
 * Created by gzcheng on 1/13/16.
 */
public class NextGenExtraMainTableFragment extends NextGenGridViewFragment {


    public final static int GRID_SPACING_DP = 10;
    protected List<ExperienceData> ecGroups = getSourceData();

    protected List<ExperienceData> getSourceData(){
        return NextGenExperience.getMovieMetaData().getExtraECGroups();
    }

    protected void onListItemClick(View v, int position, long id){
        ExperienceData selectedGroup = ecGroups.get(position);
        Intent intent = null;
        if (selectedGroup.getECGroupType() == MovieMetaData.ECGroupType.FEATURETTES) {
            intent = new Intent(getActivity(), ECVideoActivity.class);
        }else if (selectedGroup.getECGroupType() == MovieMetaData.ECGroupType.LOCATIONS){
            intent = new Intent(getActivity(), ECSceneLocationActivity.class);
        }else if (selectedGroup.getECGroupType() == MovieMetaData.ECGroupType.EXTERNAL_APP){
            if (selectedGroup.getExternalApp() != null){
                if (selectedGroup.getExternalApp().externalApiName.equals(MovieMetaData.THE_TAKE_MANIFEST_IDENTIFIER)){
                    intent = new Intent(getActivity(), TheTakeShopCategoryActivity.class);

                }
            }
        }else if (selectedGroup.getECGroupType() == MovieMetaData.ECGroupType.GALLERY){
            intent = new Intent(getActivity(), ECGalleryActivity.class);
        }else if (selectedGroup.getECGroupType() == MovieMetaData.ECGroupType.INTERACTIVE){
            intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra(F.URL, selectedGroup.interactiveItems.get(0).assetLocation);
        }

        if (intent != null) {
            intent.setAction(Intent.ACTION_VIEW);
            intent.putExtra(F.ID, getListItemAtPosition(position).experienceId);
            intent.putExtra(F.TITLE, selectedGroup.title);
            startActivity(intent);
        }
    }

    protected int getNumberOfColumns(){
        return 2;
    }

    protected int getListItemCount() {
        return ecGroups.size();
    }

    protected ExperienceData getListItemAtPosition(int i) {
        return ecGroups.get(i);
    }

    protected int getListItemViewId() {
        return R.layout.next_gen_extra_right_item;
    }

    protected int getStartupSelectedIndex(){
        return -1;
    }

    protected void fillListRowWithObjectInfo(int position, View rowView, Object item, boolean isSelected) {


        ImageView thumbnailImg = (ImageView) rowView.findViewById(R.id.next_gen_extra_thumbnail);
        TextView titleTxt = (TextView) rowView.findViewById(R.id.next_gen_extra_title);

        ExperienceData thisExtra = (ExperienceData)item;
        if(!thisExtra.title.equals(titleTxt.getText())){
            titleTxt.setText(thisExtra.title.toUpperCase());
            Glide.with(getActivity()).load(thisExtra.getPosterImgUrl()).fitCenter().into(thumbnailImg);
            //PicassoTrustAll.loadImageIntoView(getActivity(), thisExtra.getPosterImgUrl(), thumbnailImg);
        }
    }

    protected String getHeaderText(){
        return "";
    }

    protected int getHeaderChildenCount(int header){
        return getListItemCount();
    }

    protected int getHeaderCount(){
        return 0;
    }
}
