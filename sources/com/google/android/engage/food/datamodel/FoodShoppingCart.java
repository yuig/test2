package com.google.android.engage.food.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.engage.common.datamodel.BaseShoppingCart;
import com.google.android.gms.common.annotation.KeepName;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class FoodShoppingCart extends BaseShoppingCart {

    @NonNull
    public static final Parcelable.Creator<FoodShoppingCart> CREATOR = new f(26);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int clusterType = getClusterType();
        c.O2(parcel, 1, 4);
        parcel.writeInt(clusterType);
        c.I2(parcel, 2, getTitleInternal(), false);
        c.L2(parcel, 3, getPosterImages(), false);
        int numberOfItems = getNumberOfItems();
        c.O2(parcel, 4, 4);
        parcel.writeInt(numberOfItems);
        c.H2(parcel, 5, getActionLinkUri(), i13, false);
        c.J2(parcel, 6, getItemLabels());
        c.I2(parcel, 7, getActionTextInternal(), false);
        c.N2(parcel, M2);
    }
}
