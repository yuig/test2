package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new b(10);

    /* renamed from: f, reason: collision with root package name */
    public final String f30714f;

    /* renamed from: g, reason: collision with root package name */
    public final GoogleSignInAccount f30715g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30716h;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f30715g = googleSignInAccount;
        d.p("8.3 and 8.4 SDKs require non-null email", str);
        this.f30714f = str;
        d.p("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f30716h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 4, this.f30714f, false);
        c.H2(parcel, 7, this.f30715g, i13, false);
        c.I2(parcel, 8, this.f30716h, false);
        c.N2(parcel, M2);
    }
}
