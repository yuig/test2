package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lh.a;

/* loaded from: classes3.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new a(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f31038f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31039g;

    /* renamed from: h, reason: collision with root package name */
    public final FastJsonResponse$Field f31040h;

    public zam(int i13, String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.f31038f = i13;
        this.f31039g = str;
        this.f31040h = fastJsonResponse$Field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31038f);
        c.I2(parcel, 2, this.f31039g, false);
        c.H2(parcel, 3, this.f31040h, i13, false);
        c.N2(parcel, M2);
    }

    public zam(String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.f31038f = 1;
        this.f31039g = str;
        this.f31040h = fastJsonResponse$Field;
    }
}
