package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;
import rh.b;

/* loaded from: classes3.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new a(14);

    /* renamed from: f, reason: collision with root package name */
    public final String f31059f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31060g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31061h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f31062i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f31063j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31064k;

    public zzo(String str, boolean z13, boolean z14, IBinder iBinder, boolean z15, boolean z16) {
        this.f31059f = str;
        this.f31060g = z13;
        this.f31061h = z14;
        this.f31062i = (Context) b.E(b.D(iBinder));
        this.f31063j = z15;
        this.f31064k = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f31059f, false);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31060g ? 1 : 0);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31061h ? 1 : 0);
        c.E2(parcel, 4, new b(this.f31062i));
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31063j ? 1 : 0);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f31064k ? 1 : 0);
        c.N2(parcel, M2);
    }
}
