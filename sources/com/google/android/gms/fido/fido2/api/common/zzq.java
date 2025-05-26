package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gi.j1;
import gi.k1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new vh.f(18);

    /* renamed from: f, reason: collision with root package name */
    public final long f31190f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f31191g;

    /* renamed from: h, reason: collision with root package name */
    public final k1 f31192h;

    /* renamed from: i, reason: collision with root package name */
    public final k1 f31193i;

    public zzq(long j13, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        com.bumptech.glide.d.t(bArr);
        k1 l13 = j1.l(bArr, bArr.length);
        com.bumptech.glide.d.t(bArr2);
        k1 l14 = j1.l(bArr2, bArr2.length);
        com.bumptech.glide.d.t(bArr3);
        k1 l15 = j1.l(bArr3, bArr3.length);
        this.f31190f = j13;
        this.f31191g = l13;
        this.f31192h = l14;
        this.f31193i = l15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f31190f == zzqVar.f31190f && com.bumptech.glide.c.x(this.f31191g, zzqVar.f31191g) && com.bumptech.glide.c.x(this.f31192h, zzqVar.f31192h) && com.bumptech.glide.c.x(this.f31193i, zzqVar.f31193i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31190f), this.f31191g, this.f31192h, this.f31193i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 8);
        parcel.writeLong(this.f31190f);
        bs1.c.B2(parcel, 2, this.f31191g.n(), false);
        bs1.c.B2(parcel, 3, this.f31192h.n(), false);
        bs1.c.B2(parcel, 4, this.f31193i.n(), false);
        bs1.c.N2(parcel, M2);
    }
}
