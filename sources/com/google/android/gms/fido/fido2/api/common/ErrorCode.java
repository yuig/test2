package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes3.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);


    @NonNull
    public static final Parcelable.Creator<ErrorCode> CREATOR = new h();
    private final int zzb;

    public static class UnsupportedErrorCodeException extends Exception {
    }

    ErrorCode(int i13) {
        this.zzb = i13;
    }

    @NonNull
    public static ErrorCode toErrorCode(int i13) {
        for (ErrorCode errorCode : values()) {
            if (i13 == errorCode.zzb) {
                return errorCode;
            }
        }
        Locale locale = Locale.US;
        throw new UnsupportedErrorCodeException(a.a.e("Error code ", i13, " is not supported"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        parcel.writeInt(this.zzb);
    }
}
