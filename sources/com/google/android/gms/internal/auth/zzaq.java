package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public final String f31233f;

    public zzaq(String str) {
        d.t(str);
        this.f31233f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(1);
        c.I2(parcel, 2, this.f31233f, false);
        c.N2(parcel, M2);
    }
}
