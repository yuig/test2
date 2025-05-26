package com.google.android.engage.books.datamodel;

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
public class AudiobookEntity extends BookEntity {

    @NonNull
    public static final Parcelable.Creator<AudiobookEntity> CREATOR = new f(10);

    /* renamed from: n, reason: collision with root package name */
    public final List f30238n;

    /* renamed from: o, reason: collision with root package name */
    public final List f30239o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f30240p;

    /* renamed from: q, reason: collision with root package name */
    public final String f30241q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f30242r;

    /* renamed from: s, reason: collision with root package name */
    public final Price f30243s;

    /* renamed from: t, reason: collision with root package name */
    public final List f30244t;

    /* renamed from: u, reason: collision with root package name */
    public final String f30245u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f30246v;

    public AudiobookEntity(int i13, ArrayList arrayList, String str, Long l13, Uri uri, int i14, ArrayList arrayList2, ArrayList arrayList3, Long l14, String str2, Long l15, Price price, ArrayList arrayList4, String str3, Integer num, Rating rating, int i15, boolean z13, ArrayList arrayList5) {
        super(i13, arrayList, str, l13, uri, i14, rating, i15, z13, arrayList5);
        this.f30238n = arrayList2;
        b.j("Author list cannot be empty", !arrayList2.isEmpty());
        this.f30239o = arrayList3;
        b.j("Narrator list cannot be empty", !arrayList3.isEmpty());
        this.f30240p = l14;
        if (l14 != null) {
            b.j("Publish date is not valid", l14.longValue() > Long.MIN_VALUE);
        }
        this.f30241q = str2;
        if (!TextUtils.isEmpty(str2)) {
            b.j("Description should not exceed 200 characters", str2.length() < 200);
        }
        this.f30242r = l15;
        if (l15 != null) {
            b.j("Duration is not valid", l15.longValue() > 0);
        }
        this.f30243s = price;
        this.f30244t = arrayList4;
        this.f30245u = str3;
        this.f30246v = num;
        if (num != null) {
            b.j("Series Unit Index is not valid", num.intValue() > 0);
        }
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
        c.J2(parcel, 7, this.f30238n);
        c.J2(parcel, 8, this.f30239o);
        c.G2(parcel, 9, this.f30240p);
        c.I2(parcel, 10, this.f30241q, false);
        c.G2(parcel, 11, this.f30242r);
        c.H2(parcel, 12, this.f30243s, i13, false);
        c.J2(parcel, 13, this.f30244t);
        c.I2(parcel, 14, this.f30245u, false);
        c.F2(parcel, 15, this.f30246v);
        c.H2(parcel, 16, this.f30249j, i13, false);
        c.O2(parcel, 17, 4);
        parcel.writeInt(this.f30250k);
        c.O2(parcel, 18, 4);
        parcel.writeInt(this.f30251l ? 1 : 0);
        c.L2(parcel, 19, this.f30252m, false);
        c.N2(parcel, M2);
    }
}
