package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

/* loaded from: classes.dex */
public final class RecaptchaAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaAction> CREATOR = new u1(18);

    /* renamed from: f, reason: collision with root package name */
    public final RecaptchaActionType f32065f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32066g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f32067h;

    /* renamed from: i, reason: collision with root package name */
    public final String f32068i;

    public RecaptchaAction(RecaptchaActionType recaptchaActionType, String str, Bundle bundle, String str2) {
        this.f32065f = recaptchaActionType;
        this.f32066g = str;
        this.f32067h = bundle;
        this.f32068i = str2;
    }

    public final String toString() {
        RecaptchaActionType recaptchaActionType = this.f32065f;
        if ("other".equals(recaptchaActionType.f32069f)) {
            String str = this.f32066g;
            if (!str.isEmpty()) {
                return str;
            }
        }
        return recaptchaActionType.f32069f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.H2(parcel, 1, this.f32065f, i13, false);
        c.I2(parcel, 2, this.f32066g, false);
        c.A2(parcel, 3, this.f32067h);
        c.I2(parcel, 4, this.f32068i, false);
        c.N2(parcel, M2);
    }
}
