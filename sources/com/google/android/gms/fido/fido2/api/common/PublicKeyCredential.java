package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ao2.m0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gi.a2;
import gi.j1;
import gi.k1;
import gi.y1;
import gi.z1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new lh.a(25);

    /* renamed from: f, reason: collision with root package name */
    public final String f31126f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31127g;

    /* renamed from: h, reason: collision with root package name */
    public final j1 f31128h;

    /* renamed from: i, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f31129i;

    /* renamed from: j, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f31130j;

    /* renamed from: k, reason: collision with root package name */
    public final AuthenticatorErrorResponse f31131k;

    /* renamed from: l, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f31132l;

    /* renamed from: m, reason: collision with root package name */
    public final String f31133m;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        k1 l13 = bArr == null ? null : j1.l(bArr, bArr.length);
        boolean z13 = false;
        com.bumptech.glide.d.i("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && l13 != null)) {
            z13 = true;
        }
        com.bumptech.glide.d.i("Must provide id and rawId if not an error response.", z13);
        this.f31126f = str;
        this.f31127g = str2;
        this.f31128h = l13;
        this.f31129i = authenticatorAttestationResponse;
        this.f31130j = authenticatorAssertionResponse;
        this.f31131k = authenticatorErrorResponse;
        this.f31132l = authenticationExtensionsClientOutputs;
        this.f31133m = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return com.bumptech.glide.c.x(this.f31126f, publicKeyCredential.f31126f) && com.bumptech.glide.c.x(this.f31127g, publicKeyCredential.f31127g) && com.bumptech.glide.c.x(this.f31128h, publicKeyCredential.f31128h) && com.bumptech.glide.c.x(this.f31129i, publicKeyCredential.f31129i) && com.bumptech.glide.c.x(this.f31130j, publicKeyCredential.f31130j) && com.bumptech.glide.c.x(this.f31131k, publicKeyCredential.f31131k) && com.bumptech.glide.c.x(this.f31132l, publicKeyCredential.f31132l) && com.bumptech.glide.c.x(this.f31133m, publicKeyCredential.f31133m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31126f, this.f31127g, this.f31128h, this.f31130j, this.f31129i, this.f31131k, this.f31132l, this.f31133m});
    }

    public final String toString() {
        j1 j1Var = this.f31128h;
        String s13 = m0.s(j1Var == null ? null : j1Var.n());
        String valueOf = String.valueOf(this.f31129i);
        String valueOf2 = String.valueOf(this.f31130j);
        String valueOf3 = String.valueOf(this.f31131k);
        String valueOf4 = String.valueOf(this.f31132l);
        StringBuilder sb3 = new StringBuilder("PublicKeyCredential{\n id='");
        sb3.append(this.f31126f);
        sb3.append("', \n type='");
        a.a.B(sb3, this.f31127g, "', \n rawId=", s13, ", \n registerResponse=");
        a.a.B(sb3, valueOf, ", \n signResponse=", valueOf2, ", \n errorResponse=");
        a.a.B(sb3, valueOf3, ", \n extensionsClientOutputs=", valueOf4, ", \n authenticatorAttachment='");
        return a.a.p(sb3, this.f31133m, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        ((a2) ((z1) y1.f65140b.f65141a.f65109a)).getClass();
        a2.f65046a.h();
        throw null;
    }
}
