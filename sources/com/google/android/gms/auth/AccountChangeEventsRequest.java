package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new b(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f30555f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30556g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30557h;

    /* renamed from: i, reason: collision with root package name */
    public final Account f30558i;

    public AccountChangeEventsRequest(int i13, int i14, String str, Account account) {
        this.f30555f = i13;
        this.f30556g = i14;
        this.f30557h = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f30558i = account;
        } else {
            this.f30558i = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30555f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30556g);
        c.I2(parcel, 3, this.f30557h, false);
        c.H2(parcel, 4, this.f30558i, i13, false);
        c.N2(parcel, M2);
    }
}
