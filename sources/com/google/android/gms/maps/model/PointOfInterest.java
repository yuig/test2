package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;

/* loaded from: classes3.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new d(12);

    /* renamed from: f, reason: collision with root package name */
    public final LatLng f31960f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31961g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31962h;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f31960f = latLng;
        this.f31961g = str;
        this.f31962h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f31960f, i13, false);
        c.I2(parcel, 3, this.f31961g, false);
        c.I2(parcel, 4, this.f31962h, false);
        c.N2(parcel, M2);
    }
}
