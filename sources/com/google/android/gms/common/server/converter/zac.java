package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new a(7);

    /* renamed from: f, reason: collision with root package name */
    public final int f31014f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31015g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31016h;

    public zac(int i13, int i14, String str) {
        this.f31014f = i13;
        this.f31015g = str;
        this.f31016h = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31014f);
        c.I2(parcel, 2, this.f31015g, false);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31016h);
        c.N2(parcel, M2);
    }

    public zac(String str, int i13) {
        this.f31014f = 1;
        this.f31015g = str;
        this.f31016h = i13;
    }
}
