package com.google.android.engage.food.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import vg.a;

@KeepName
/* loaded from: classes3.dex */
public class StoreEntity extends FoodEntity {

    @NonNull
    public static final Parcelable.Creator<StoreEntity> CREATOR = new a(0);

    /* renamed from: i, reason: collision with root package name */
    public final String f30291i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30292j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30293k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30294l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30295m;

    public StoreEntity(int i13, ArrayList arrayList, Uri uri, String str, Rating rating, String str2, String str3, String str4, String str5, String str6) {
        super(i13, arrayList, uri, str, rating);
        this.f30291i = str2;
        this.f30292j = str3;
        this.f30293k = str4;
        this.f30294l = str5;
        if (!TextUtils.isEmpty(str5)) {
            b.j("Callout cannot be empty", !TextUtils.isEmpty(str4));
        }
        this.f30295m = str6;
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
        c.I2(parcel, 6, this.f30291i, false);
        c.I2(parcel, 7, this.f30292j, false);
        c.I2(parcel, 8, this.f30293k, false);
        c.I2(parcel, 9, this.f30294l, false);
        c.I2(parcel, 10, this.f30295m, false);
        c.N2(parcel, M2);
    }
}
