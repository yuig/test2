package com.google.android.engage.common.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.engage.food.datamodel.FoodReorderCluster;
import com.google.android.engage.food.datamodel.FoodShoppingCart;
import com.google.android.engage.food.datamodel.FoodShoppingList;
import com.google.android.engage.shopping.datamodel.ShoppingCart;
import com.google.android.engage.shopping.datamodel.ShoppingList;
import com.google.android.engage.shopping.datamodel.ShoppingReorderCluster;
import d7.b0;
import pk.h1;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f30277a;

    static {
        b0 a13 = h1.a();
        a13.e(1, RecommendationCluster.CREATOR);
        a13.e(2, FeaturedCluster.CREATOR);
        a13.e(3, ContinuationCluster.CREATOR);
        a13.e(4, ShoppingCart.CREATOR);
        a13.e(5, FoodReorderCluster.CREATOR);
        a13.e(6, FoodShoppingCart.CREATOR);
        a13.e(7, FoodShoppingList.CREATOR);
        a13.e(8, EngagementCluster.CREATOR);
        a13.e(9, ShoppingList.CREATOR);
        a13.e(10, ShoppingReorderCluster.CREATOR);
        f30277a = a13.a();
    }

    public static BaseCluster a(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        while (parcel.dataPosition() < parcel.dataSize()) {
            try {
                int readInt = parcel.readInt();
                char c13 = (char) readInt;
                if (c13 == 1) {
                    int h03 = bf.b.h0(parcel, readInt);
                    parcel.setDataPosition(dataPosition);
                    Parcelable.Creator creator = (Parcelable.Creator) f30277a.get(Integer.valueOf(h03));
                    if (creator != null) {
                        return (BaseCluster) creator.createFromParcel(parcel);
                    }
                    throw new IllegalArgumentException("Invalid input Parcel");
                }
                bf.b.p0(parcel, c13);
            } catch (RuntimeException e13) {
                throw new IllegalArgumentException("Invalid input Parcel", e13);
            }
        }
        throw new IllegalArgumentException("Invalid input Parcel");
    }
}
