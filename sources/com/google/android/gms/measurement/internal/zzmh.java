package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;

/* loaded from: classes3.dex */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new d(29);

    /* renamed from: f, reason: collision with root package name */
    public final String f32034f;

    /* renamed from: g, reason: collision with root package name */
    public final long f32035g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32036h;

    public zzmh(String str, long j13, int i13) {
        this.f32034f = str;
        this.f32035g = j13;
        this.f32036h = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f32034f, false);
        c.O2(parcel, 2, 8);
        parcel.writeLong(this.f32035g);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f32036h);
        c.N2(parcel, M2);
    }
}
