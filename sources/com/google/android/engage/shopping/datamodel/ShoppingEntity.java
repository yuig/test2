package com.google.android.engage.shopping.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.engage.common.datamodel.Entity;
import com.google.android.engage.common.datamodel.Price;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;
import vg.a;

@KeepName
/* loaded from: classes3.dex */
public class ShoppingEntity extends Entity {

    @NonNull
    public static final Parcelable.Creator<ShoppingEntity> CREATOR = new a(4);

    /* renamed from: f, reason: collision with root package name */
    public final List f30297f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f30298g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30299h;

    /* renamed from: i, reason: collision with root package name */
    public final String f30300i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30301j;

    /* renamed from: k, reason: collision with root package name */
    public final Price f30302k;

    /* renamed from: l, reason: collision with root package name */
    public final Rating f30303l;

    public ShoppingEntity(int i13, Uri uri, Price price, Rating rating, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        super(i13, arrayList);
        b.j("Action link Uri cannot be empty", uri != null);
        this.f30298g = uri;
        this.f30299h = str;
        this.f30300i = str2;
        this.f30301j = str3;
        if (!TextUtils.isEmpty(str3)) {
            b.j("Callout cannot be empty", true ^ TextUtils.isEmpty(str2));
        }
        this.f30302k = price;
        this.f30303l = rating;
        this.f30297f = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int entityType = getEntityType();
        c.O2(parcel, 1, 4);
        parcel.writeInt(entityType);
        c.L2(parcel, 2, getPosterImages(), false);
        c.H2(parcel, 3, this.f30298g, i13, false);
        c.I2(parcel, 4, this.f30299h, false);
        c.I2(parcel, 5, this.f30300i, false);
        c.I2(parcel, 6, this.f30301j, false);
        c.H2(parcel, 7, this.f30302k, i13, false);
        c.H2(parcel, 8, this.f30303l, i13, false);
        c.L2(parcel, 9, this.f30297f, false);
        c.N2(parcel, M2);
    }
}
