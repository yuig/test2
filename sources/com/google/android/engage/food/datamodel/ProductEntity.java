package com.google.android.engage.food.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.engage.common.datamodel.Price;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class ProductEntity extends FoodEntity {

    @NonNull
    public static final Parcelable.Creator<ProductEntity> CREATOR = new f(28);

    /* renamed from: i, reason: collision with root package name */
    public final List f30282i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30283j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30284k;

    /* renamed from: l, reason: collision with root package name */
    public final Price f30285l;

    public ProductEntity(int i13, Uri uri, Price price, Rating rating, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        super(i13, arrayList, uri, str, rating);
        this.f30283j = str2;
        this.f30284k = str3;
        if (!TextUtils.isEmpty(str3)) {
            b.j("Callout cannot be empty", !TextUtils.isEmpty(str2));
        }
        this.f30285l = price;
        this.f30282i = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int entityType = getEntityType();
        c.O2(parcel, 1, 4);
        parcel.writeInt(entityType);
        c.L2(parcel, 2, getPosterImages(), false);
        c.H2(parcel, 3, this.f30279f, i13, false);
        c.I2(parcel, 4, this.f30280g, false);
        c.H2(parcel, 5, this.f30281h, i13, false);
        c.I2(parcel, 6, this.f30283j, false);
        c.I2(parcel, 7, this.f30284k, false);
        c.H2(parcel, 8, this.f30285l, i13, false);
        c.L2(parcel, 9, this.f30282i, false);
        c.N2(parcel, M2);
    }
}
