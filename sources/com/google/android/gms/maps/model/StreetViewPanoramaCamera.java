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
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new d(15);

    /* renamed from: f, reason: collision with root package name */
    public final float f31985f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31986g;

    /* renamed from: h, reason: collision with root package name */
    public final float f31987h;

    public StreetViewPanoramaCamera(float f13, float f14, float f15) {
        boolean z13 = -90.0f <= f14 && f14 <= 90.0f;
        StringBuilder sb3 = new StringBuilder(62);
        sb3.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb3.append(f14);
        com.bumptech.glide.d.i(sb3.toString(), z13);
        this.f31985f = ((double) f13) <= 0.0d ? 0.0f : f13;
        this.f31986g = 0.0f + f14;
        this.f31987h = (((double) f15) <= 0.0d ? (f15 % 360.0f) + 360.0f : f15) % 360.0f;
        new StreetViewPanoramaOrientation(f14, f15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f31985f) == Float.floatToIntBits(streetViewPanoramaCamera.f31985f) && Float.floatToIntBits(this.f31986g) == Float.floatToIntBits(streetViewPanoramaCamera.f31986g) && Float.floatToIntBits(this.f31987h) == Float.floatToIntBits(streetViewPanoramaCamera.f31987h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f31985f), Float.valueOf(this.f31986g), Float.valueOf(this.f31987h)});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(Float.valueOf(this.f31985f), "zoom");
        q4Var.m(Float.valueOf(this.f31986g), "tilt");
        q4Var.m(Float.valueOf(this.f31987h), "bearing");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 2, 4);
        parcel.writeFloat(this.f31985f);
        c.O2(parcel, 3, 4);
        parcel.writeFloat(this.f31986g);
        c.O2(parcel, 4, 4);
        parcel.writeFloat(this.f31987h);
        c.N2(parcel, M2);
    }
}
