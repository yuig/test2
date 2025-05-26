package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a2;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import li.d;

/* loaded from: classes3.dex */
public final class zzbb extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbb> CREATOR = new d(27);

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f32029f;

    public zzbb(Bundle bundle) {
        this.f32029f = bundle;
    }

    public final Double e() {
        return Double.valueOf(this.f32029f.getDouble("value"));
    }

    public final Bundle f() {
        return new Bundle(this.f32029f);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new a2(this);
    }

    public final String toString() {
        return this.f32029f.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.A2(parcel, 2, f());
        c.N2(parcel, M2);
    }
}
