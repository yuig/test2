package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.internal.pkce.PKCECode;

/* loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LineAuthenticationStatus lineAuthenticationStatus = new LineAuthenticationStatus();
        lineAuthenticationStatus.f34090e = h.INIT;
        lineAuthenticationStatus.f34086a = (PKCECode) parcel.readParcelable(PKCECode.class.getClassLoader());
        lineAuthenticationStatus.f34087b = parcel.readString();
        lineAuthenticationStatus.f34090e = h.values()[parcel.readByte()];
        lineAuthenticationStatus.f34088c = parcel.readString();
        lineAuthenticationStatus.f34089d = parcel.readString();
        return lineAuthenticationStatus;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new LineAuthenticationStatus[i13];
    }
}
