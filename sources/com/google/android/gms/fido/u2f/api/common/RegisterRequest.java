package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import vh.f;

@Deprecated
/* loaded from: classes3.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new f(27);

    /* renamed from: f, reason: collision with root package name */
    public final int f31205f;

    /* renamed from: g, reason: collision with root package name */
    public final ProtocolVersion f31206g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f31207h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31208i;

    public RegisterRequest(int i13, String str, String str2, byte[] bArr) {
        this.f31205f = i13;
        try {
            this.f31206g = ProtocolVersion.fromString(str);
            this.f31207h = bArr;
            this.f31208i = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.f31207h, registerRequest.f31207h) || this.f31206g != registerRequest.f31206g) {
            return false;
        }
        String str = registerRequest.f31208i;
        String str2 = this.f31208i;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f31206g.hashCode() + ((Arrays.hashCode(this.f31207h) + 31) * 31);
        String str = this.f31208i;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31205f);
        c.I2(parcel, 2, this.f31206g.toString(), false);
        c.B2(parcel, 3, this.f31207h, false);
        c.I2(parcel, 4, this.f31208i, false);
        c.N2(parcel, M2);
    }
}
