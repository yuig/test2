package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import oi.e7;

/* loaded from: classes3.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new e7(4);

    /* renamed from: f, reason: collision with root package name */
    public final int f32079f;

    /* renamed from: g, reason: collision with root package name */
    public final zat f32080g;

    public zai(int i13, zat zatVar) {
        this.f32079f = i13;
        this.f32080g = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f32079f);
        c.H2(parcel, 2, this.f32080g, i13, false);
        c.N2(parcel, M2);
    }
}
