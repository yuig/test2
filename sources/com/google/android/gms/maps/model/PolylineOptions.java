package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import li.d;

/* loaded from: classes3.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new d(14);

    /* renamed from: f, reason: collision with root package name */
    public final List f31974f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31975g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31976h;

    /* renamed from: i, reason: collision with root package name */
    public final float f31977i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f31978j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31979k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f31980l;

    /* renamed from: m, reason: collision with root package name */
    public final Cap f31981m;

    /* renamed from: n, reason: collision with root package name */
    public final Cap f31982n;

    /* renamed from: o, reason: collision with root package name */
    public final int f31983o;

    /* renamed from: p, reason: collision with root package name */
    public final List f31984p;

    public PolylineOptions(ArrayList arrayList, float f13, int i13, float f14, boolean z13, boolean z14, boolean z15, Cap cap, Cap cap2, int i14, ArrayList arrayList2) {
        this.f31975g = 10.0f;
        this.f31976h = -16777216;
        this.f31977i = 0.0f;
        this.f31978j = true;
        this.f31979k = false;
        this.f31980l = false;
        this.f31981m = new ButtCap();
        this.f31982n = new ButtCap();
        this.f31983o = 0;
        this.f31984p = null;
        this.f31974f = arrayList;
        this.f31975g = f13;
        this.f31976h = i13;
        this.f31977i = f14;
        this.f31978j = z13;
        this.f31979k = z14;
        this.f31980l = z15;
        if (cap != null) {
            this.f31981m = cap;
        }
        if (cap2 != null) {
            this.f31982n = cap2;
        }
        this.f31983o = i14;
        this.f31984p = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.L2(parcel, 2, this.f31974f, false);
        c.O2(parcel, 3, 4);
        parcel.writeFloat(this.f31975g);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31976h);
        c.O2(parcel, 5, 4);
        parcel.writeFloat(this.f31977i);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f31978j ? 1 : 0);
        c.O2(parcel, 7, 4);
        parcel.writeInt(this.f31979k ? 1 : 0);
        c.O2(parcel, 8, 4);
        parcel.writeInt(this.f31980l ? 1 : 0);
        c.H2(parcel, 9, this.f31981m, i13, false);
        c.H2(parcel, 10, this.f31982n, i13, false);
        c.O2(parcel, 11, 4);
        parcel.writeInt(this.f31983o);
        c.L2(parcel, 12, this.f31984p, false);
        c.N2(parcel, M2);
    }
}
