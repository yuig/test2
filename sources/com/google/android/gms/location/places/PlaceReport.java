package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;
import wh.a;

/* loaded from: classes3.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new a(15);

    /* renamed from: f, reason: collision with root package name */
    public final int f31865f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31866g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31867h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31868i;

    public PlaceReport(String str, int i13, String str2, String str3) {
        this.f31865f = i13;
        this.f31866g = str;
        this.f31867h = str2;
        this.f31868i = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return c.x(this.f31866g, placeReport.f31866g) && c.x(this.f31867h, placeReport.f31867h) && c.x(this.f31868i, placeReport.f31868i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31866g, this.f31867h, this.f31868i});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f31866g, "placeId");
        q4Var.m(this.f31867h, "tag");
        String str = this.f31868i;
        if (!"unknown".equals(str)) {
            q4Var.m(str, "source");
        }
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31865f);
        bs1.c.I2(parcel, 2, this.f31866g, false);
        bs1.c.I2(parcel, 3, this.f31867h, false);
        bs1.c.I2(parcel, 4, this.f31868i, false);
        bs1.c.N2(parcel, M2);
    }
}
