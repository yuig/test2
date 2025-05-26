package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ii.a;
import li.d;

/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new d(21);

    /* renamed from: f, reason: collision with root package name */
    public a f32000f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32001g;

    /* renamed from: h, reason: collision with root package name */
    public float f32002h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32003i;

    /* renamed from: j, reason: collision with root package name */
    public float f32004j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.E2(parcel, 2, this.f32000f.asBinder());
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f32001g ? 1 : 0);
        c.O2(parcel, 4, 4);
        parcel.writeFloat(this.f32002h);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f32003i ? 1 : 0);
        c.O2(parcel, 6, 4);
        parcel.writeFloat(this.f32004j);
        c.N2(parcel, M2);
    }
}
