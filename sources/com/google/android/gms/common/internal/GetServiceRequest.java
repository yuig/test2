package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;
import jh.a;
import jh.j;
import jh.m0;

/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new u1(13);

    /* renamed from: t, reason: collision with root package name */
    public static final Scope[] f30942t = new Scope[0];

    /* renamed from: u, reason: collision with root package name */
    public static final Feature[] f30943u = new Feature[0];

    /* renamed from: f, reason: collision with root package name */
    public final int f30944f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30945g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30946h;

    /* renamed from: i, reason: collision with root package name */
    public String f30947i;

    /* renamed from: j, reason: collision with root package name */
    public IBinder f30948j;

    /* renamed from: k, reason: collision with root package name */
    public Scope[] f30949k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f30950l;

    /* renamed from: m, reason: collision with root package name */
    public Account f30951m;

    /* renamed from: n, reason: collision with root package name */
    public Feature[] f30952n;

    /* renamed from: o, reason: collision with root package name */
    public Feature[] f30953o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f30954p;

    /* renamed from: q, reason: collision with root package name */
    public final int f30955q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30956r;

    /* renamed from: s, reason: collision with root package name */
    public final String f30957s;

    public GetServiceRequest(int i13, int i14, int i15, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z13, int i16, boolean z14, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f30942t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f30943u;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f30944f = i13;
        this.f30945g = i14;
        this.f30946h = i15;
        if ("com.google.android.gms".equals(str)) {
            this.f30947i = "com.google.android.gms";
        } else {
            this.f30947i = str;
        }
        if (i13 < 2) {
            if (iBinder != null) {
                int i17 = a.f76135b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                account2 = a.D(queryLocalInterface instanceof j ? (j) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1));
            } else {
                account2 = null;
            }
            this.f30951m = account2;
        } else {
            this.f30948j = iBinder;
            this.f30951m = account;
        }
        this.f30949k = scopeArr;
        this.f30950l = bundle;
        this.f30952n = featureArr;
        this.f30953o = featureArr2;
        this.f30954p = z13;
        this.f30955q = i16;
        this.f30956r = z14;
        this.f30957s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        u1.a(this, parcel, i13);
    }
}
