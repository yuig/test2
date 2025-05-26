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
public class EbookEntity extends BookEntity {

    @NonNull
    public static final Parcelable.Creator<EbookEntity> CREATOR = new f(12);

    /* renamed from: n, reason: collision with root package name */
    public final List f30257n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f30258o;

    /* renamed from: p, reason: collision with root package name */
    public final String f30259p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f30260q;

    /* renamed from: r, reason: collision with root package name */
    public final Price f30261r;

    /* renamed from: s, reason: collision with root package name */
    public final List f30262s;

    /* renamed from: t, reason: collision with root package name */
    public final String f30263t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f30264u;

    public EbookEntity(int i13, ArrayList arrayList, String str, Long l13, Uri uri, int i14, ArrayList arrayList2, Long l14, String str2, Integer num, Price price, ArrayList arrayList3, String str3, Integer num2, Rating rating, int i15, boolean z13, ArrayList arrayList4) {
        super(i13, arrayList, str, l13, uri, i14, rating, i15, z13, arrayList4);
        this.f30257n = arrayList2;
        b.j("Author list cannot be empty", !arrayList2.isEmpty());
        this.f30258o = l14;
        if (l14 != null) {
            b.j("Publish date is not valid", l14.longValue() > Long.MIN_VALUE);
        }
        this.f30259p = str2;
        if (!TextUtils.isEmpty(str2)) {
            b.j("Description should not exceed 200 characters", str2.length() < 200);
        }
        this.f30260q = num;
        if (num != null) {
            b.j("Page count is not valid", num.intValue() > 0);
        }
        this.f30261r = price;
        this.f30262s = arrayList3;
        this.f30263t = str3;
        this.f30264u = num2;
        if (num2 != null) {
            b.j("Series Unit Index is not valid", num2.intValue() > 0);
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
        c.J2(parcel, 7, this.f30257n);
        c.G2(parcel, 8, this.f30258o);
        c.I2(parcel, 9, this.f30259p, false);
        c.F2(parcel, 10, this.f30260q);
        c.H2(parcel, 11, this.f30261r, i13, false);
        c.J2(parcel, 12, this.f30262s);
        c.I2(parcel, 13, this.f30263t, false);
        c.F2(parcel, 14, this.f30264u);
        c.H2(parcel, 16, this.f30249j, i13, false);
        c.O2(parcel, 17, 4);
        parcel.writeInt(this.f30250k);
        c.O2(parcel, 18, 4);
        parcel.writeInt(this.f30251l ? 1 : 0);
        c.L2(parcel, 19, this.f30252m, false);
        c.N2(parcel, M2);
    }
}
