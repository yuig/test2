package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;

/* loaded from: classes3.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new d(20);

    /* renamed from: f, reason: collision with root package name */
    public final int f31997f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31998g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f31999h;

    public Tile(byte[] bArr, int i13, int i14) {
        this.f31997f = i13;
        this.f31998g = i14;
        this.f31999h = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31997f);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31998g);
        c.B2(parcel, 4, this.f31999h, false);
        c.N2(parcel, M2);
    }
}
