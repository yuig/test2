package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new b(7);

    /* renamed from: f, reason: collision with root package name */
    public final String f30720f;

    /* renamed from: g, reason: collision with root package name */
    public final GoogleSignInOptions f30721g;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        d.o(str);
        this.f30720f = str;
        this.f30721g = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f30720f.equals(signInConfiguration.f30720f)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f30721g;
            GoogleSignInOptions googleSignInOptions2 = this.f30721g;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = 1 * 31;
        String str = this.f30720f;
        int hashCode = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f30721g;
        return hashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 2, this.f30720f, false);
        c.H2(parcel, 5, this.f30721g, i13, false);
        c.N2(parcel, M2);
    }
}
