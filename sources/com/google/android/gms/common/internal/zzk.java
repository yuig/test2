package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new u1(12);

    /* renamed from: f, reason: collision with root package name */
    public Bundle f30988f;

    /* renamed from: g, reason: collision with root package name */
    public Feature[] f30989g;

    /* renamed from: h, reason: collision with root package name */
    public int f30990h;

    /* renamed from: i, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f30991i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.A2(parcel, 1, this.f30988f);
        c.K2(parcel, 2, this.f30989g, i13);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30990h);
        c.H2(parcel, 4, this.f30991i, i13, false);
        c.N2(parcel, M2);
    }
}
