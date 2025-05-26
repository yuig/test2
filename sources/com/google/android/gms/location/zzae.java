package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new a(19);

    /* renamed from: f, reason: collision with root package name */
    public final String f31869f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31870g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31871h;

    public zzae(String str, String str2, String str3) {
        this.f31871h = str;
        this.f31869f = str2;
        this.f31870g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f31869f, false);
        c.I2(parcel, 2, this.f31870g, false);
        c.I2(parcel, 5, this.f31871h, false);
        c.N2(parcel, M2);
    }
}
