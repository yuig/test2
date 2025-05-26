package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import ao2.m0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gi.j1;
import gi.k1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new lh.a(22);

    /* renamed from: f, reason: collision with root package name */
    public final j1 f31179f;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f31180g;

    /* renamed from: h, reason: collision with root package name */
    public final j1 f31181h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31182i;

    public zzai(k1 k1Var, k1 k1Var2, k1 k1Var3, int i13) {
        this.f31179f = k1Var;
        this.f31180g = k1Var2;
        this.f31181h = k1Var3;
        this.f31182i = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return com.bumptech.glide.c.x(this.f31179f, zzaiVar.f31179f) && com.bumptech.glide.c.x(this.f31180g, zzaiVar.f31180g) && com.bumptech.glide.c.x(this.f31181h, zzaiVar.f31181h) && this.f31182i == zzaiVar.f31182i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31179f, this.f31180g, this.f31181h, Integer.valueOf(this.f31182i)});
    }

    public final String toString() {
        j1 j1Var = this.f31179f;
        String s13 = m0.s(j1Var == null ? null : j1Var.n());
        j1 j1Var2 = this.f31180g;
        String s14 = m0.s(j1Var2 == null ? null : j1Var2.n());
        j1 j1Var3 = this.f31181h;
        String s15 = m0.s(j1Var3 != null ? j1Var3.n() : null);
        StringBuilder w13 = a.a.w("HmacSecretExtension{coseKeyAgreement=", s13, ", saltEnc=", s14, ", saltAuth=");
        w13.append(s15);
        w13.append(", getPinUvAuthProtocol=");
        return a.a.n(w13, this.f31182i, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        j1 j1Var = this.f31179f;
        bs1.c.B2(parcel, 1, j1Var == null ? null : j1Var.n(), false);
        j1 j1Var2 = this.f31180g;
        bs1.c.B2(parcel, 2, j1Var2 == null ? null : j1Var2.n(), false);
        j1 j1Var3 = this.f31181h;
        bs1.c.B2(parcel, 3, j1Var3 != null ? j1Var3.n() : null, false);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31182i);
        bs1.c.N2(parcel, M2);
    }
}
