package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bb.p;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;
import rh.a;

/* loaded from: classes3.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new d(10);

    /* renamed from: f, reason: collision with root package name */
    public LatLng f31944f;

    /* renamed from: g, reason: collision with root package name */
    public String f31945g;

    /* renamed from: h, reason: collision with root package name */
    public String f31946h;

    /* renamed from: i, reason: collision with root package name */
    public p f31947i;

    /* renamed from: j, reason: collision with root package name */
    public float f31948j;

    /* renamed from: k, reason: collision with root package name */
    public float f31949k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31950l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31951m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31952n;

    /* renamed from: o, reason: collision with root package name */
    public float f31953o;

    /* renamed from: p, reason: collision with root package name */
    public float f31954p;

    /* renamed from: q, reason: collision with root package name */
    public float f31955q;

    /* renamed from: r, reason: collision with root package name */
    public float f31956r;

    /* renamed from: s, reason: collision with root package name */
    public float f31957s;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f31944f, i13, false);
        c.I2(parcel, 3, this.f31945g, false);
        c.I2(parcel, 4, this.f31946h, false);
        p pVar = this.f31947i;
        c.E2(parcel, 5, pVar == null ? null : ((a) pVar.f22464b).asBinder());
        c.O2(parcel, 6, 4);
        parcel.writeFloat(this.f31948j);
        c.O2(parcel, 7, 4);
        parcel.writeFloat(this.f31949k);
        c.O2(parcel, 8, 4);
        parcel.writeInt(this.f31950l ? 1 : 0);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f31951m ? 1 : 0);
        c.O2(parcel, 10, 4);
        parcel.writeInt(this.f31952n ? 1 : 0);
        c.O2(parcel, 11, 4);
        parcel.writeFloat(this.f31953o);
        c.O2(parcel, 12, 4);
        parcel.writeFloat(this.f31954p);
        c.O2(parcel, 13, 4);
        parcel.writeFloat(this.f31955q);
        c.O2(parcel, 14, 4);
        parcel.writeFloat(this.f31956r);
        c.O2(parcel, 15, 4);
        parcel.writeFloat(this.f31957s);
        c.N2(parcel, M2);
    }
}
