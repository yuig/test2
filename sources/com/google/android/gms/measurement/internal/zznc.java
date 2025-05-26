package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import oi.e7;

/* loaded from: classes3.dex */
public final class zznc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznc> CREATOR = new e7(0);

    /* renamed from: f, reason: collision with root package name */
    public final int f32037f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32038g;

    /* renamed from: h, reason: collision with root package name */
    public final long f32039h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f32040i;

    /* renamed from: j, reason: collision with root package name */
    public final String f32041j;

    /* renamed from: k, reason: collision with root package name */
    public final String f32042k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f32043l;

    public zznc(int i13, String str, long j13, Long l13, Float f13, String str2, String str3, Double d2) {
        this.f32037f = i13;
        this.f32038g = str;
        this.f32039h = j13;
        this.f32040i = l13;
        if (i13 == 1) {
            this.f32043l = f13 != null ? Double.valueOf(f13.doubleValue()) : null;
        } else {
            this.f32043l = d2;
        }
        this.f32041j = str2;
        this.f32042k = str3;
    }

    public final Object e() {
        Long l13 = this.f32040i;
        if (l13 != null) {
            return l13;
        }
        Double d2 = this.f32043l;
        if (d2 != null) {
            return d2;
        }
        String str = this.f32041j;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f32037f);
        c.I2(parcel, 2, this.f32038g, false);
        c.O2(parcel, 3, 8);
        parcel.writeLong(this.f32039h);
        c.G2(parcel, 4, this.f32040i);
        c.I2(parcel, 6, this.f32041j, false);
        c.I2(parcel, 7, this.f32042k, false);
        c.C2(parcel, 8, this.f32043l);
        c.N2(parcel, M2);
    }

    public zznc(long j13, Object obj, String str, String str2) {
        d.o(str);
        this.f32037f = 2;
        this.f32038g = str;
        this.f32039h = j13;
        this.f32042k = str2;
        if (obj == null) {
            this.f32040i = null;
            this.f32043l = null;
            this.f32041j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f32040i = (Long) obj;
            this.f32043l = null;
            this.f32041j = null;
        } else if (obj instanceof String) {
            this.f32040i = null;
            this.f32043l = null;
            this.f32041j = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f32040i = null;
                this.f32043l = (Double) obj;
                this.f32041j = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zznc(oi.g7 r7) {
        /*
            r6 = this;
            java.lang.String r4 = r7.f94799c
            java.lang.Object r3 = r7.f94801e
            java.lang.String r5 = r7.f94798b
            long r1 = r7.f94800d
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznc.<init>(oi.g7):void");
    }
}
