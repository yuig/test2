package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bs1.c;
import java.util.ArrayList;
import java.util.List;
import lh.a;

@Deprecated
/* loaded from: classes3.dex */
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new a(13);

    /* renamed from: f, reason: collision with root package name */
    public final int f31044f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31045g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31046h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31047i;

    /* renamed from: j, reason: collision with root package name */
    public final String f31048j;

    /* renamed from: k, reason: collision with root package name */
    public final String f31049k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31050l;

    /* renamed from: m, reason: collision with root package name */
    public final List f31051m;

    /* renamed from: n, reason: collision with root package name */
    public final String f31052n;

    /* renamed from: o, reason: collision with root package name */
    public final long f31053o;

    /* renamed from: p, reason: collision with root package name */
    public final int f31054p;

    /* renamed from: q, reason: collision with root package name */
    public final String f31055q;

    /* renamed from: r, reason: collision with root package name */
    public final float f31056r;

    /* renamed from: s, reason: collision with root package name */
    public final long f31057s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f31058t;

    public WakeLockEvent(int i13, long j13, int i14, String str, int i15, ArrayList arrayList, String str2, long j14, int i16, String str3, String str4, float f13, long j15, String str5, boolean z13) {
        this.f31044f = i13;
        this.f31045g = j13;
        this.f31046h = i14;
        this.f31047i = str;
        this.f31048j = str3;
        this.f31049k = str5;
        this.f31050l = i15;
        this.f31051m = arrayList;
        this.f31052n = str2;
        this.f31053o = j14;
        this.f31054p = i16;
        this.f31055q = str4;
        this.f31056r = f13;
        this.f31057s = j15;
        this.f31058t = z13;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int e() {
        return this.f31046h;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long f() {
        return this.f31045g;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String k1() {
        List list = this.f31051m;
        String join = list == null ? "" : TextUtils.join(",", list);
        StringBuilder sb3 = new StringBuilder("\t");
        sb3.append(this.f31047i);
        sb3.append("\t");
        a.a.A(sb3, this.f31050l, "\t", join, "\t");
        sb3.append(this.f31054p);
        sb3.append("\t");
        String str = this.f31048j;
        if (str == null) {
            str = "";
        }
        sb3.append(str);
        sb3.append("\t");
        String str2 = this.f31055q;
        if (str2 == null) {
            str2 = "";
        }
        sb3.append(str2);
        sb3.append("\t");
        sb3.append(this.f31056r);
        sb3.append("\t");
        String str3 = this.f31049k;
        sb3.append(str3 != null ? str3 : "");
        sb3.append("\t");
        sb3.append(this.f31058t);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31044f);
        c.O2(parcel, 2, 8);
        parcel.writeLong(this.f31045g);
        c.I2(parcel, 4, this.f31047i, false);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31050l);
        c.J2(parcel, 6, this.f31051m);
        c.O2(parcel, 8, 8);
        parcel.writeLong(this.f31053o);
        c.I2(parcel, 10, this.f31048j, false);
        c.O2(parcel, 11, 4);
        parcel.writeInt(this.f31046h);
        c.I2(parcel, 12, this.f31052n, false);
        c.I2(parcel, 13, this.f31055q, false);
        c.O2(parcel, 14, 4);
        parcel.writeInt(this.f31054p);
        c.O2(parcel, 15, 4);
        parcel.writeFloat(this.f31056r);
        c.O2(parcel, 16, 8);
        parcel.writeLong(this.f31057s);
        c.I2(parcel, 17, this.f31049k, false);
        c.O2(parcel, 18, 4);
        parcel.writeInt(this.f31058t ? 1 : 0);
        c.N2(parcel, M2);
    }
}
