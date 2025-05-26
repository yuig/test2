package com.google.android.engage.books.datamodel;

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
import java.util.List;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class BookSeriesEntity extends BookEntity {

    @NonNull
    public static final Parcelable.Creator<BookSeriesEntity> CREATOR = new f(11);

    /* renamed from: n, reason: collision with root package name */
    public final List f30253n;

    /* renamed from: o, reason: collision with root package name */
    public final String f30254o;

    /* renamed from: p, reason: collision with root package name */
    public final List f30255p;

    /* renamed from: q, reason: collision with root package name */
    public final int f30256q;

    public BookSeriesEntity(int i13, ArrayList arrayList, String str, Long l13, Uri uri, int i14, ArrayList arrayList2, String str2, ArrayList arrayList3, int i15, Rating rating, int i16, boolean z13, ArrayList arrayList4) {
        super(i13, arrayList, str, l13, uri, i14, rating, i16, z13, arrayList4);
        this.f30253n = arrayList2;
        b.j("Author list cannot be empty", !arrayList2.isEmpty());
        this.f30254o = str2;
        if (!TextUtils.isEmpty(str2)) {
            b.j("Description should not exceed 200 characters", str2.length() < 200);
        }
        b.j("Book count is not valid", i15 > 0);
        this.f30256q = i15;
        this.f30255p = arrayList3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int entityType = getEntityType();
        c.O2(parcel, 1, 4);
        parcel.writeInt(entityType);
        c.L2(parcel, 2, getPosterImages(), false);
        c.I2(parcel, 3, this.f30270f, false);
        c.G2(parcel, 4, this.f30265g);
        c.H2(parcel, 5, this.f30247h, i13, false);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f30248i);
        c.J2(parcel, 7, this.f30253n);
        c.I2(parcel, 8, this.f30254o, false);
        c.J2(parcel, 9, this.f30255p);
        c.O2(parcel, 10, 4);
        parcel.writeInt(this.f30256q);
        c.H2(parcel, 16, this.f30249j, i13, false);
        c.O2(parcel, 17, 4);
        parcel.writeInt(this.f30250k);
        c.O2(parcel, 18, 4);
        parcel.writeInt(this.f30251l ? 1 : 0);
        c.L2(parcel, 19, this.f30252m, false);
        c.N2(parcel, M2);
    }
}
