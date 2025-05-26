package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

/* loaded from: classes.dex */
public final class RecaptchaActionType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaActionType> CREATOR = new u1(19);

    /* renamed from: f, reason: collision with root package name */
    public final String f32069f;

    public RecaptchaActionType(String str) {
        this.f32069f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f32069f, false);
        c.N2(parcel, M2);
    }
}
