package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;

/* loaded from: classes3.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new d(25);

    /* renamed from: f, reason: collision with root package name */
    public String f32017f;

    /* renamed from: g, reason: collision with root package name */
    public String f32018g;

    /* renamed from: h, reason: collision with root package name */
    public zznc f32019h;

    /* renamed from: i, reason: collision with root package name */
    public long f32020i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32021j;

    /* renamed from: k, reason: collision with root package name */
    public String f32022k;

    /* renamed from: l, reason: collision with root package name */
    public final zzbg f32023l;

    /* renamed from: m, reason: collision with root package name */
    public long f32024m;

    /* renamed from: n, reason: collision with root package name */
    public zzbg f32025n;

    /* renamed from: o, reason: collision with root package name */
    public final long f32026o;

    /* renamed from: p, reason: collision with root package name */
    public final zzbg f32027p;

    public zzad(zzad zzadVar) {
        com.bumptech.glide.d.t(zzadVar);
        this.f32017f = zzadVar.f32017f;
        this.f32018g = zzadVar.f32018g;
        this.f32019h = zzadVar.f32019h;
        this.f32020i = zzadVar.f32020i;
        this.f32021j = zzadVar.f32021j;
        this.f32022k = zzadVar.f32022k;
        this.f32023l = zzadVar.f32023l;
        this.f32024m = zzadVar.f32024m;
        this.f32025n = zzadVar.f32025n;
        this.f32026o = zzadVar.f32026o;
        this.f32027p = zzadVar.f32027p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 2, this.f32017f, false);
        c.I2(parcel, 3, this.f32018g, false);
        c.H2(parcel, 4, this.f32019h, i13, false);
        long j13 = this.f32020i;
        c.O2(parcel, 5, 8);
        parcel.writeLong(j13);
        boolean z13 = this.f32021j;
        c.O2(parcel, 6, 4);
        parcel.writeInt(z13 ? 1 : 0);
        c.I2(parcel, 7, this.f32022k, false);
        c.H2(parcel, 8, this.f32023l, i13, false);
        long j14 = this.f32024m;
        c.O2(parcel, 9, 8);
        parcel.writeLong(j14);
        c.H2(parcel, 10, this.f32025n, i13, false);
        c.O2(parcel, 11, 8);
        parcel.writeLong(this.f32026o);
        c.H2(parcel, 12, this.f32027p, i13, false);
        c.N2(parcel, M2);
    }

    public zzad(String str, String str2, zznc zzncVar, long j13, boolean z13, String str3, zzbg zzbgVar, long j14, zzbg zzbgVar2, long j15, zzbg zzbgVar3) {
        this.f32017f = str;
        this.f32018g = str2;
        this.f32019h = zzncVar;
        this.f32020i = j13;
        this.f32021j = z13;
        this.f32022k = str3;
        this.f32023l = zzbgVar;
        this.f32024m = j14;
        this.f32025n = zzbgVar2;
        this.f32026o = j15;
        this.f32027p = zzbgVar3;
    }
}
