package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new i2.u1(17);

    /* renamed from: f, reason: collision with root package name */
    public final long f31724f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31725g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31726h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31727i;

    /* renamed from: j, reason: collision with root package name */
    public final String f31728j;

    /* renamed from: k, reason: collision with root package name */
    public final String f31729k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f31730l;

    /* renamed from: m, reason: collision with root package name */
    public final String f31731m;

    public zzdd(long j13, long j14, boolean z13, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f31724f = j13;
        this.f31725g = j14;
        this.f31726h = z13;
        this.f31727i = str;
        this.f31728j = str2;
        this.f31729k = str3;
        this.f31730l = bundle;
        this.f31731m = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 8);
        parcel.writeLong(this.f31724f);
        bs1.c.O2(parcel, 2, 8);
        parcel.writeLong(this.f31725g);
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31726h ? 1 : 0);
        bs1.c.I2(parcel, 4, this.f31727i, false);
        bs1.c.I2(parcel, 5, this.f31728j, false);
        bs1.c.I2(parcel, 6, this.f31729k, false);
        bs1.c.A2(parcel, 7, this.f31730l);
        bs1.c.I2(parcel, 8, this.f31731m, false);
        bs1.c.N2(parcel, M2);
    }
}
