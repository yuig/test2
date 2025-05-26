package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import i2.u1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements k, ReflectedParcelable {

    /* renamed from: f */
    public final int f30751f;

    /* renamed from: g */
    public final String f30752g;

    /* renamed from: h */
    public final PendingIntent f30753h;

    /* renamed from: i */
    public final ConnectionResult f30754i;

    /* renamed from: j */
    public static final Status f30746j = new Status(0, null, null, null);

    /* renamed from: k */
    public static final Status f30747k = new Status(14, null, null, null);

    /* renamed from: l */
    public static final Status f30748l = new Status(8, null, null, null);

    /* renamed from: m */
    public static final Status f30749m = new Status(15, null, null, null);

    /* renamed from: n */
    public static final Status f30750n = new Status(16, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new u1(10);

    public Status(int i13, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f30751f = i13;
        this.f30752g = str;
        this.f30753h = pendingIntent;
        this.f30754i = connectionResult;
    }

    @Override // com.google.android.gms.common.api.k
    public final Status d() {
        return this;
    }

    public final ConnectionResult e() {
        return this.f30754i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f30751f == status.f30751f && com.bumptech.glide.c.x(this.f30752g, status.f30752g) && com.bumptech.glide.c.x(this.f30753h, status.f30753h) && com.bumptech.glide.c.x(this.f30754i, status.f30754i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30751f), this.f30752g, this.f30753h, this.f30754i});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        String str = this.f30752g;
        if (str == null) {
            str = f0.h.N(this.f30751f);
        }
        q4Var.m(str, "statusCode");
        q4Var.m(this.f30753h, "resolution");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30751f);
        bs1.c.I2(parcel, 2, this.f30752g, false);
        bs1.c.H2(parcel, 3, this.f30753h, i13, false);
        bs1.c.H2(parcel, 4, this.f30754i, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
