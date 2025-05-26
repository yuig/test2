package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import gi.a1;
import gi.c1;
import gi.m;
import java.util.Arrays;
import kh2.r;
import vh.f;

@Deprecated
/* loaded from: classes3.dex */
public class RegisterResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new f(29);

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f31216f;

    /* renamed from: g, reason: collision with root package name */
    public final ProtocolVersion f31217g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31218h;

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.f31216f = bArr;
        try {
            this.f31217g = ProtocolVersion.fromString(str);
            this.f31218h = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return c.x(this.f31217g, registerResponseData.f31217g) && Arrays.equals(this.f31216f, registerResponseData.f31216f) && c.x(this.f31218h, registerResponseData.f31218h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31217g, Integer.valueOf(Arrays.hashCode(this.f31216f)), this.f31218h});
    }

    public final String toString() {
        m w13 = r.w1(this);
        w13.I(this.f31217g, "protocolVersion");
        a1 a1Var = c1.f65051d;
        byte[] bArr = this.f31216f;
        w13.I(a1Var.c(bArr, bArr.length), "registerData");
        String str = this.f31218h;
        if (str != null) {
            w13.I(str, "clientDataString");
        }
        return w13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.B2(parcel, 2, this.f31216f, false);
        bs1.c.I2(parcel, 3, this.f31217g.toString(), false);
        bs1.c.I2(parcel, 4, this.f31218h, false);
        bs1.c.N2(parcel, M2);
    }
}
