package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import vh.f;

@Deprecated
/* loaded from: classes3.dex */
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);

    private final int zzc;
    private static final String zza = "ErrorCode";

    @NonNull
    public static final Parcelable.Creator<ErrorCode> CREATOR = new f(24);

    ErrorCode(int i13) {
        this.zzc = i13;
    }

    @NonNull
    public static ErrorCode toErrorCode(int i13) {
        for (ErrorCode errorCode : values()) {
            if (i13 == errorCode.zzc) {
                return errorCode;
            }
        }
        return OTHER_ERROR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        parcel.writeInt(this.zzc);
    }
}
