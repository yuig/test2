package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new d(18);

    /* renamed from: f, reason: collision with root package name */
    public final float f31993f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31994g;

    public StreetViewPanoramaOrientation(float f13, float f14) {
        boolean z13 = -90.0f <= f13 && f13 <= 90.0f;
        StringBuilder sb3 = new StringBuilder(62);
        sb3.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb3.append(f13);
        com.bumptech.glide.d.i(sb3.toString(), z13);
        this.f31993f = f13 + 0.0f;
        this.f31994g = (((double) f14) <= 0.0d ? (f14 % 360.0f) + 360.0f : f14) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f31993f) == Float.floatToIntBits(streetViewPanoramaOrientation.f31993f) && Float.floatToIntBits(this.f31994g) == Float.floatToIntBits(streetViewPanoramaOrientation.f31994g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f31993f), Float.valueOf(this.f31994g)});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(Float.valueOf(this.f31993f), "tilt");
        q4Var.m(Float.valueOf(this.f31994g), "bearing");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 2, 4);
        parcel.writeFloat(this.f31993f);
        c.O2(parcel, 3, 4);
        parcel.writeFloat(this.f31994g);
        c.N2(parcel, M2);
    }
}
