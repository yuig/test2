package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;

/* loaded from: classes3.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new d(28);

    /* renamed from: f, reason: collision with root package name */
    public final String f32030f;

    /* renamed from: g, reason: collision with root package name */
    public final zzbb f32031g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32032h;

    /* renamed from: i, reason: collision with root package name */
    public final long f32033i;

    public zzbg(zzbg zzbgVar, long j13) {
        com.bumptech.glide.d.t(zzbgVar);
        this.f32030f = zzbgVar.f32030f;
        this.f32031g = zzbgVar.f32031g;
        this.f32032h = zzbgVar.f32032h;
        this.f32033i = j13;
    }

    public final String toString() {
        return "origin=" + this.f32032h + ",name=" + this.f32030f + ",params=" + String.valueOf(this.f32031g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 2, this.f32030f, false);
        c.H2(parcel, 3, this.f32031g, i13, false);
        c.I2(parcel, 4, this.f32032h, false);
        c.O2(parcel, 5, 8);
        parcel.writeLong(this.f32033i);
        c.N2(parcel, M2);
    }

    public zzbg(String str, zzbb zzbbVar, String str2, long j13) {
        this.f32030f = str;
        this.f32031g = zzbbVar;
        this.f32032h = str2;
        this.f32033i = j13;
    }
}
