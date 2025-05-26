package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new lh.a(18);

    /* renamed from: f, reason: collision with root package name */
    public final long f31176f;

    public zzab(long j13) {
        this.f31176f = Long.valueOf(j13).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.f31176f == ((zzab) obj).f31176f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31176f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 8);
        parcel.writeLong(this.f31176f);
        bs1.c.N2(parcel, M2);
    }
}
