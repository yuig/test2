package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.DeviceAuthDialog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
        requestState.f29941a = parcel.readString();
        requestState.f29942b = parcel.readString();
        requestState.f29943c = parcel.readString();
        requestState.f29944d = parcel.readLong();
        requestState.f29945e = parcel.readLong();
        return requestState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new DeviceAuthDialog.RequestState[i13];
    }
}
