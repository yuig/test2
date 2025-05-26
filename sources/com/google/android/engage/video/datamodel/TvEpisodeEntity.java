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
public final class TvEpisodeEntity extends VideoEntity {

    @NonNull
    public static final Parcelable.Creator<TvEpisodeEntity> CREATOR = new a(15);

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30334j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30335k;

    /* renamed from: l, reason: collision with root package name */
    public final int f30336l;

    /* renamed from: m, reason: collision with root package name */
    public final long f30337m;

    /* renamed from: n, reason: collision with root package name */
    public final int f30338n;

    /* renamed from: o, reason: collision with root package name */
    public final String f30339o;

    /* renamed from: p, reason: collision with root package name */
    public final List f30340p;

    /* renamed from: q, reason: collision with root package name */
    public final List f30341q;

    /* renamed from: r, reason: collision with root package name */
    public final long f30342r;

    /* renamed from: s, reason: collision with root package name */
    public final String f30343s;

    /* renamed from: t, reason: collision with root package name */
    public final String f30344t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f30345u;

    public TvEpisodeEntity(int i13, ArrayList arrayList, String str, Long l13, int i14, long j13, Uri uri, Uri uri2, int i15, long j14, int i16, String str2, ArrayList arrayList2, ArrayList arrayList3, long j15, String str3, String str4, boolean z13) {
        super(i13, arrayList, str, l13, i14, j13);
        b.j("Play back uri is not valid", uri != null);
        this.f30334j = uri;
        this.f30335k = uri2;
        b.j("Episode number is not valid", i15 > 0);
        this.f30336l = i15;
        b.j("Air date is not valid", j14 > Long.MIN_VALUE);
        this.f30337m = j14;
        b.j("Content availability is not valid", i16 > 0 && i16 <= 3);
        this.f30338n = i16;
        this.f30339o = str2;
        this.f30340p = arrayList2;
        this.f30341q = arrayList3;
        b.j("Tv show ratings cannot be empty", !arrayList3.isEmpty());
        b.j("Duration is not valid", j15 > 0);
        this.f30342r = j15;
        this.f30343s = str3;
        this.f30344t = str4;
        this.f30345u = z13;
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
        c.H2(parcel, 7, this.f30334j, i13, false);
        c.H2(parcel, 8, this.f30335k, i13, false);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f30336l);
        c.O2(parcel, 10, 8);
        parcel.writeLong(this.f30337m);
        c.O2(parcel, 11, 4);
        parcel.writeInt(this.f30338n);
        c.I2(parcel, 12, this.f30339o, false);
        c.J2(parcel, 13, this.f30340p);
        c.J2(parcel, 14, this.f30341q);
        c.O2(parcel, 15, 8);
        parcel.writeLong(this.f30342r);
        c.I2(parcel, 16, this.f30343s, false);
        c.I2(parcel, 17, this.f30344t, false);
        c.O2(parcel, 18, 4);
        parcel.writeInt(this.f30345u ? 1 : 0);
        c.N2(parcel, M2);
    }
}
