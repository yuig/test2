package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import gi.a1;
import gi.c1;
import gi.j1;
import gi.k1;
import gi.m;
import java.util.Arrays;
import kh2.r;

/* loaded from: classes3.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new vh.f(13);

    /* renamed from: f, reason: collision with root package name */
    public final k1 f31097f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f31098g;

    /* renamed from: h, reason: collision with root package name */
    public final k1 f31099h;

    /* renamed from: i, reason: collision with root package name */
    public final String[] f31100i;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.bumptech.glide.d.t(bArr);
        k1 l13 = j1.l(bArr, bArr.length);
        com.bumptech.glide.d.t(bArr2);
        k1 l14 = j1.l(bArr2, bArr2.length);
        com.bumptech.glide.d.t(bArr3);
        k1 l15 = j1.l(bArr3, bArr3.length);
        this.f31097f = l13;
        this.f31098g = l14;
        this.f31099h = l15;
        com.bumptech.glide.d.t(strArr);
        this.f31100i = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0234 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003b, B:12:0x003e, B:14:0x004c, B:16:0x0057, B:17:0x0052, B:20:0x005a, B:22:0x0063, B:24:0x006d, B:26:0x007e, B:27:0x0086, B:29:0x009b, B:31:0x00ad, B:33:0x00cb, B:35:0x00e0, B:36:0x00f0, B:41:0x00fd, B:42:0x0100, B:43:0x0106, B:48:0x0128, B:53:0x0220, B:55:0x0234, B:58:0x0146, B:60:0x0155, B:65:0x016b, B:68:0x0187, B:70:0x019f, B:72:0x01a5, B:73:0x01c7, B:74:0x01cc, B:75:0x01cd, B:76:0x01d2, B:81:0x01df, B:83:0x01ec, B:85:0x01fc, B:86:0x0214, B:87:0x0219, B:88:0x021a, B:89:0x021f, B:90:0x023e, B:91:0x0243, B:94:0x0244, B:95:0x024b, B:96:0x024c, B:97:0x0251, B:103:0x0254, B:104:0x0257, B:108:0x00e3, B:110:0x025b, B:111:0x0262, B:113:0x0265, B:114:0x026c, B:116:0x026d, B:117:0x0274, B:118:0x0275, B:119:0x027c, B:121:0x027e, B:122:0x0285, B:126:0x0289, B:127:0x0290), top: B:2:0x000a, inners: #1, #5, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject e() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.e():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return com.bumptech.glide.c.x(this.f31097f, authenticatorAttestationResponse.f31097f) && com.bumptech.glide.c.x(this.f31098g, authenticatorAttestationResponse.f31098g) && com.bumptech.glide.c.x(this.f31099h, authenticatorAttestationResponse.f31099h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f31097f})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f31098g})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f31099h}))});
    }

    public final String toString() {
        m w13 = r.w1(this);
        a1 a1Var = c1.f65051d;
        byte[] n13 = this.f31097f.n();
        w13.I(a1Var.c(n13, n13.length), "keyHandle");
        byte[] n14 = this.f31098g.n();
        w13.I(a1Var.c(n14, n14.length), "clientDataJSON");
        byte[] n15 = this.f31099h.n();
        w13.I(a1Var.c(n15, n15.length), "attestationObject");
        w13.I(Arrays.toString(this.f31100i), "transports");
        return w13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.B2(parcel, 2, this.f31097f.n(), false);
        bs1.c.B2(parcel, 3, this.f31098g.n(), false);
        bs1.c.B2(parcel, 4, this.f31099h.n(), false);
        String[] strArr = this.f31100i;
        if (strArr != null) {
            int M22 = bs1.c.M2(parcel, 5);
            parcel.writeStringArray(strArr);
            bs1.c.N2(parcel, M22);
        }
        bs1.c.N2(parcel, M2);
    }
}
