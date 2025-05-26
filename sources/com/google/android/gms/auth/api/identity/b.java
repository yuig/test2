package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int r03 = bf.b.r0(parcel);
        boolean z13 = false;
        int i13 = 0;
        boolean z14 = false;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        while (parcel.dataPosition() < r03) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) bf.b.E(parcel, readInt, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) bf.b.E(parcel, readInt, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    str = bf.b.F(parcel, readInt);
                    break;
                case 4:
                    z13 = bf.b.a0(parcel, readInt);
                    break;
                case 5:
                    i13 = bf.b.h0(parcel, readInt);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) bf.b.E(parcel, readInt, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) bf.b.E(parcel, readInt, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                case '\b':
                    z14 = bf.b.a0(parcel, readInt);
                    break;
                default:
                    bf.b.p0(parcel, readInt);
                    break;
            }
        }
        bf.b.L(parcel, r03);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z13, i13, passkeysRequestOptions, passkeyJsonRequestOptions, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new BeginSignInRequest[i13];
    }
}
