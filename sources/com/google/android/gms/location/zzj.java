package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import li.d;

/* loaded from: classes3.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new d(1);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31879f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31880g;

    /* renamed from: h, reason: collision with root package name */
    public final float f31881h;

    /* renamed from: i, reason: collision with root package name */
    public final long f31882i;

    /* renamed from: j, reason: collision with root package name */
    public final int f31883j;

    public zzj() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return this.f31879f == zzjVar.f31879f && this.f31880g == zzjVar.f31880g && Float.compare(this.f31881h, zzjVar.f31881h) == 0 && this.f31882i == zzjVar.f31882i && this.f31883j == zzjVar.f31883j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31879f), Long.valueOf(this.f31880g), Float.valueOf(this.f31881h), Long.valueOf(this.f31882i), Integer.valueOf(this.f31883j)});
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb3.append(this.f31879f);
        sb3.append(" mMinimumSamplingPeriodMs=");
        sb3.append(this.f31880g);
        sb3.append(" mSmallestAngleChangeRadians=");
        sb3.append(this.f31881h);
        long j13 = this.f31882i;
        if (j13 != Long.MAX_VALUE) {
            long elapsedRealtime = j13 - SystemClock.elapsedRealtime();
            sb3.append(" expireIn=");
            sb3.append(elapsedRealtime);
            sb3.append("ms");
        }
        int i13 = this.f31883j;
        if (i13 != Integer.MAX_VALUE) {
            sb3.append(" num=");
            sb3.append(i13);
        }
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31879f ? 1 : 0);
        c.O2(parcel, 2, 8);
        parcel.writeLong(this.f31880g);
        c.O2(parcel, 3, 4);
        parcel.writeFloat(this.f31881h);
        c.O2(parcel, 4, 8);
        parcel.writeLong(this.f31882i);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31883j);
        c.N2(parcel, M2);
    }

    public zzj(boolean z13, long j13, float f13, long j14, int i13) {
        this.f31879f = z13;
        this.f31880g = j13;
        this.f31881h = f13;
        this.f31882i = j14;
        this.f31883j = i13;
    }
}
