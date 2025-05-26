package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new b(23);

    /* renamed from: f, reason: collision with root package name */
    public final int f30958f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30959g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30960h;

    /* renamed from: i, reason: collision with root package name */
    public final long f30961i;

    /* renamed from: j, reason: collision with root package name */
    public final long f30962j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30963k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30964l;

    /* renamed from: m, reason: collision with root package name */
    public final int f30965m;

    /* renamed from: n, reason: collision with root package name */
    public final int f30966n;

    public MethodInvocation(int i13, int i14, int i15, long j13, long j14, String str, String str2, int i16, int i17) {
        this.f30958f = i13;
        this.f30959g = i14;
        this.f30960h = i15;
        this.f30961i = j13;
        this.f30962j = j14;
        this.f30963k = str;
        this.f30964l = str2;
        this.f30965m = i16;
        this.f30966n = i17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30958f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30959g);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30960h);
        c.O2(parcel, 4, 8);
        parcel.writeLong(this.f30961i);
        c.O2(parcel, 5, 8);
        parcel.writeLong(this.f30962j);
        c.I2(parcel, 6, this.f30963k, false);
        c.I2(parcel, 7, this.f30964l, false);
        c.O2(parcel, 8, 4);
        parcel.writeInt(this.f30965m);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f30966n);
        c.N2(parcel, M2);
    }
}
