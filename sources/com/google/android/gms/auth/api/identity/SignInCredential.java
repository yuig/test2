package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new dh.b(2);

    /* renamed from: f, reason: collision with root package name */
    public final String f30655f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30656g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30657h;

    /* renamed from: i, reason: collision with root package name */
    public final String f30658i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30659j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30660k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30661l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30662m;

    /* renamed from: n, reason: collision with root package name */
    public final PublicKeyCredential f30663n;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        com.bumptech.glide.d.t(str);
        this.f30655f = str;
        this.f30656g = str2;
        this.f30657h = str3;
        this.f30658i = str4;
        this.f30659j = uri;
        this.f30660k = str5;
        this.f30661l = str6;
        this.f30662m = str7;
        this.f30663n = publicKeyCredential;
    }

    public final String e() {
        return this.f30656g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return com.bumptech.glide.c.x(this.f30655f, signInCredential.f30655f) && com.bumptech.glide.c.x(this.f30656g, signInCredential.f30656g) && com.bumptech.glide.c.x(this.f30657h, signInCredential.f30657h) && com.bumptech.glide.c.x(this.f30658i, signInCredential.f30658i) && com.bumptech.glide.c.x(this.f30659j, signInCredential.f30659j) && com.bumptech.glide.c.x(this.f30660k, signInCredential.f30660k) && com.bumptech.glide.c.x(this.f30661l, signInCredential.f30661l) && com.bumptech.glide.c.x(this.f30662m, signInCredential.f30662m) && com.bumptech.glide.c.x(this.f30663n, signInCredential.f30663n);
    }

    public final String f() {
        return this.f30658i;
    }

    public final String getId() {
        return this.f30655f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30655f, this.f30656g, this.f30657h, this.f30658i, this.f30659j, this.f30660k, this.f30661l, this.f30662m, this.f30663n});
    }

    public final String k1() {
        return this.f30657h;
    }

    public final String l2() {
        return this.f30660k;
    }

    public final String m2() {
        return this.f30662m;
    }

    public final Uri n2() {
        return this.f30659j;
    }

    public final PublicKeyCredential o2() {
        return this.f30663n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, this.f30655f, false);
        bs1.c.I2(parcel, 2, this.f30656g, false);
        bs1.c.I2(parcel, 3, this.f30657h, false);
        bs1.c.I2(parcel, 4, this.f30658i, false);
        bs1.c.H2(parcel, 5, this.f30659j, i13, false);
        bs1.c.I2(parcel, 6, this.f30660k, false);
        bs1.c.I2(parcel, 7, this.f30661l, false);
        bs1.c.I2(parcel, 8, this.f30662m, false);
        bs1.c.H2(parcel, 9, this.f30663n, i13, false);
        bs1.c.N2(parcel, M2);
    }

    public final String x1() {
        return this.f30661l;
    }
}
