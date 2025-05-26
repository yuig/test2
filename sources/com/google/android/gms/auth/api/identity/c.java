package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int r03 = bf.b.r0(parcel);
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < r03) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z13 = bf.b.a0(parcel, readInt);
                    break;
                case 2:
                    str = bf.b.F(parcel, readInt);
                    break;
                case 3:
                    str2 = bf.b.F(parcel, readInt);
                    break;
                case 4:
                    z14 = bf.b.a0(parcel, readInt);
                    break;
                case 5:
                    str3 = bf.b.F(parcel, readInt);
                    break;
                case 6:
                    arrayList = bf.b.H(parcel, readInt);
                    break;
                case 7:
                    z15 = bf.b.a0(parcel, readInt);
                    break;
                default:
                    bf.b.p0(parcel, readInt);
                    break;
            }
        }
        bf.b.L(parcel, r03);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(str, str2, str3, arrayList, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i13];
    }
}
