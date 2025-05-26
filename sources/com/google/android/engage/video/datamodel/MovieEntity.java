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
public final class MovieEntity extends VideoEntity {

    @NonNull
    public static final Parcelable.Creator<MovieEntity> CREATOR = new a(14);

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30325j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30326k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f30327l;

    /* renamed from: m, reason: collision with root package name */
    public final int f30328m;

    /* renamed from: n, reason: collision with root package name */
    public final String f30329n;

    /* renamed from: o, reason: collision with root package name */
    public final long f30330o;

    /* renamed from: p, reason: collision with root package name */
    public final List f30331p;

    /* renamed from: q, reason: collision with root package name */
    public final List f30332q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f30333r;

    public MovieEntity(int i13, ArrayList arrayList, String str, Long l13, int i14, long j13, Uri uri, Uri uri2, Long l14, int i15, String str2, long j14, ArrayList arrayList2, ArrayList arrayList3, boolean z13) {
        super(i13, arrayList, str, l13, i14, j13);
        b.j("Play back uri is not valid", uri != null);
        this.f30325j = uri;
        this.f30326k = uri2;
        this.f30327l = l14;
        b.j("Content availability is not valid", i15 > 0 && i15 <= 3);
        this.f30328m = i15;
        this.f30329n = str2;
        b.j("Duration is not valid", j14 > Long.MIN_VALUE);
        this.f30330o = j14;
        this.f30331p = arrayList2;
        this.f30332q = arrayList3;
        b.j("Movie ratings cannot be empty", !arrayList3.isEmpty());
        this.f30333r = z13;
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
        c.H2(parcel, 7, this.f30325j, i13, false);
        c.H2(parcel, 8, this.f30326k, i13, false);
        c.G2(parcel, 9, this.f30327l);
        c.O2(parcel, 10, 4);
        parcel.writeInt(this.f30328m);
        c.I2(parcel, 11, this.f30329n, false);
        c.O2(parcel, 12, 8);
        parcel.writeLong(this.f30330o);
        c.J2(parcel, 13, this.f30331p);
        c.J2(parcel, 14, this.f30332q);
        c.O2(parcel, 15, 4);
        parcel.writeInt(this.f30333r ? 1 : 0);
        c.N2(parcel, M2);
    }
}
