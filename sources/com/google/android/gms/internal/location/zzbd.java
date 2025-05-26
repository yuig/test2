package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import wh.a;

/* loaded from: classes3.dex */
public final class zzbd extends AbstractSafeParcelable {

    /* renamed from: f, reason: collision with root package name */
    public final LocationRequest f31248f;

    /* renamed from: g, reason: collision with root package name */
    public final List f31249g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31250h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f31251i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f31252j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31253k;

    /* renamed from: l, reason: collision with root package name */
    public final String f31254l;

    /* renamed from: m, reason: collision with root package name */
    public static final List f31247m = Collections.emptyList();
    public static final Parcelable.Creator<zzbd> CREATOR = new a(10);

    public zzbd(LocationRequest locationRequest, List list, String str, boolean z13, boolean z14, boolean z15, String str2) {
        this.f31248f = locationRequest;
        this.f31249g = list;
        this.f31250h = str;
        this.f31251i = z13;
        this.f31252j = z14;
        this.f31253k = z15;
        this.f31254l = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return c.x(this.f31248f, zzbdVar.f31248f) && c.x(this.f31249g, zzbdVar.f31249g) && c.x(this.f31250h, zzbdVar.f31250h) && this.f31251i == zzbdVar.f31251i && this.f31252j == zzbdVar.f31252j && this.f31253k == zzbdVar.f31253k && c.x(this.f31254l, zzbdVar.f31254l);
    }

    public final int hashCode() {
        return this.f31248f.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f31248f);
        String str = this.f31250h;
        if (str != null) {
            sb3.append(" tag=");
            sb3.append(str);
        }
        String str2 = this.f31254l;
        if (str2 != null) {
            sb3.append(" moduleId=");
            sb3.append(str2);
        }
        sb3.append(" hideAppOps=");
        sb3.append(this.f31251i);
        sb3.append(" clients=");
        sb3.append(this.f31249g);
        sb3.append(" forceCoarseLocation=");
        sb3.append(this.f31252j);
        if (this.f31253k) {
            sb3.append(" exemptFromBackgroundThrottle");
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f31248f, i13, false);
        bs1.c.L2(parcel, 5, this.f31249g, false);
        bs1.c.I2(parcel, 6, this.f31250h, false);
        bs1.c.O2(parcel, 7, 4);
        parcel.writeInt(this.f31251i ? 1 : 0);
        bs1.c.O2(parcel, 8, 4);
        parcel.writeInt(this.f31252j ? 1 : 0);
        bs1.c.O2(parcel, 9, 4);
        parcel.writeInt(this.f31253k ? 1 : 0);
        bs1.c.I2(parcel, 10, this.f31254l, false);
        bs1.c.N2(parcel, M2);
    }
}
