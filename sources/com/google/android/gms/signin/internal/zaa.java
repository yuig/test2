package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import oi.e7;

/* loaded from: classes3.dex */
public final class zaa extends AbstractSafeParcelable implements k {
    public static final Parcelable.Creator<zaa> CREATOR = new e7(2);

    /* renamed from: f, reason: collision with root package name */
    public final int f32074f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32075g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f32076h;

    public zaa(int i13, int i14, Intent intent) {
        this.f32074f = i13;
        this.f32075g = i14;
        this.f32076h = intent;
    }

    @Override // com.google.android.gms.common.api.k
    public final Status d() {
        return this.f32075g == 0 ? Status.f30746j : Status.f30750n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f32074f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f32075g);
        c.H2(parcel, 3, this.f32076h, i13, false);
        c.N2(parcel, M2);
    }
}
