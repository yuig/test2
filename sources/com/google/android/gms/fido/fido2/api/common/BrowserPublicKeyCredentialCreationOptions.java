package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ao2.m0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new vh.f(16);

    /* renamed from: f, reason: collision with root package name */
    public final PublicKeyCredentialCreationOptions f31108f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f31109g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f31110h;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        com.bumptech.glide.d.t(publicKeyCredentialCreationOptions);
        this.f31108f = publicKeyCredentialCreationOptions;
        com.bumptech.glide.d.t(uri);
        boolean z13 = true;
        com.bumptech.glide.d.i("origin scheme must be non-empty", uri.getScheme() != null);
        com.bumptech.glide.d.i("origin authority must be non-empty", uri.getAuthority() != null);
        this.f31109g = uri;
        if (bArr != null && bArr.length != 32) {
            z13 = false;
        }
        com.bumptech.glide.d.i("clientDataHash must be 32 bytes long", z13);
        this.f31110h = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return com.bumptech.glide.c.x(this.f31108f, browserPublicKeyCredentialCreationOptions.f31108f) && com.bumptech.glide.c.x(this.f31109g, browserPublicKeyCredentialCreationOptions.f31109g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31108f, this.f31109g});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31108f);
        String valueOf2 = String.valueOf(this.f31109g);
        return a.a.p(a.a.w("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), m0.s(this.f31110h), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 2, this.f31108f, i13, false);
        bs1.c.H2(parcel, 3, this.f31109g, i13, false);
        bs1.c.B2(parcel, 4, this.f31110h, false);
        bs1.c.N2(parcel, M2);
    }
}
