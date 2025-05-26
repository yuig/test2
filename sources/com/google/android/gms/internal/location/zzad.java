package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class zzad extends AbstractSafeParcelable implements k {
    public static final Parcelable.Creator<zzad> CREATOR = new a(9);

    /* renamed from: f, reason: collision with root package name */
    public final Status f31246f;

    public zzad(Status status) {
        this.f31246f = status;
    }

    @Override // com.google.android.gms.common.api.k
    public final Status d() {
        return this.f31246f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 1, this.f31246f, i13, false);
        c.N2(parcel, M2);
    }
}
