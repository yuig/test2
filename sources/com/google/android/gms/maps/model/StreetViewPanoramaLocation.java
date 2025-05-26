package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new d(17);

    /* renamed from: f, reason: collision with root package name */
    public final StreetViewPanoramaLink[] f31990f;

    /* renamed from: g, reason: collision with root package name */
    public final LatLng f31991g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31992h;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f31990f = streetViewPanoramaLinkArr;
        this.f31991g = latLng;
        this.f31992h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f31992h.equals(streetViewPanoramaLocation.f31992h) && this.f31991g.equals(streetViewPanoramaLocation.f31991g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31991g, this.f31992h});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f31992h, "panoId");
        q4Var.m(this.f31991g.toString(), "position");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.K2(parcel, 2, this.f31990f, i13);
        c.H2(parcel, 3, this.f31991g, i13, false);
        c.I2(parcel, 4, this.f31992h, false);
        c.N2(parcel, M2);
    }
}
