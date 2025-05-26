package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new a(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f31006f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31007g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31008h;

    public FavaDiagnosticsEntity(int i13, int i14, String str) {
        this.f31006f = i13;
        this.f31007g = str;
        this.f31008h = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31006f);
        c.I2(parcel, 2, this.f31007g, false);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31008h);
        c.N2(parcel, M2);
    }
}
