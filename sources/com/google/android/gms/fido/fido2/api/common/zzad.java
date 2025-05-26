package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new lh.a(19);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31177f;

    public zzad(boolean z13) {
        this.f31177f = Boolean.valueOf(z13).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzad) && this.f31177f == ((zzad) obj).f31177f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31177f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31177f ? 1 : 0);
        bs1.c.N2(parcel, M2);
    }
}
