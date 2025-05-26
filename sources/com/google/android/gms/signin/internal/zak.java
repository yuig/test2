package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import oi.e7;

/* loaded from: classes3.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new e7(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f32081f;

    /* renamed from: g, reason: collision with root package name */
    public final ConnectionResult f32082g;

    /* renamed from: h, reason: collision with root package name */
    public final zav f32083h;

    public zak(int i13, ConnectionResult connectionResult, zav zavVar) {
        this.f32081f = i13;
        this.f32082g = connectionResult;
        this.f32083h = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f32081f);
        c.H2(parcel, 2, this.f32082g, i13, false);
        c.H2(parcel, 3, this.f32083h, i13, false);
        c.N2(parcel, M2);
    }
}
