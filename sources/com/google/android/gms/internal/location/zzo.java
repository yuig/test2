package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hi.c;
import hi.g;
import li.e;
import li.f;
import wh.a;

/* loaded from: classes3.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new a(14);

    /* renamed from: f, reason: collision with root package name */
    public final int f31275f;

    /* renamed from: g, reason: collision with root package name */
    public final zzm f31276g;

    /* renamed from: h, reason: collision with root package name */
    public final e f31277h;

    /* renamed from: i, reason: collision with root package name */
    public final hi.a f31278i;

    public zzo(int i13, zzm zzmVar, IBinder iBinder, IBinder iBinder2) {
        e fVar;
        this.f31275f = i13;
        this.f31276g = zzmVar;
        hi.a aVar = null;
        if (iBinder == null) {
            fVar = null;
        } else {
            int i14 = g.f69232a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            fVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new f(iBinder, "com.google.android.gms.location.IDeviceOrientationListener", 3);
        }
        this.f31277h = fVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            aVar = queryLocalInterface2 instanceof hi.a ? (hi.a) queryLocalInterface2 : new c(iBinder2);
        }
        this.f31278i = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31275f);
        bs1.c.H2(parcel, 2, this.f31276g, i13, false);
        e eVar = this.f31277h;
        bs1.c.E2(parcel, 3, eVar == null ? null : eVar.asBinder());
        hi.a aVar = this.f31278i;
        bs1.c.E2(parcel, 4, aVar != null ? aVar.asBinder() : null);
        bs1.c.N2(parcel, M2);
    }
}
