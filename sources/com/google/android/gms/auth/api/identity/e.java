package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int r03 = bf.b.r0(parcel);
        byte[] bArr = null;
        boolean z13 = false;
        String str = null;
        while (parcel.dataPosition() < r03) {
            int readInt = parcel.readInt();
            char c13 = (char) readInt;
            if (c13 == 1) {
                z13 = bf.b.a0(parcel, readInt);
            } else if (c13 == 2) {
                bArr = bf.b.C(parcel, readInt);
            } else if (c13 != 3) {
                bf.b.p0(parcel, readInt);
            } else {
                str = bf.b.F(parcel, readInt);
            }
        }
        bf.b.L(parcel, r03);
        return new BeginSignInRequest.PasskeysRequestOptions(z13, bArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new BeginSignInRequest.PasskeysRequestOptions[i13];
    }
}
