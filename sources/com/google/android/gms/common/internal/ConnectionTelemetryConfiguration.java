package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new b(29);

    /* renamed from: f, reason: collision with root package name */
    public final RootTelemetryConfiguration f30936f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30937g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30938h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f30939i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30940j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f30941k;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z13, boolean z14, int[] iArr, int i13, int[] iArr2) {
        this.f30936f = rootTelemetryConfiguration;
        this.f30937g = z13;
        this.f30938h = z14;
        this.f30939i = iArr;
        this.f30940j = i13;
        this.f30941k = iArr2;
    }

    public final int e() {
        return this.f30940j;
    }

    public final int[] f() {
        return this.f30939i;
    }

    public final int[] k1() {
        return this.f30941k;
    }

    public final boolean l2() {
        return this.f30938h;
    }

    public final RootTelemetryConfiguration m2() {
        return this.f30936f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 1, this.f30936f, i13, false);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30937g ? 1 : 0);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30938h ? 1 : 0);
        int[] iArr = this.f30939i;
        if (iArr != null) {
            int M22 = c.M2(parcel, 4);
            parcel.writeIntArray(iArr);
            c.N2(parcel, M22);
        }
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30940j);
        int[] iArr2 = this.f30941k;
        if (iArr2 != null) {
            int M23 = c.M2(parcel, 6);
            parcel.writeIntArray(iArr2);
            c.N2(parcel, M23);
        }
        c.N2(parcel, M2);
    }

    public final boolean x1() {
        return this.f30937g;
    }
}
