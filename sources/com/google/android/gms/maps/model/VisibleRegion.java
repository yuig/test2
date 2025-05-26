package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new d(22);

    /* renamed from: f, reason: collision with root package name */
    public final LatLng f32005f;

    /* renamed from: g, reason: collision with root package name */
    public final LatLng f32006g;

    /* renamed from: h, reason: collision with root package name */
    public final LatLng f32007h;

    /* renamed from: i, reason: collision with root package name */
    public final LatLng f32008i;

    /* renamed from: j, reason: collision with root package name */
    public final LatLngBounds f32009j;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f32005f = latLng;
        this.f32006g = latLng2;
        this.f32007h = latLng3;
        this.f32008i = latLng4;
        this.f32009j = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f32005f.equals(visibleRegion.f32005f) && this.f32006g.equals(visibleRegion.f32006g) && this.f32007h.equals(visibleRegion.f32007h) && this.f32008i.equals(visibleRegion.f32008i) && this.f32009j.equals(visibleRegion.f32009j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32005f, this.f32006g, this.f32007h, this.f32008i, this.f32009j});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f32005f, "nearLeft");
        q4Var.m(this.f32006g, "nearRight");
        q4Var.m(this.f32007h, "farLeft");
        q4Var.m(this.f32008i, "farRight");
        q4Var.m(this.f32009j, "latLngBounds");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f32005f, i13, false);
        c.H2(parcel, 3, this.f32006g, i13, false);
        c.H2(parcel, 4, this.f32007h, i13, false);
        c.H2(parcel, 5, this.f32008i, i13, false);
        c.H2(parcel, 6, this.f32009j, i13, false);
        c.N2(parcel, M2);
    }
}
