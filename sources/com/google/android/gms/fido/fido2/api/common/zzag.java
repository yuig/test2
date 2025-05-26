package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new lh.a(21);

    /* renamed from: f, reason: collision with root package name */
    public final String f31178f;

    public zzag(String str) {
        com.bumptech.glide.d.t(str);
        this.f31178f = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f31178f.equals(((zzag) obj).f31178f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31178f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, this.f31178f, false);
        bs1.c.N2(parcel, M2);
    }
}
