package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bb.p;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import li.d;
import rh.a;

/* loaded from: classes3.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new d(4);

    /* renamed from: f, reason: collision with root package name */
    public final int f31915f;

    /* renamed from: g, reason: collision with root package name */
    public final p f31916g;

    /* renamed from: h, reason: collision with root package name */
    public final Float f31917h;

    public Cap(int i13, p pVar, Float f13) {
        boolean z13 = true;
        boolean z14 = f13 != null && f13.floatValue() > 0.0f;
        if (i13 == 3 && (pVar == null || !z14)) {
            z13 = false;
        }
        com.bumptech.glide.d.i("Invalid Cap: type=" + i13 + " bitmapDescriptor=" + pVar + " bitmapRefWidth=" + f13, z13);
        this.f31915f = i13;
        this.f31916g = pVar;
        this.f31917h = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f31915f == cap.f31915f && c.x(this.f31916g, cap.f31916g) && c.x(this.f31917h, cap.f31917h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31915f), this.f31916g, this.f31917h});
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append("[Cap: type=");
        sb3.append(this.f31915f);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31915f);
        p pVar = this.f31916g;
        bs1.c.E2(parcel, 3, pVar == null ? null : ((a) pVar.f22464b).asBinder());
        bs1.c.D2(parcel, 4, this.f31917h);
        bs1.c.N2(parcel, M2);
    }
}
