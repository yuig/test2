package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gi.j1;
import gi.k1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new vh.f(22);

    /* renamed from: f, reason: collision with root package name */
    public final String f31116f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31117g;

    /* renamed from: h, reason: collision with root package name */
    public final k1 f31118h;

    /* renamed from: i, reason: collision with root package name */
    public final k1 f31119i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f31120j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31121k;

    /* renamed from: l, reason: collision with root package name */
    public final long f31122l;

    /* renamed from: m, reason: collision with root package name */
    public final Account f31123m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f31124n;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z13, boolean z14, long j13, Account account, boolean z15) {
        k1 l13 = bArr == null ? null : j1.l(bArr, bArr.length);
        k1 k1Var = j1.f65077b;
        k1 l14 = j1.l(bArr2, bArr2.length);
        this.f31116f = str;
        this.f31117g = str2;
        this.f31118h = l13;
        this.f31119i = l14;
        this.f31120j = z13;
        this.f31121k = z14;
        this.f31122l = j13;
        this.f31123m = account;
        this.f31124n = z15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return com.bumptech.glide.c.x(this.f31116f, fidoCredentialDetails.f31116f) && com.bumptech.glide.c.x(this.f31117g, fidoCredentialDetails.f31117g) && com.bumptech.glide.c.x(this.f31118h, fidoCredentialDetails.f31118h) && com.bumptech.glide.c.x(this.f31119i, fidoCredentialDetails.f31119i) && this.f31120j == fidoCredentialDetails.f31120j && this.f31121k == fidoCredentialDetails.f31121k && this.f31124n == fidoCredentialDetails.f31124n && this.f31122l == fidoCredentialDetails.f31122l && com.bumptech.glide.c.x(this.f31123m, fidoCredentialDetails.f31123m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31116f, this.f31117g, this.f31118h, this.f31119i, Boolean.valueOf(this.f31120j), Boolean.valueOf(this.f31121k), Boolean.valueOf(this.f31124n), Long.valueOf(this.f31122l), this.f31123m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, this.f31116f, false);
        bs1.c.I2(parcel, 2, this.f31117g, false);
        k1 k1Var = this.f31118h;
        bs1.c.B2(parcel, 3, k1Var == null ? null : k1Var.n(), false);
        bs1.c.B2(parcel, 4, this.f31119i.n(), false);
        bs1.c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31120j ? 1 : 0);
        bs1.c.O2(parcel, 6, 4);
        parcel.writeInt(this.f31121k ? 1 : 0);
        bs1.c.O2(parcel, 7, 8);
        parcel.writeLong(this.f31122l);
        bs1.c.H2(parcel, 8, this.f31123m, i13, false);
        bs1.c.O2(parcel, 9, 4);
        parcel.writeInt(this.f31124n ? 1 : 0);
        bs1.c.N2(parcel, M2);
    }
}
