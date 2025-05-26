package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wh.a;

/* loaded from: classes3.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new a(22);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31859f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31860g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31861h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f31862i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f31863j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31864k;

    public LocationSettingsStates(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f31859f = z13;
        this.f31860g = z14;
        this.f31861h = z15;
        this.f31862i = z16;
        this.f31863j = z17;
        this.f31864k = z18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31859f ? 1 : 0);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31860g ? 1 : 0);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31861h ? 1 : 0);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31862i ? 1 : 0);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31863j ? 1 : 0);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f31864k ? 1 : 0);
        c.N2(parcel, M2);
    }
}
