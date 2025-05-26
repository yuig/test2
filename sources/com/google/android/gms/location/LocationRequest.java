package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import wh.a;

/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new a(17);

    /* renamed from: f, reason: collision with root package name */
    public int f31843f = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;

    /* renamed from: g, reason: collision with root package name */
    public long f31844g = 3600000;

    /* renamed from: h, reason: collision with root package name */
    public long f31845h = 600000;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31846i = false;

    /* renamed from: j, reason: collision with root package name */
    public long f31847j = Long.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f31848k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public float f31849l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f31850m = 0;

    public static void k1(long j13) {
        if (j13 >= 0) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(38);
        sb3.append("invalid interval: ");
        sb3.append(j13);
        throw new IllegalArgumentException(sb3.toString());
    }

    public final void e(long j13) {
        k1(j13);
        this.f31846i = true;
        this.f31845h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f31843f == locationRequest.f31843f) {
            long j13 = this.f31844g;
            long j14 = locationRequest.f31844g;
            if (j13 == j14 && this.f31845h == locationRequest.f31845h && this.f31846i == locationRequest.f31846i && this.f31847j == locationRequest.f31847j && this.f31848k == locationRequest.f31848k && this.f31849l == locationRequest.f31849l) {
                long j15 = this.f31850m;
                if (j15 >= j13) {
                    j13 = j15;
                }
                long j16 = locationRequest.f31850m;
                if (j16 >= j14) {
                    j14 = j16;
                }
                if (j13 == j14) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j13) {
        k1(j13);
        this.f31844g = j13;
        if (this.f31846i) {
            return;
        }
        this.f31845h = (long) (j13 / 6.0d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31843f), Long.valueOf(this.f31844g), Float.valueOf(this.f31849l), Long.valueOf(this.f31850m)});
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Request[");
        int i13 = this.f31843f;
        sb3.append(i13 != 100 ? i13 != 102 ? i13 != 104 ? i13 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f31843f != 105) {
            sb3.append(" requested=");
            sb3.append(this.f31844g);
            sb3.append("ms");
        }
        sb3.append(" fastest=");
        sb3.append(this.f31845h);
        sb3.append("ms");
        long j13 = this.f31844g;
        long j14 = this.f31850m;
        if (j14 > j13) {
            sb3.append(" maxWait=");
            sb3.append(j14);
            sb3.append("ms");
        }
        float f13 = this.f31849l;
        if (f13 > 0.0f) {
            sb3.append(" smallestDisplacement=");
            sb3.append(f13);
            sb3.append("m");
        }
        long j15 = this.f31847j;
        if (j15 != Long.MAX_VALUE) {
            long elapsedRealtime = j15 - SystemClock.elapsedRealtime();
            sb3.append(" expireIn=");
            sb3.append(elapsedRealtime);
            sb3.append("ms");
        }
        int i14 = this.f31848k;
        if (i14 != Integer.MAX_VALUE) {
            sb3.append(" num=");
            sb3.append(i14);
        }
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int i14 = this.f31843f;
        c.O2(parcel, 1, 4);
        parcel.writeInt(i14);
        long j13 = this.f31844g;
        c.O2(parcel, 2, 8);
        parcel.writeLong(j13);
        long j14 = this.f31845h;
        c.O2(parcel, 3, 8);
        parcel.writeLong(j14);
        boolean z13 = this.f31846i;
        c.O2(parcel, 4, 4);
        parcel.writeInt(z13 ? 1 : 0);
        c.O2(parcel, 5, 8);
        parcel.writeLong(this.f31847j);
        c.O2(parcel, 6, 4);
        parcel.writeInt(this.f31848k);
        c.O2(parcel, 7, 4);
        parcel.writeFloat(this.f31849l);
        c.O2(parcel, 8, 8);
        parcel.writeLong(this.f31850m);
        c.N2(parcel, M2);
    }
}
