package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new u1(11);

    /* renamed from: f, reason: collision with root package name */
    public final int f30967f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30968g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30969h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30970i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30971j;

    public RootTelemetryConfiguration(int i13, int i14, int i15, boolean z13, boolean z14) {
        this.f30967f = i13;
        this.f30968g = z13;
        this.f30969h = z14;
        this.f30970i = i14;
        this.f30971j = i15;
    }

    public final int e() {
        return this.f30970i;
    }

    public final int f() {
        return this.f30971j;
    }

    public final boolean k1() {
        return this.f30969h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30967f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30968g ? 1 : 0);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30969h ? 1 : 0);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30970i);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30971j);
        c.N2(parcel, M2);
    }

    public final int x1() {
        return this.f30967f;
    }
}
