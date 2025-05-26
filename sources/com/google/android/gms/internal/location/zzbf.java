package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hi.c;
import hi.h;
import li.g;
import li.i;
import li.j;
import li.k;
import wh.a;

/* loaded from: classes3.dex */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new a(11);

    /* renamed from: f, reason: collision with root package name */
    public final int f31255f;

    /* renamed from: g, reason: collision with root package name */
    public final zzbd f31256g;

    /* renamed from: h, reason: collision with root package name */
    public final j f31257h;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f31258i;

    /* renamed from: j, reason: collision with root package name */
    public final g f31259j;

    /* renamed from: k, reason: collision with root package name */
    public final hi.a f31260k;

    public zzbf(int i13, zzbd zzbdVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        j kVar;
        g iVar;
        this.f31255f = i13;
        this.f31256g = zzbdVar;
        hi.a aVar = null;
        if (iBinder == null) {
            kVar = null;
        } else {
            int i14 = h.f69233a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            kVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new k(iBinder, "com.google.android.gms.location.ILocationListener", 3);
        }
        this.f31257h = kVar;
        this.f31258i = pendingIntent;
        if (iBinder2 == null) {
            iVar = null;
        } else {
            int i15 = li.h.f83535a;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            iVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new i(iBinder2, "com.google.android.gms.location.ILocationCallback", 3);
        }
        this.f31259j = iVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            aVar = queryLocalInterface3 instanceof hi.a ? (hi.a) queryLocalInterface3 : new c(iBinder3);
        }
        this.f31260k = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31255f);
        bs1.c.H2(parcel, 2, this.f31256g, i13, false);
        j jVar = this.f31257h;
        bs1.c.E2(parcel, 3, jVar == null ? null : jVar.asBinder());
        bs1.c.H2(parcel, 4, this.f31258i, i13, false);
        g gVar = this.f31259j;
        bs1.c.E2(parcel, 5, gVar == null ? null : gVar.asBinder());
        hi.a aVar = this.f31260k;
        bs1.c.E2(parcel, 6, aVar != null ? aVar.asBinder() : null);
        bs1.c.N2(parcel, M2);
    }
}
