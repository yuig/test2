package com.google.android.gms.maps.model;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new d(19);

    /* renamed from: g, reason: collision with root package name */
    public static final StreetViewSource f31995g = new StreetViewSource(0);

    /* renamed from: f, reason: collision with root package name */
    public final int f31996f;

    public StreetViewSource(int i13) {
        this.f31996f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f31996f == ((StreetViewSource) obj).f31996f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31996f)});
    }

    public final String toString() {
        int i13 = this.f31996f;
        return "StreetViewSource:".concat(i13 != 0 ? i13 != 1 ? a.e("UNKNOWN(", i13, ")") : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31996f);
        c.N2(parcel, M2);
    }
}
