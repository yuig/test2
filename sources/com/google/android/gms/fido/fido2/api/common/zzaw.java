package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new vh.f(1);

    /* renamed from: f, reason: collision with root package name */
    public final String f31185f;

    public zzaw(String str) {
        this.f31185f = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            return com.bumptech.glide.c.x(this.f31185f, ((zzaw) obj).f31185f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31185f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, this.f31185f, false);
        bs1.c.N2(parcel, M2);
    }
}
