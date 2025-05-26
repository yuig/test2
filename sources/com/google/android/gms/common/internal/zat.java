package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new b(24);

    /* renamed from: f */
    public final int f30974f;

    /* renamed from: g */
    public final Account f30975g;

    /* renamed from: h */
    public final int f30976h;

    /* renamed from: i */
    public final GoogleSignInAccount f30977i;

    public zat(int i13, Account account, int i14, GoogleSignInAccount googleSignInAccount) {
        this.f30974f = i13;
        this.f30975g = account;
        this.f30976h = i14;
        this.f30977i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30974f);
        c.H2(parcel, 2, this.f30975g, i13, false);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30976h);
        c.H2(parcel, 4, this.f30977i, i13, false);
        c.N2(parcel, M2);
    }
}
