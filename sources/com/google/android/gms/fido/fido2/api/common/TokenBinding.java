package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kh2.w;

/* loaded from: classes3.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new vh.f(2);

    /* renamed from: f, reason: collision with root package name */
    public final TokenBindingStatus f31169f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31170g;

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new e();

        @NonNull
        private final String zzb;

        TokenBindingStatus(@NonNull String str) {
            this.zzb = str;
        }

        @NonNull
        public static TokenBindingStatus fromString(@NonNull String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(a.a.k("TokenBindingStatus ", str, " not supported"));
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

    public static class UnsupportedTokenBindingStatusException extends Exception {
    }

    static {
        new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
        new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);
    }

    public TokenBinding(String str, String str2) {
        com.bumptech.glide.d.t(str);
        try {
            this.f31169f = TokenBindingStatus.fromString(str);
            this.f31170g = str2;
        } catch (UnsupportedTokenBindingStatusException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return w.D0(this.f31169f, tokenBinding.f31169f) && w.D0(this.f31170g, tokenBinding.f31170g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31169f, this.f31170g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 2, this.f31169f.toString(), false);
        bs1.c.I2(parcel, 3, this.f31170g, false);
        bs1.c.N2(parcel, M2);
    }
}
