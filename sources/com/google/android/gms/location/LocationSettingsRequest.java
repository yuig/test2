package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wh.a;

/* loaded from: classes3.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new a(20);

    /* renamed from: f, reason: collision with root package name */
    public final List f31853f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31854g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31855h;

    /* renamed from: i, reason: collision with root package name */
    public final zzae f31856i;

    public LocationSettingsRequest(ArrayList arrayList, boolean z13, boolean z14, zzae zzaeVar) {
        this.f31853f = arrayList;
        this.f31854g = z13;
        this.f31855h = z14;
        this.f31856i = zzaeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.L2(parcel, 1, Collections.unmodifiableList(this.f31853f), false);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31854g ? 1 : 0);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31855h ? 1 : 0);
        c.H2(parcel, 5, this.f31856i, i13, false);
        c.N2(parcel, M2);
    }
}
