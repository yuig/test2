package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new a(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f31239f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final String f31240g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f31241h;

    public zzaz(String str, byte[] bArr) {
        d.t(str);
        this.f31240g = str;
        d.t(bArr);
        this.f31241h = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31239f);
        c.I2(parcel, 2, this.f31240g, false);
        c.B2(parcel, 3, this.f31241h, false);
        c.N2(parcel, M2);
    }
}
