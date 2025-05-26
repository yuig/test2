package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;
import wh.a;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new a(12);

    /* renamed from: f, reason: collision with root package name */
    public final String f31261f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31262g;

    /* renamed from: h, reason: collision with root package name */
    public final short f31263h;

    /* renamed from: i, reason: collision with root package name */
    public final double f31264i;

    /* renamed from: j, reason: collision with root package name */
    public final double f31265j;

    /* renamed from: k, reason: collision with root package name */
    public final float f31266k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31267l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31268m;

    /* renamed from: n, reason: collision with root package name */
    public final int f31269n;

    public zzbh(String str, int i13, short s13, double d2, double d13, float f13, long j13, int i14, int i15) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        }
        if (f13 <= 0.0f) {
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("invalid radius: ");
            sb3.append(f13);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d2 > 90.0d || d2 < -90.0d) {
            StringBuilder sb4 = new StringBuilder(42);
            sb4.append("invalid latitude: ");
            sb4.append(d2);
            throw new IllegalArgumentException(sb4.toString());
        }
        if (d13 > 180.0d || d13 < -180.0d) {
            StringBuilder sb5 = new StringBuilder(43);
            sb5.append("invalid longitude: ");
            sb5.append(d13);
            throw new IllegalArgumentException(sb5.toString());
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            StringBuilder sb6 = new StringBuilder(46);
            sb6.append("No supported transition specified: ");
            sb6.append(i13);
            throw new IllegalArgumentException(sb6.toString());
        }
        this.f31263h = s13;
        this.f31261f = str;
        this.f31264i = d2;
        this.f31265j = d13;
        this.f31266k = f13;
        this.f31262g = j13;
        this.f31267l = i16;
        this.f31268m = i14;
        this.f31269n = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbhVar = (zzbh) obj;
        return this.f31266k == zzbhVar.f31266k && this.f31264i == zzbhVar.f31264i && this.f31265j == zzbhVar.f31265j && this.f31263h == zzbhVar.f31263h;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f31264i);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f31265j);
        return ((((Float.floatToIntBits(this.f31266k) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31)) * 31) + this.f31263h) * 31) + this.f31267l;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f31263h != 1 ? null : "CIRCLE";
        objArr[1] = this.f31261f.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f31267l);
        objArr[3] = Double.valueOf(this.f31264i);
        objArr[4] = Double.valueOf(this.f31265j);
        objArr[5] = Float.valueOf(this.f31266k);
        objArr[6] = Integer.valueOf(this.f31268m / 1000);
        objArr[7] = Integer.valueOf(this.f31269n);
        objArr[8] = Long.valueOf(this.f31262g);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f31261f, false);
        c.O2(parcel, 2, 8);
        parcel.writeLong(this.f31262g);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31263h);
        c.O2(parcel, 4, 8);
        parcel.writeDouble(this.f31264i);
        c.O2(parcel, 5, 8);
        parcel.writeDouble(this.f31265j);
        c.O2(parcel, 6, 4);
        parcel.writeFloat(this.f31266k);
        c.O2(parcel, 7, 4);
        parcel.writeInt(this.f31267l);
        c.O2(parcel, 8, 4);
        parcel.writeInt(this.f31268m);
        c.O2(parcel, 9, 4);
        parcel.writeInt(this.f31269n);
        c.N2(parcel, M2);
    }
}
