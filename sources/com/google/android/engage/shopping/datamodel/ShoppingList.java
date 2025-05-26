package com.google.android.engage.shopping.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.engage.common.datamodel.BaseShoppingListCluster;
import com.google.android.gms.common.annotation.KeepName;
import vg.a;

@KeepName
/* loaded from: classes3.dex */
public class ShoppingList extends BaseShoppingListCluster {

    @NonNull
    public static final Parcelable.Creator<ShoppingList> CREATOR = new a(5);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int clusterType = getClusterType();
        c.O2(parcel, 1, 4);
        parcel.writeInt(clusterType);
        c.I2(parcel, 2, getTitleInternal(), false);
        c.J2(parcel, 3, getItemLabels());
        int numberOfItems = getNumberOfItems();
        c.O2(parcel, 4, 4);
        parcel.writeInt(numberOfItems);
        c.H2(parcel, 5, getActionLinkUri(), i13, false);
        c.N2(parcel, M2);
    }
}
