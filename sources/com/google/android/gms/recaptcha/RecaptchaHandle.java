package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class RecaptchaHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaHandle> CREATOR = new u1(20);

    /* renamed from: f, reason: collision with root package name */
    public final String f32070f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32071g;

    /* renamed from: h, reason: collision with root package name */
    public final List f32072h;

    public RecaptchaHandle(String str, String str2, ArrayList arrayList) {
        this.f32070f = str;
        this.f32071g = str2;
        this.f32072h = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f32070f, false);
        c.I2(parcel, 2, this.f32071g, false);
        c.J2(parcel, 3, this.f32072h);
        c.N2(parcel, M2);
    }
}
