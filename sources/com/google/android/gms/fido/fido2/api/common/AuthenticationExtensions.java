package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new vh.f(8);

    /* renamed from: f, reason: collision with root package name */
    public final FidoAppIdExtension f31074f;

    /* renamed from: g, reason: collision with root package name */
    public final zzs f31075g;

    /* renamed from: h, reason: collision with root package name */
    public final UserVerificationMethodExtension f31076h;

    /* renamed from: i, reason: collision with root package name */
    public final zzz f31077i;

    /* renamed from: j, reason: collision with root package name */
    public final zzab f31078j;

    /* renamed from: k, reason: collision with root package name */
    public final zzad f31079k;

    /* renamed from: l, reason: collision with root package name */
    public final zzu f31080l;

    /* renamed from: m, reason: collision with root package name */
    public final zzag f31081m;

    /* renamed from: n, reason: collision with root package name */
    public final GoogleThirdPartyPaymentExtension f31082n;

    /* renamed from: o, reason: collision with root package name */
    public final zzak f31083o;

    /* renamed from: p, reason: collision with root package name */
    public final zzaw f31084p;

    /* renamed from: q, reason: collision with root package name */
    public final zzai f31085q;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.f31074f = fidoAppIdExtension;
        this.f31076h = userVerificationMethodExtension;
        this.f31075g = zzsVar;
        this.f31077i = zzzVar;
        this.f31078j = zzabVar;
        this.f31079k = zzadVar;
        this.f31080l = zzuVar;
        this.f31081m = zzagVar;
        this.f31082n = googleThirdPartyPaymentExtension;
        this.f31083o = zzakVar;
        this.f31084p = zzawVar;
        this.f31085q = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return com.bumptech.glide.c.x(this.f31074f, authenticationExtensions.f31074f) && com.bumptech.glide.c.x(this.f31075g, authenticationExtensions.f31075g) && com.bumptech.glide.c.x(this.f31076h, authenticationExtensions.f31076h) && com.bumptech.glide.c.x(this.f31077i, authenticationExtensions.f31077i) && com.bumptech.glide.c.x(this.f31078j, authenticationExtensions.f31078j) && com.bumptech.glide.c.x(this.f31079k, authenticationExtensions.f31079k) && com.bumptech.glide.c.x(this.f31080l, authenticationExtensions.f31080l) && com.bumptech.glide.c.x(this.f31081m, authenticationExtensions.f31081m) && com.bumptech.glide.c.x(this.f31082n, authenticationExtensions.f31082n) && com.bumptech.glide.c.x(this.f31083o, authenticationExtensions.f31083o) && com.bumptech.glide.c.x(this.f31084p, authenticationExtensions.f31084p) && com.bumptech.glide.c.x(this.f31085q, authenticationExtensions.f31085q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31074f, this.f31075g, this.f31076h, this.f31077i, this.f31078j, this.f31079k, this.f31080l, this.f31081m, this.f31082n, this.f31083o, this.f31084p, this.f31085q});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31074f);
        String valueOf2 = String.valueOf(this.f31075g);
        String valueOf3 = String.valueOf(this.f31076h);
        String valueOf4 = String.valueOf(this.f31077i);
        String valueOf5 = String.valueOf(this.f31078j);
        String valueOf6 = String.valueOf(this.f31079k);
        String valueOf7 = String.valueOf(this.f31080l);
        String valueOf8 = String.valueOf(this.f31081m);
        String valueOf9 = String.valueOf(this.f31082n);
        String valueOf10 = String.valueOf(this.f31083o);
        String valueOf11 = String.valueOf(this.f31084p);
        StringBuilder w13 = a.a.w("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        a.a.B(w13, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        a.a.B(w13, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        a.a.B(w13, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        a.a.B(w13, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a.a.p(w13, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 2, this.f31074f, i13, false);
        bs1.c.H2(parcel, 3, this.f31075g, i13, false);
        bs1.c.H2(parcel, 4, this.f31076h, i13, false);
        bs1.c.H2(parcel, 5, this.f31077i, i13, false);
        bs1.c.H2(parcel, 6, this.f31078j, i13, false);
        bs1.c.H2(parcel, 7, this.f31079k, i13, false);
        bs1.c.H2(parcel, 8, this.f31080l, i13, false);
        bs1.c.H2(parcel, 9, this.f31081m, i13, false);
        bs1.c.H2(parcel, 10, this.f31082n, i13, false);
        bs1.c.H2(parcel, 11, this.f31083o, i13, false);
        bs1.c.H2(parcel, 12, this.f31084p, i13, false);
        bs1.c.H2(parcel, 13, this.f31085q, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
