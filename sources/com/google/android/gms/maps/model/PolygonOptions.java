package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import li.d;

/* loaded from: classes3.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new d(13);

    /* renamed from: f, reason: collision with root package name */
    public final List f31963f;

    /* renamed from: g, reason: collision with root package name */
    public final List f31964g;

    /* renamed from: h, reason: collision with root package name */
    public final float f31965h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31966i;

    /* renamed from: j, reason: collision with root package name */
    public final int f31967j;

    /* renamed from: k, reason: collision with root package name */
    public final float f31968k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f31969l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f31970m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f31971n;

    /* renamed from: o, reason: collision with root package name */
    public final int f31972o;

    /* renamed from: p, reason: collision with root package name */
    public final List f31973p;

    public PolygonOptions(ArrayList arrayList, ArrayList arrayList2, float f13, int i13, int i14, float f14, boolean z13, boolean z14, boolean z15, int i15, ArrayList arrayList3) {
        this.f31963f = arrayList;
        this.f31964g = arrayList2;
        this.f31965h = f13;
        this.f31966i = i13;
        this.f31967j = i14;
        this.f31968k = f14;
        this.f31969l = z13;
        this.f31970m = z14;
        this.f31971n = z15;
        this.f31972o = i15;
        this.f31973p = arrayList3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.L2(parcel, 2, this.f31963f, false);
        List list = this.f31964g;
        if (list != null) {
            int M22 = c.M2(parcel, 3);
            parcel.writeList(list);
            c.N2(parcel, M22);
        }
        c.O2(parcel, 4, 4);
        parcel.writeFloat(this.f31965h);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31966i);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f31967j);
        c.O2(parcel, 7, 4);
        parcel.writeFloat(this.f31968k);
        c.O2(parcel, 8, 4);
        parcel.writeInt(this.f31969l ? 1 : 0);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f31970m ? 1 : 0);
        c.O2(parcel, 10, 4);
        parcel.writeInt(this.f31971n ? 1 : 0);
        c.O2(parcel, 11, 4);
        parcel.writeInt(this.f31972o);
        c.L2(parcel, 12, this.f31973p, false);
        c.N2(parcel, M2);
    }
}
