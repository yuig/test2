package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bb.p;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;
import rh.a;

/* loaded from: classes3.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new d(6);

    /* renamed from: f, reason: collision with root package name */
    public p f31927f;

    /* renamed from: g, reason: collision with root package name */
    public LatLng f31928g;

    /* renamed from: h, reason: collision with root package name */
    public float f31929h;

    /* renamed from: i, reason: collision with root package name */
    public float f31930i;

    /* renamed from: j, reason: collision with root package name */
    public LatLngBounds f31931j;

    /* renamed from: k, reason: collision with root package name */
    public float f31932k;

    /* renamed from: l, reason: collision with root package name */
    public float f31933l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31934m;

    /* renamed from: n, reason: collision with root package name */
    public float f31935n;

    /* renamed from: o, reason: collision with root package name */
    public float f31936o;

    /* renamed from: p, reason: collision with root package name */
    public float f31937p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31938q;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.E2(parcel, 2, ((a) this.f31927f.f22464b).asBinder());
        c.H2(parcel, 3, this.f31928g, i13, false);
        c.O2(parcel, 4, 4);
        parcel.writeFloat(this.f31929h);
        c.O2(parcel, 5, 4);
        parcel.writeFloat(this.f31930i);
        c.H2(parcel, 6, this.f31931j, i13, false);
        c.O2(parcel, 7, 4);
        parcel.writeFloat(this.f31932k);
        c.O2(parcel, 8, 4);
        parcel.writeFloat(this.f31933l);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f31934m ? 1 : 0);
        c.O2(parcel, 10, 4);
        parcel.writeFloat(this.f31935n);
        c.O2(parcel, 11, 4);
        parcel.writeFloat(this.f31936o);
        c.O2(parcel, 12, 4);
        parcel.writeFloat(this.f31937p);
        c.O2(parcel, 13, 4);
        parcel.writeInt(this.f31938q ? 1 : 0);
        c.N2(parcel, M2);
    }
}
