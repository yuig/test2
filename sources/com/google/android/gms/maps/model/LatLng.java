package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;

/* loaded from: classes3.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new d(8);

    /* renamed from: f, reason: collision with root package name */
    public final double f31939f;

    /* renamed from: g, reason: collision with root package name */
    public final double f31940g;

    public LatLng(double d2, double d13) {
        if (-180.0d > d13 || d13 >= 180.0d) {
            this.f31940g = ((((d13 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f31940g = d13;
        }
        this.f31939f = Math.max(-90.0d, Math.min(90.0d, d2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f31939f) == Double.doubleToLongBits(latLng.f31939f) && Double.doubleToLongBits(this.f31940g) == Double.doubleToLongBits(latLng.f31940g);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f31939f);
        int i13 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f31940g);
        return (i13 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(60);
        sb3.append("lat/lng: (");
        sb3.append(this.f31939f);
        sb3.append(",");
        sb3.append(this.f31940g);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 2, 8);
        parcel.writeDouble(this.f31939f);
        c.O2(parcel, 3, 8);
        parcel.writeDouble(this.f31940g);
        c.N2(parcel, M2);
    }
}
