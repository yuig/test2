package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new a(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f31244f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31245g;

    public zzbw(int i13, String str) {
        this.f31244f = i13;
        this.f31245g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31244f);
        c.I2(parcel, 2, this.f31245g, false);
        c.N2(parcel, M2);
    }
}
