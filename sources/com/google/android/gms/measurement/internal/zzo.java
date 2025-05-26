package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import oi.e7;

/* loaded from: classes3.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new e7(1);
    public final String A;
    public final String B;
    public final String C;
    public final boolean D;
    public final long E;
    public final int F;
    public final String G;
    public final int H;
    public final long I;

    /* renamed from: f, reason: collision with root package name */
    public final String f32044f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32045g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32046h;

    /* renamed from: i, reason: collision with root package name */
    public final String f32047i;

    /* renamed from: j, reason: collision with root package name */
    public final long f32048j;

    /* renamed from: k, reason: collision with root package name */
    public final long f32049k;

    /* renamed from: l, reason: collision with root package name */
    public final String f32050l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f32051m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f32052n;

    /* renamed from: o, reason: collision with root package name */
    public final long f32053o;

    /* renamed from: p, reason: collision with root package name */
    public final String f32054p;

    /* renamed from: q, reason: collision with root package name */
    public final long f32055q;

    /* renamed from: r, reason: collision with root package name */
    public final long f32056r;

    /* renamed from: s, reason: collision with root package name */
    public final int f32057s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f32058t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f32059u;

    /* renamed from: v, reason: collision with root package name */
    public final String f32060v;

    /* renamed from: w, reason: collision with root package name */
    public final Boolean f32061w;

    /* renamed from: x, reason: collision with root package name */
    public final long f32062x;

    /* renamed from: y, reason: collision with root package name */
    public final List f32063y;

    /* renamed from: z, reason: collision with root package name */
    public final String f32064z;

    public zzo(String str, String str2, String str3, long j13, String str4, long j14, long j15, String str5, boolean z13, boolean z14, String str6, long j16, int i13, boolean z15, boolean z16, String str7, Boolean bool, long j17, List list, String str8, String str9, String str10, boolean z17, long j18, int i14, String str11, int i15, long j19) {
        d.o(str);
        this.f32044f = str;
        this.f32045g = TextUtils.isEmpty(str2) ? null : str2;
        this.f32046h = str3;
        this.f32053o = j13;
        this.f32047i = str4;
        this.f32048j = j14;
        this.f32049k = j15;
        this.f32050l = str5;
        this.f32051m = z13;
        this.f32052n = z14;
        this.f32054p = str6;
        this.f32055q = 0L;
        this.f32056r = j16;
        this.f32057s = i13;
        this.f32058t = z15;
        this.f32059u = z16;
        this.f32060v = str7;
        this.f32061w = bool;
        this.f32062x = j17;
        this.f32063y = list;
        this.f32064z = null;
        this.A = str8;
        this.B = str9;
        this.C = str10;
        this.D = z17;
        this.E = j18;
        this.F = i14;
        this.G = str11;
        this.H = i15;
        this.I = j19;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 2, this.f32044f, false);
        c.I2(parcel, 3, this.f32045g, false);
        c.I2(parcel, 4, this.f32046h, false);
        c.I2(parcel, 5, this.f32047i, false);
        c.O2(parcel, 6, 8);
        parcel.writeLong(this.f32048j);
        c.O2(parcel, 7, 8);
        parcel.writeLong(this.f32049k);
        c.I2(parcel, 8, this.f32050l, false);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f32051m ? 1 : 0);
        c.O2(parcel, 10, 4);
        parcel.writeInt(this.f32052n ? 1 : 0);
        c.O2(parcel, 11, 8);
        parcel.writeLong(this.f32053o);
        c.I2(parcel, 12, this.f32054p, false);
        c.O2(parcel, 13, 8);
        parcel.writeLong(this.f32055q);
        c.O2(parcel, 14, 8);
        parcel.writeLong(this.f32056r);
        c.O2(parcel, 15, 4);
        parcel.writeInt(this.f32057s);
        c.O2(parcel, 16, 4);
        parcel.writeInt(this.f32058t ? 1 : 0);
        c.O2(parcel, 18, 4);
        parcel.writeInt(this.f32059u ? 1 : 0);
        c.I2(parcel, 19, this.f32060v, false);
        Boolean bool = this.f32061w;
        if (bool != null) {
            c.O2(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        c.O2(parcel, 22, 8);
        parcel.writeLong(this.f32062x);
        c.J2(parcel, 23, this.f32063y);
        c.I2(parcel, 24, this.f32064z, false);
        c.I2(parcel, 25, this.A, false);
        c.I2(parcel, 26, this.B, false);
        c.I2(parcel, 27, this.C, false);
        c.O2(parcel, 28, 4);
        parcel.writeInt(this.D ? 1 : 0);
        c.O2(parcel, 29, 8);
        parcel.writeLong(this.E);
        c.O2(parcel, 30, 4);
        parcel.writeInt(this.F);
        c.I2(parcel, 31, this.G, false);
        c.O2(parcel, 32, 4);
        parcel.writeInt(this.H);
        c.O2(parcel, 34, 8);
        parcel.writeLong(this.I);
        c.N2(parcel, M2);
    }

    public zzo(String str, String str2, String str3, String str4, long j13, long j14, String str5, boolean z13, boolean z14, long j15, String str6, long j16, long j17, int i13, boolean z15, boolean z16, String str7, Boolean bool, long j18, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z17, long j19, int i14, String str12, int i15, long j23) {
        this.f32044f = str;
        this.f32045g = str2;
        this.f32046h = str3;
        this.f32053o = j15;
        this.f32047i = str4;
        this.f32048j = j13;
        this.f32049k = j14;
        this.f32050l = str5;
        this.f32051m = z13;
        this.f32052n = z14;
        this.f32054p = str6;
        this.f32055q = j16;
        this.f32056r = j17;
        this.f32057s = i13;
        this.f32058t = z15;
        this.f32059u = z16;
        this.f32060v = str7;
        this.f32061w = bool;
        this.f32062x = j18;
        this.f32063y = arrayList;
        this.f32064z = str8;
        this.A = str9;
        this.B = str10;
        this.C = str11;
        this.D = z17;
        this.E = j19;
        this.F = i14;
        this.G = str12;
        this.H = i15;
        this.I = j23;
    }
}
