package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");


    @NonNull
    public static final Parcelable.Creator<Attachment> CREATOR = new b();

    @NonNull
    private final String zzb;

    public static class UnsupportedAttachmentException extends Exception {
    }

    Attachment(String str) {
        this.zzb = str;
    }

    @NonNull
    public static Attachment fromString(@NonNull String str) {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.zzb)) {
                return attachment;
            }
        }
        throw new UnsupportedAttachmentException(a.a.k("Attachment ", str, " not supported"));
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
