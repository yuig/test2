package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31780a = 0;

    static {
        r.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
