package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new d(7);

    /* renamed from: f, reason: collision with root package name */
    public final LatLng f31941f;

    /* renamed from: g, reason: collision with root package name */
    public final LatLng f31942g;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        com.bumptech.glide.d.u(latLng, "null southwest");
        com.bumptech.glide.d.u(latLng2, "null northeast");
        double d2 = latLng2.f31939f;
        double d13 = latLng.f31939f;
        if (d2 >= d13) {
            this.f31941f = latLng;
            this.f31942g = latLng2;
            return;
        }
        throw new IllegalArgumentException("southern latitude exceeds northern latitude (" + d13 + " > " + d2 + ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f31941f.equals(latLngBounds.f31941f) && this.f31942g.equals(latLngBounds.f31942g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31941f, this.f31942g});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f31941f, "southwest");
        q4Var.m(this.f31942g, "northeast");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f31941f, i13, false);
        c.H2(parcel, 3, this.f31942g, i13, false);
        c.N2(parcel, M2);
    }
}
