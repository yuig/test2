package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import li.d;

/* loaded from: classes3.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new d(5);

    /* renamed from: f, reason: collision with root package name */
    public LatLng f31918f;

    /* renamed from: g, reason: collision with root package name */
    public double f31919g;

    /* renamed from: h, reason: collision with root package name */
    public float f31920h;

    /* renamed from: i, reason: collision with root package name */
    public int f31921i;

    /* renamed from: j, reason: collision with root package name */
    public int f31922j;

    /* renamed from: k, reason: collision with root package name */
    public float f31923k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31924l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31925m;

    /* renamed from: n, reason: collision with root package name */
    public List f31926n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 2, this.f31918f, i13, false);
        c.O2(parcel, 3, 8);
        parcel.writeDouble(this.f31919g);
        c.O2(parcel, 4, 4);
        parcel.writeFloat(this.f31920h);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31921i);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f31922j);
        c.O2(parcel, 7, 4);
        parcel.writeFloat(this.f31923k);
        c.O2(parcel, 8, 4);
        parcel.writeInt(this.f31924l ? 1 : 0);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f31925m ? 1 : 0);
        c.L2(parcel, 10, this.f31926n, false);
        c.N2(parcel, M2);
    }
}
