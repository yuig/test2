package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new d(16);

    /* renamed from: f, reason: collision with root package name */
    public final String f31988f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31989g;

    public StreetViewPanoramaLink(String str, float f13) {
        this.f31988f = str;
        this.f31989g = (((double) f13) <= 0.0d ? (f13 % 360.0f) + 360.0f : f13) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f31988f.equals(streetViewPanoramaLink.f31988f) && Float.floatToIntBits(this.f31989g) == Float.floatToIntBits(streetViewPanoramaLink.f31989g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31988f, Float.valueOf(this.f31989g)});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f31988f, "panoId");
        q4Var.m(Float.valueOf(this.f31989g), "bearing");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 2, this.f31988f, false);
        c.O2(parcel, 3, 4);
        parcel.writeFloat(this.f31989g);
        c.N2(parcel, M2);
    }
}
