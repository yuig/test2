package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import ig1.b;
import li.d;

/* loaded from: classes3.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new d(24);

    /* renamed from: f, reason: collision with root package name */
    public StreetViewPanoramaCamera f31901f;

    /* renamed from: g, reason: collision with root package name */
    public String f31902g;

    /* renamed from: h, reason: collision with root package name */
    public LatLng f31903h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f31904i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f31905j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f31906k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f31907l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f31908m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f31909n;

    /* renamed from: o, reason: collision with root package name */
    public StreetViewSource f31910o;

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f31902g, "PanoramaId");
        q4Var.m(this.f31903h, "Position");
        q4Var.m(this.f31904i, "Radius");
        q4Var.m(this.f31910o, "Source");
        q4Var.m(this.f31901f, "StreetViewPanoramaCamera");
        q4Var.m(this.f31905j, "UserNavigationEnabled");
        q4Var.m(this.f31906k, "ZoomGesturesEnabled");
        q4Var.m(this.f31907l, "PanningGesturesEnabled");
        q4Var.m(this.f31908m, "StreetNamesEnabled");
        q4Var.m(this.f31909n, "UseViewLifecycleInFragment");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f31901f, i13, false);
        c.I2(parcel, 3, this.f31902g, false);
        c.H2(parcel, 4, this.f31903h, i13, false);
        c.F2(parcel, 5, this.f31904i);
        byte q13 = b.q1(this.f31905j);
        c.O2(parcel, 6, 4);
        parcel.writeInt(q13);
        byte q14 = b.q1(this.f31906k);
        c.O2(parcel, 7, 4);
        parcel.writeInt(q14);
        byte q15 = b.q1(this.f31907l);
        c.O2(parcel, 8, 4);
        parcel.writeInt(q15);
        byte q16 = b.q1(this.f31908m);
        c.O2(parcel, 9, 4);
        parcel.writeInt(q16);
        byte q17 = b.q1(this.f31909n);
        c.O2(parcel, 10, 4);
        parcel.writeInt(q17);
        c.H2(parcel, 11, this.f31910o, i13, false);
        c.N2(parcel, M2);
    }
}
