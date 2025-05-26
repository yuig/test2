package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public enum UserVerificationRequirement implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");


    @NonNull
    public static final Parcelable.Creator<UserVerificationRequirement> CREATOR = new vh.f(4);

    @NonNull
    private final String zze;

    UserVerificationRequirement(@NonNull String str) {
        this.zze = str;
    }

    @NonNull
    public static UserVerificationRequirement fromString(@NonNull String str) {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.zze)) {
                return userVerificationRequirement;
            }
        }
        throw new zzbc(a.a.k("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i13) {
        parcel.writeString(this.zze);
    }
}
