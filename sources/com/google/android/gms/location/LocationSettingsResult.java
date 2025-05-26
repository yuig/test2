package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements k {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new a(21);

    /* renamed from: f, reason: collision with root package name */
    public final Status f31857f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationSettingsStates f31858g;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f31857f = status;
        this.f31858g = locationSettingsStates;
    }

    @Override // com.google.android.gms.common.api.k
    public final Status d() {
        return this.f31857f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 1, this.f31857f, i13, false);
        c.H2(parcel, 2, this.f31858g, i13, false);
        c.N2(parcel, M2);
    }
}
