package com.gmd.referenceapplication;

import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;

/**
 * Created by gmd on 6/9/2016.
 */
public class ListViewItem {
    public int icon;
    public Spanned value;
    public Spanned unit;
    public String title;
    public Spanned uncertainty;
    Spanned spandValue = Html.fromHtml("Value: ");
    Spanned spandUnit = Html.fromHtml("<br>Unit: ");
    Spanned spandUncertainty = Html.fromHtml("<br>Standard Uncertainty: ");

    public ListViewItem(){
        super();
    }

//can put in 4th parameter for uncertainty, will need to add into data sets
    public ListViewItem(int icon, String title, Spanned value, Spanned unit, Spanned uncertainty) {
        super();
        this.icon = icon;
        this.title = title;
        this.value=value;
        this.unit=unit;
        this.uncertainty=uncertainty;
    }

    public String getKey(){
        return title;
    }

    public String getValueS() {return value.toString();}

    public String getUnit() {return unit.toString();}

    public String getUncertainty() {return uncertainty.toString();}


    @Override
    public String toString() {
        return "Value: " + this.value + "\nUnits:  " + this.unit + "\nStandard Uncertainty:  " + this.uncertainty;
    }

    public Spanned toSpanned() {

        return (Spanned) TextUtils.concat(spandValue , this.value , spandUnit , this.unit , spandUncertainty , this.uncertainty);
    }

}
