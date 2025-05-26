package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

/* loaded from: classes.dex */
public class RecaptchaResultData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaResultData> CREATOR = new u1(21);

    /* renamed from: f, reason: collision with root package name */
    public final String f32073f;

    public RecaptchaResultData(String str) {
        this.f32073f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f32073f, false);
        c.N2(parcel, M2);
    }
}
