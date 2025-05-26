package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;
import rl2.g0;

/* loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new a(15);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31065f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31066g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31067h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31068i;

    public zzq(String str, int i13, int i14, boolean z13) {
        this.f31065f = z13;
        this.f31066g = str;
        this.f31067h = g0.m0(i13) - 1;
        int i15 = 1;
        int[] iArr = {1, 2, 3};
        int i16 = 0;
        while (true) {
            if (i16 >= 3) {
                break;
            }
            int i17 = iArr[i16];
            int i18 = i17 - 1;
            if (i17 == 0) {
                throw null;
            }
            if (i18 == i14) {
                i15 = i17;
                break;
            }
            i16++;
        }
        this.f31068i = i15 - 1;
    }

    public final String e() {
        return this.f31066g;
    }

    public final boolean f() {
        return this.f31065f;
    }

    public final int k1() {
        int[] iArr = {1, 2, 3};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr[i13];
            int i15 = i14 - 1;
            if (i14 == 0) {
                throw null;
            }
            if (i15 == this.f31068i) {
                return i14;
            }
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31065f ? 1 : 0);
        c.I2(parcel, 2, this.f31066g, false);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31067h);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31068i);
        c.N2(parcel, M2);
    }

    public final int x1() {
        return g0.m0(this.f31067h);
    }
}
