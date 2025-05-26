package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;
import wh.a;

/* loaded from: classes3.dex */
public final class zzm extends AbstractSafeParcelable {

    /* renamed from: f, reason: collision with root package name */
    public zzj f31272f;

    /* renamed from: g, reason: collision with root package name */
    public List f31273g;

    /* renamed from: h, reason: collision with root package name */
    public String f31274h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f31270i = Collections.emptyList();

    /* renamed from: j, reason: collision with root package name */
    public static final zzj f31271j = new zzj();
    public static final Parcelable.Creator<zzm> CREATOR = new a(13);

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return c.x(this.f31272f, zzmVar.f31272f) && c.x(this.f31273g, zzmVar.f31273g) && c.x(this.f31274h, zzmVar.f31274h);
    }

    public final int hashCode() {
        return this.f31272f.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f31272f, i13, false);
        bs1.c.L2(parcel, 2, this.f31273g, false);
        bs1.c.I2(parcel, 3, this.f31274h, false);
        bs1.c.N2(parcel, M2);
    }
}
