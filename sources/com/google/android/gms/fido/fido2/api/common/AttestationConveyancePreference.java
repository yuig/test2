package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");


    @NonNull
    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new f();

    @NonNull
    private final String zzb;

    public static class UnsupportedAttestationConveyancePreferenceException extends Exception {
    }

    AttestationConveyancePreference(String str) {
        this.zzb = str;
    }

    @NonNull
    public static AttestationConveyancePreference fromString(@NonNull String str) {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.zzb)) {
                return attestationConveyancePreference;
            }
        }
        throw new UnsupportedAttestationConveyancePreferenceException(a.a.k("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        parcel.writeString(this.zzb);
    }
}
