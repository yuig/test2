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
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public final LatLng f31911f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31912g;

    /* renamed from: h, reason: collision with root package name */
    public final float f31913h;

    /* renamed from: i, reason: collision with root package name */
    public final float f31914i;

    public CameraPosition(LatLng latLng, float f13, float f14, float f15) {
        com.bumptech.glide.d.u(latLng, "null camera target");
        if (!(0.0f <= f14 && f14 <= 90.0f)) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f14);
        }
        this.f31911f = latLng;
        this.f31912g = f13;
        this.f31913h = f14 + 0.0f;
        this.f31914i = (((double) f15) <= 0.0d ? (f15 % 360.0f) + 360.0f : f15) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f31911f.equals(cameraPosition.f31911f) && Float.floatToIntBits(this.f31912g) == Float.floatToIntBits(cameraPosition.f31912g) && Float.floatToIntBits(this.f31913h) == Float.floatToIntBits(cameraPosition.f31913h) && Float.floatToIntBits(this.f31914i) == Float.floatToIntBits(cameraPosition.f31914i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31911f, Float.valueOf(this.f31912g), Float.valueOf(this.f31913h), Float.valueOf(this.f31914i)});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f31911f, "target");
        q4Var.m(Float.valueOf(this.f31912g), "zoom");
        q4Var.m(Float.valueOf(this.f31913h), "tilt");
        q4Var.m(Float.valueOf(this.f31914i), "bearing");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f31911f, i13, false);
        c.O2(parcel, 3, 4);
        parcel.writeFloat(this.f31912g);
        c.O2(parcel, 4, 4);
        parcel.writeFloat(this.f31913h);
        c.O2(parcel, 5, 4);
        parcel.writeFloat(this.f31914i);
        c.N2(parcel, M2);
    }
}
