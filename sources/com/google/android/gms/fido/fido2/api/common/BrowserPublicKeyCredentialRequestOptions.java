package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ao2.m0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new vh.f(17);

    /* renamed from: f, reason: collision with root package name */
    public final PublicKeyCredentialRequestOptions f31111f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f31112g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f31113h;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        com.bumptech.glide.d.t(publicKeyCredentialRequestOptions);
        this.f31111f = publicKeyCredentialRequestOptions;
        com.bumptech.glide.d.t(uri);
        boolean z13 = true;
        com.bumptech.glide.d.i("origin scheme must be non-empty", uri.getScheme() != null);
        com.bumptech.glide.d.i("origin authority must be non-empty", uri.getAuthority() != null);
        this.f31112g = uri;
        if (bArr != null && bArr.length != 32) {
            z13 = false;
        }
        com.bumptech.glide.d.i("clientDataHash must be 32 bytes long", z13);
        this.f31113h = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return com.bumptech.glide.c.x(this.f31111f, browserPublicKeyCredentialRequestOptions.f31111f) && com.bumptech.glide.c.x(this.f31112g, browserPublicKeyCredentialRequestOptions.f31112g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31111f, this.f31112g});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31111f);
        String valueOf2 = String.valueOf(this.f31112g);
        return a.a.p(a.a.w("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), m0.s(this.f31113h), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 2, this.f31111f, i13, false);
        bs1.c.H2(parcel, 3, this.f31112g, i13, false);
        bs1.c.B2(parcel, 4, this.f31113h, false);
        bs1.c.N2(parcel, M2);
    }
}
