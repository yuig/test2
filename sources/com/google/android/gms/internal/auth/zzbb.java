package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new a(7);

    /* renamed from: f, reason: collision with root package name */
    public final String f31242f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f31243g;

    public zzbb(PendingIntent pendingIntent, String str) {
        d.t(str);
        this.f31242f = str;
        d.t(pendingIntent);
        this.f31243g = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(1);
        c.I2(parcel, 2, this.f31242f, false);
        c.H2(parcel, 3, this.f31243g, i13, false);
        c.N2(parcel, M2);
    }
}
