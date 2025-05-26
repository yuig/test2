package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import i2.u1;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new u1(15);

    /* renamed from: f, reason: collision with root package name */
    public final String f30735f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30736g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30737h;

    public Feature(String str, int i13, long j13) {
        this.f30735f = str;
        this.f30736g = i13;
        this.f30737h = j13;
    }

    public final long e() {
        long j13 = this.f30737h;
        return j13 == -1 ? this.f30736g : j13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f30735f;
            if (((str != null && str.equals(feature.f30735f)) || (str == null && feature.f30735f == null)) && e() == feature.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30735f, Long.valueOf(e())});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f30735f, "name");
        q4Var.m(Long.valueOf(e()), "version");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f30735f, false);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30736g);
        long e13 = e();
        c.O2(parcel, 3, 8);
        parcel.writeLong(e13);
        c.N2(parcel, M2);
    }

    public Feature(String str, long j13) {
        this.f30735f = str;
        this.f30737h = j13;
        this.f30736g = -1;
    }
}
