package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new u1(8);

    /* renamed from: f, reason: collision with root package name */
    public final String f30547f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30548g;

    public zzc(String str, int i13) {
        this.f30547f = str;
        this.f30548g = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f30547f, false);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30548g);
        c.N2(parcel, M2);
    }
}
