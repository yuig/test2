package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import li.d;

/* loaded from: classes3.dex */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new d(26);

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f32028f;

    public zzam(Bundle bundle) {
        this.f32028f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.A2(parcel, 1, this.f32028f);
        c.N2(parcel, M2);
    }
}
