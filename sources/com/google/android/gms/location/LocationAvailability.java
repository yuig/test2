package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import wh.a;

/* loaded from: classes3.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a(16);

    /* renamed from: f, reason: collision with root package name */
    public int f31838f;

    /* renamed from: g, reason: collision with root package name */
    public int f31839g;

    /* renamed from: h, reason: collision with root package name */
    public long f31840h;

    /* renamed from: i, reason: collision with root package name */
    public int f31841i;

    /* renamed from: j, reason: collision with root package name */
    public zzaj[] f31842j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f31838f == locationAvailability.f31838f && this.f31839g == locationAvailability.f31839g && this.f31840h == locationAvailability.f31840h && this.f31841i == locationAvailability.f31841i && Arrays.equals(this.f31842j, locationAvailability.f31842j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31841i), Integer.valueOf(this.f31838f), Integer.valueOf(this.f31839g), Long.valueOf(this.f31840h), this.f31842j});
    }

    public final String toString() {
        boolean z13 = this.f31841i < 1000;
        StringBuilder sb3 = new StringBuilder(48);
        sb3.append("LocationAvailability[isLocationAvailable: ");
        sb3.append(z13);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31838f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31839g);
        c.O2(parcel, 3, 8);
        parcel.writeLong(this.f31840h);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31841i);
        c.K2(parcel, 5, this.f31842j, i13);
        c.N2(parcel, M2);
    }
}
