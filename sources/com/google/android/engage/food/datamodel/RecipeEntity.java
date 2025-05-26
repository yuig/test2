package com.google.android.engage.food.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class RecipeEntity extends FoodEntity {

    @NonNull
    public static final Parcelable.Creator<RecipeEntity> CREATOR = new f(29);

    /* renamed from: i, reason: collision with root package name */
    public final String f30286i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30287j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30288k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30289l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30290m;

    public RecipeEntity(int i13, ArrayList arrayList, Uri uri, String str, Rating rating, String str2, String str3, String str4, String str5, String str6) {
        super(i13, arrayList, uri, str, rating);
        this.f30286i = str2;
        this.f30287j = str3;
        this.f30288k = str4;
        this.f30289l = str5;
        this.f30290m = str6;
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
        c.I2(parcel, 6, this.f30286i, false);
        c.I2(parcel, 7, this.f30287j, false);
        c.I2(parcel, 8, this.f30288k, false);
        c.I2(parcel, 9, this.f30289l, false);
        c.I2(parcel, 10, this.f30290m, false);
        c.N2(parcel, M2);
    }
}
