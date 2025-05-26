package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new LoginClient.Request(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new LoginClient.Request[i13];
    }
}
