package com.google.android.engage.video.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;
import vg.a;

@KeepName
/* loaded from: classes3.dex */
public final class TvSeasonEntity extends VideoEntity {

    @NonNull
    public static final Parcelable.Creator<TvSeasonEntity> CREATOR = new a(16);

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30346j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30347k;

    /* renamed from: l, reason: collision with root package name */
    public final int f30348l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f30349m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f30350n;

    /* renamed from: o, reason: collision with root package name */
    public final int f30351o;

    /* renamed from: p, reason: collision with root package name */
    public final String f30352p;

    /* renamed from: q, reason: collision with root package name */
    public final int f30353q;

    /* renamed from: r, reason: collision with root package name */
    public final List f30354r;

    /* renamed from: s, reason: collision with root package name */
    public final List f30355s;

    public TvSeasonEntity(int i13, ArrayList arrayList, String str, Long l13, int i14, long j13, Uri uri, Uri uri2, int i15, Long l14, Long l15, int i16, String str2, int i17, ArrayList arrayList2, ArrayList arrayList3) {
        super(i13, arrayList, str, l13, i14, j13);
        b.j("Info page uri is not valid", uri != null);
        this.f30346j = uri;
        this.f30347k = uri2;
        b.j("Season number is not valid", i15 > 0);
        this.f30348l = i15;
        this.f30349m = l14;
        this.f30350n = l15;
        b.j("Content availability is not valid", i16 > 0 && i16 <= 3);
        this.f30351o = i16;
        this.f30352p = str2;
        b.j("Episode count is not valid", i17 > 0);
        this.f30353q = i17;
        this.f30354r = arrayList2;
        this.f30355s = arrayList3;
        b.j("Tv show ratings cannot be empty", !arrayList3.isEmpty());
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
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30372h);
        c.O2(parcel, 6, 8);
        parcel.writeLong(this.f30373i);
        c.H2(parcel, 7, this.f30346j, i13, false);
        c.H2(parcel, 8, this.f30347k, i13, false);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f30348l);
        c.G2(parcel, 10, this.f30349m);
        c.G2(parcel, 11, this.f30350n);
        c.O2(parcel, 12, 4);
        parcel.writeInt(this.f30351o);
        c.I2(parcel, 13, this.f30352p, false);
        c.O2(parcel, 14, 4);
        parcel.writeInt(this.f30353q);
        c.J2(parcel, 15, this.f30354r);
        c.J2(parcel, 16, this.f30355s);
        c.N2(parcel, M2);
    }
}
