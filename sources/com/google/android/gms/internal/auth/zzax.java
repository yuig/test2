package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new a(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f31237f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final String f31238g;

    public zzax(String str) {
        d.t(str);
        this.f31238g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31237f);
        c.I2(parcel, 2, this.f31238g, false);
        c.N2(parcel, M2);
    }
}
