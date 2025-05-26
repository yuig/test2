package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new b(26);

    /* renamed from: f, reason: collision with root package name */
    public final int f30983f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30984g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30985h;

    /* renamed from: i, reason: collision with root package name */
    public final Scope[] f30986i;

    public zax(int i13, int i14, int i15, Scope[] scopeArr) {
        this.f30983f = i13;
        this.f30984g = i14;
        this.f30985h = i15;
        this.f30986i = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30983f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30984g);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30985h);
        c.K2(parcel, 4, this.f30986i, i13);
        c.N2(parcel, M2);
    }
}
