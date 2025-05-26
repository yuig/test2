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
public final class TvShowEntity extends VideoEntity {

    @NonNull
    public static final Parcelable.Creator<TvShowEntity> CREATOR = new a(17);

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30356j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30357k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f30358l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f30359m;

    /* renamed from: n, reason: collision with root package name */
    public final int f30360n;

    /* renamed from: o, reason: collision with root package name */
    public final String f30361o;

    /* renamed from: p, reason: collision with root package name */
    public final int f30362p;

    /* renamed from: q, reason: collision with root package name */
    public final List f30363q;

    /* renamed from: r, reason: collision with root package name */
    public final List f30364r;

    public TvShowEntity(int i13, ArrayList arrayList, String str, Long l13, int i14, long j13, Uri uri, Uri uri2, Long l14, Long l15, int i15, String str2, int i16, ArrayList arrayList2, ArrayList arrayList3) {
        super(i13, arrayList, str, l13, i14, j13);
        b.j("Info page uri is not valid", uri != null);
        this.f30356j = uri;
        this.f30357k = uri2;
        this.f30358l = l14;
        b.j("First episode air date is not valid", l14 != null && l14.longValue() > Long.MIN_VALUE);
        this.f30359m = l15;
        b.j("Content availability is not valid", i15 > 0 && i15 <= 3);
        this.f30360n = i15;
        this.f30361o = str2;
        b.j("Season count is not valid", i16 > 0);
        this.f30362p = i16;
        this.f30363q = arrayList2;
        this.f30364r = arrayList3;
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
        c.H2(parcel, 7, this.f30356j, i13, false);
        c.H2(parcel, 8, this.f30357k, i13, false);
        c.G2(parcel, 9, this.f30358l);
        c.G2(parcel, 10, this.f30359m);
        c.O2(parcel, 11, 4);
        parcel.writeInt(this.f30360n);
        c.I2(parcel, 12, this.f30361o, false);
        c.O2(parcel, 13, 4);
        parcel.writeInt(this.f30362p);
        c.J2(parcel, 14, this.f30363q);
        c.J2(parcel, 15, this.f30364r);
        c.N2(parcel, M2);
    }
}
