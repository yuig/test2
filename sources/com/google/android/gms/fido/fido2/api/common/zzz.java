package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new lh.a(17);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31195f;

    public zzz(boolean z13) {
        this.f31195f = Boolean.valueOf(z13).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.f31195f == ((zzz) obj).f31195f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31195f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31195f ? 1 : 0);
        bs1.c.N2(parcel, M2);
    }
}
