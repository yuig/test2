package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new LoginClient.Result(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new LoginClient.Result[i13];
    }
}
