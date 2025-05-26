package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f31012f;

    /* renamed from: g, reason: collision with root package name */
    public final StringToIntConverter f31013g;

    public zaa(int i13, StringToIntConverter stringToIntConverter) {
        this.f31012f = i13;
        this.f31013g = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31012f);
        c.H2(parcel, 2, this.f31013g, i13, false);
        c.N2(parcel, M2);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f31012f = 1;
        this.f31013g = stringToIntConverter;
    }
}
