package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new vg.a(25);

    /* renamed from: f, reason: collision with root package name */
    public final String f30609f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30610g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30611h;

    /* renamed from: i, reason: collision with root package name */
    public final List f30612i;

    /* renamed from: j, reason: collision with root package name */
    public final GoogleSignInAccount f30613j;

    /* renamed from: k, reason: collision with root package name */
    public final PendingIntent f30614k;

    public AuthorizationResult(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f30609f = str;
        this.f30610g = str2;
        this.f30611h = str3;
        com.bumptech.glide.d.t(arrayList);
        this.f30612i = arrayList;
        this.f30614k = pendingIntent;
        this.f30613j = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return com.bumptech.glide.c.x(this.f30609f, authorizationResult.f30609f) && com.bumptech.glide.c.x(this.f30610g, authorizationResult.f30610g) && com.bumptech.glide.c.x(this.f30611h, authorizationResult.f30611h) && com.bumptech.glide.c.x(this.f30612i, authorizationResult.f30612i) && com.bumptech.glide.c.x(this.f30614k, authorizationResult.f30614k) && com.bumptech.glide.c.x(this.f30613j, authorizationResult.f30613j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30609f, this.f30610g, this.f30611h, this.f30612i, this.f30614k, this.f30613j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, this.f30609f, false);
        bs1.c.I2(parcel, 2, this.f30610g, false);
        bs1.c.I2(parcel, 3, this.f30611h, false);
        bs1.c.J2(parcel, 4, this.f30612i);
        bs1.c.H2(parcel, 5, this.f30613j, i13, false);
        bs1.c.H2(parcel, 6, this.f30614k, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
