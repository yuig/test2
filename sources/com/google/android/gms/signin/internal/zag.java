package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import oi.e7;

/* loaded from: classes3.dex */
public final class zag extends AbstractSafeParcelable implements k {
    public static final Parcelable.Creator<zag> CREATOR = new e7(3);

    /* renamed from: f, reason: collision with root package name */
    public final List f32077f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32078g;

    public zag(ArrayList arrayList, String str) {
        this.f32077f = arrayList;
        this.f32078g = str;
    }

    @Override // com.google.android.gms.common.api.k
    public final Status d() {
        return this.f32078g != null ? Status.f30746j : Status.f30750n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.J2(parcel, 1, this.f32077f);
        c.I2(parcel, 2, this.f32078g, false);
        c.N2(parcel, M2);
    }
}
