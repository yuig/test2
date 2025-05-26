package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;
import jh.a;
import jh.j;
import jh.m0;

/* loaded from: classes3.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new b(25);

    /* renamed from: f */
    public final int f30978f;

    /* renamed from: g */
    public final IBinder f30979g;

    /* renamed from: h */
    public final ConnectionResult f30980h;

    /* renamed from: i */
    public final boolean f30981i;

    /* renamed from: j */
    public final boolean f30982j;

    public zav(int i13, IBinder iBinder, ConnectionResult connectionResult, boolean z13, boolean z14) {
        this.f30978f = i13;
        this.f30979g = iBinder;
        this.f30980h = connectionResult;
        this.f30981i = z13;
        this.f30982j = z14;
    }

    public final boolean equals(Object obj) {
        Object m0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.f30980h.equals(zavVar.f30980h)) {
            Object obj2 = null;
            IBinder iBinder = this.f30979g;
            if (iBinder == null) {
                m0Var = null;
            } else {
                int i13 = a.f76135b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                m0Var = queryLocalInterface instanceof j ? (j) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = zavVar.f30979g;
            if (iBinder2 != null) {
                int i14 = a.f76135b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof j ? (j) queryLocalInterface2 : new m0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (c.x(m0Var, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30978f);
        bs1.c.E2(parcel, 2, this.f30979g);
        bs1.c.H2(parcel, 3, this.f30980h, i13, false);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30981i ? 1 : 0);
        bs1.c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30982j ? 1 : 0);
        bs1.c.N2(parcel, M2);
    }
}
