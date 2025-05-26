package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new u1(7);

    /* renamed from: f, reason: collision with root package name */
    public final String f30545f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30546g;

    public zza(String str, String str2) {
        this.f30545f = str;
        this.f30546g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f30545f, false);
        c.I2(parcel, 2, this.f30546g, false);
        c.N2(parcel, M2);
    }
}
