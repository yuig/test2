package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new a(4);

    /* renamed from: f, reason: collision with root package name */
    public final int f31234f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final String f31235g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31236h;

    public zzav(int i13, String str) {
        d.t(str);
        this.f31235g = str;
        this.f31236h = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31234f);
        c.I2(parcel, 2, this.f31235g, false);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31236h);
        c.N2(parcel, M2);
    }
}
