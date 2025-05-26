package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import gi.a1;
import gi.c1;
import gi.m;
import java.util.Arrays;
import kh2.r;

@Deprecated
/* loaded from: classes3.dex */
public class SignResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<SignResponseData> CREATOR = new wh.a(2);

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f31229f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31230g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f31231h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f31232i;

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        d.t(bArr);
        this.f31229f = bArr;
        d.t(str);
        this.f31230g = str;
        d.t(bArr2);
        this.f31231h = bArr2;
        d.t(bArr3);
        this.f31232i = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.f31229f, signResponseData.f31229f) && c.x(this.f31230g, signResponseData.f31230g) && Arrays.equals(this.f31231h, signResponseData.f31231h) && Arrays.equals(this.f31232i, signResponseData.f31232i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31229f)), this.f31230g, Integer.valueOf(Arrays.hashCode(this.f31231h)), Integer.valueOf(Arrays.hashCode(this.f31232i))});
    }

    public final String toString() {
        m w13 = r.w1(this);
        a1 a1Var = c1.f65051d;
        byte[] bArr = this.f31229f;
        w13.I(a1Var.c(bArr, bArr.length), "keyHandle");
        w13.I(this.f31230g, "clientDataString");
        byte[] bArr2 = this.f31231h;
        w13.I(a1Var.c(bArr2, bArr2.length), "signatureData");
        byte[] bArr3 = this.f31232i;
        w13.I(a1Var.c(bArr3, bArr3.length), "application");
        return w13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.B2(parcel, 2, this.f31229f, false);
        bs1.c.I2(parcel, 3, this.f31230g, false);
        bs1.c.B2(parcel, 4, this.f31231h, false);
        bs1.c.B2(parcel, 5, this.f31232i, false);
        bs1.c.N2(parcel, M2);
    }
}
