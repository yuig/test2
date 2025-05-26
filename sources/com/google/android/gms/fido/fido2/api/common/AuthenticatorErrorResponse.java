package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import gi.m;
import java.util.Arrays;
import kh2.r;

/* loaded from: classes3.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new vh.f(14);

    /* renamed from: f, reason: collision with root package name */
    public final ErrorCode f31101f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31102g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31103h;

    public AuthenticatorErrorResponse(int i13, int i14, String str) {
        try {
            this.f31101f = ErrorCode.toErrorCode(i13);
            this.f31102g = str;
            this.f31103h = i14;
        } catch (ErrorCode.UnsupportedErrorCodeException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return com.bumptech.glide.c.x(this.f31101f, authenticatorErrorResponse.f31101f) && com.bumptech.glide.c.x(this.f31102g, authenticatorErrorResponse.f31102g) && com.bumptech.glide.c.x(Integer.valueOf(this.f31103h), Integer.valueOf(authenticatorErrorResponse.f31103h));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31101f, this.f31102g, Integer.valueOf(this.f31103h)});
    }

    public final String toString() {
        m w13 = r.w1(this);
        String valueOf = String.valueOf(this.f31101f.getCode());
        int i13 = 0;
        gi.f fVar = new gi.f(i13, i13);
        ((m) w13.f65095d).f65094c = fVar;
        w13.f65095d = fVar;
        fVar.f65095d = valueOf;
        fVar.f65093b = "errorCode";
        String str = this.f31102g;
        if (str != null) {
            w13.I(str, "errorMessage");
        }
        return w13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int code = this.f31101f.getCode();
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(code);
        bs1.c.I2(parcel, 3, this.f31102g, false);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31103h);
        bs1.c.N2(parcel, M2);
    }
}
