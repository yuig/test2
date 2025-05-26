package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ao2.m0;
import gi.a1;
import gi.c1;
import gi.j1;
import gi.k1;
import gi.m;
import java.util.Arrays;
import kh2.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new vh.f(12);

    /* renamed from: f, reason: collision with root package name */
    public final k1 f31092f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f31093g;

    /* renamed from: h, reason: collision with root package name */
    public final k1 f31094h;

    /* renamed from: i, reason: collision with root package name */
    public final k1 f31095i;

    /* renamed from: j, reason: collision with root package name */
    public final k1 f31096j;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.bumptech.glide.d.t(bArr);
        k1 l13 = j1.l(bArr, bArr.length);
        com.bumptech.glide.d.t(bArr2);
        k1 l14 = j1.l(bArr2, bArr2.length);
        com.bumptech.glide.d.t(bArr3);
        k1 l15 = j1.l(bArr3, bArr3.length);
        com.bumptech.glide.d.t(bArr4);
        k1 l16 = j1.l(bArr4, bArr4.length);
        k1 l17 = bArr5 == null ? null : j1.l(bArr5, bArr5.length);
        this.f31092f = l13;
        this.f31093g = l14;
        this.f31094h = l15;
        this.f31095i = l16;
        this.f31096j = l17;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", m0.s(this.f31093g.n()));
            jSONObject.put("authenticatorData", m0.s(this.f31094h.n()));
            jSONObject.put("signature", m0.s(this.f31095i.n()));
            k1 k1Var = this.f31096j;
            if (k1Var != null) {
                jSONObject.put("userHandle", m0.s(k1Var == null ? null : k1Var.n()));
            }
            return jSONObject;
        } catch (JSONException e13) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return com.bumptech.glide.c.x(this.f31092f, authenticatorAssertionResponse.f31092f) && com.bumptech.glide.c.x(this.f31093g, authenticatorAssertionResponse.f31093g) && com.bumptech.glide.c.x(this.f31094h, authenticatorAssertionResponse.f31094h) && com.bumptech.glide.c.x(this.f31095i, authenticatorAssertionResponse.f31095i) && com.bumptech.glide.c.x(this.f31096j, authenticatorAssertionResponse.f31096j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f31092f})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f31093g})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f31094h})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f31095i})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f31096j}))});
    }

    public final String toString() {
        m w13 = r.w1(this);
        a1 a1Var = c1.f65051d;
        byte[] n13 = this.f31092f.n();
        w13.I(a1Var.c(n13, n13.length), "keyHandle");
        byte[] n14 = this.f31093g.n();
        w13.I(a1Var.c(n14, n14.length), "clientDataJSON");
        byte[] n15 = this.f31094h.n();
        w13.I(a1Var.c(n15, n15.length), "authenticatorData");
        byte[] n16 = this.f31095i.n();
        w13.I(a1Var.c(n16, n16.length), "signature");
        k1 k1Var = this.f31096j;
        byte[] n17 = k1Var == null ? null : k1Var.n();
        if (n17 != null) {
            w13.I(a1Var.c(n17, n17.length), "userHandle");
        }
        return w13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.B2(parcel, 2, this.f31092f.n(), false);
        bs1.c.B2(parcel, 3, this.f31093g.n(), false);
        bs1.c.B2(parcel, 4, this.f31094h.n(), false);
        bs1.c.B2(parcel, 5, this.f31095i.n(), false);
        k1 k1Var = this.f31096j;
        bs1.c.B2(parcel, 6, k1Var == null ? null : k1Var.n(), false);
        bs1.c.N2(parcel, M2);
    }
}
