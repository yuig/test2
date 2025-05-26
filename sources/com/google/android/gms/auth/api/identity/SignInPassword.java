package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new dh.b(3);

    /* renamed from: f, reason: collision with root package name */
    public final String f30664f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30665g;

    public SignInPassword(String str, String str2) {
        com.bumptech.glide.d.u(str, "Account identifier cannot be null");
        String trim = str.trim();
        com.bumptech.glide.d.p("Account identifier cannot be empty", trim);
        this.f30664f = trim;
        com.bumptech.glide.d.o(str2);
        this.f30665g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return com.bumptech.glide.c.x(this.f30664f, signInPassword.f30664f) && com.bumptech.glide.c.x(this.f30665g, signInPassword.f30665g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30664f, this.f30665g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, this.f30664f, false);
        bs1.c.I2(parcel, 2, this.f30665g, false);
        bs1.c.N2(parcel, M2);
    }
}
