package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gi.j1;
import gi.k1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new vh.f(10);

    /* renamed from: f, reason: collision with root package name */
    public final j1 f31186f;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f31187g;

    public zzf(k1 k1Var, k1 k1Var2) {
        this.f31186f = k1Var;
        this.f31187g = k1Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return com.bumptech.glide.c.x(this.f31186f, zzfVar.f31186f) && com.bumptech.glide.c.x(this.f31187g, zzfVar.f31187g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31186f, this.f31187g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        j1 j1Var = this.f31186f;
        bs1.c.B2(parcel, 1, j1Var == null ? null : j1Var.n(), false);
        j1 j1Var2 = this.f31187g;
        bs1.c.B2(parcel, 2, j1Var2 != null ? j1Var2.n() : null, false);
        bs1.c.N2(parcel, M2);
    }
}
