package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new vg.a(24);

    /* renamed from: f, reason: collision with root package name */
    public final List f30600f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30601g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30602h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30603i;

    /* renamed from: j, reason: collision with root package name */
    public final Account f30604j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30605k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30606l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f30607m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f30608n;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z13, boolean z14, Account account, String str2, String str3, boolean z15, Bundle bundle) {
        boolean z16 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z16 = true;
        }
        com.bumptech.glide.d.i("requestedScopes cannot be null or empty", z16);
        this.f30600f = arrayList;
        this.f30601g = str;
        this.f30602h = z13;
        this.f30603i = z14;
        this.f30604j = account;
        this.f30605k = str2;
        this.f30606l = str3;
        this.f30607m = z15;
        this.f30608n = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f30600f;
        if (list.size() == authorizationRequest.f30600f.size() && list.containsAll(authorizationRequest.f30600f)) {
            Bundle bundle = this.f30608n;
            Bundle bundle2 = authorizationRequest.f30608n;
            if (bundle == null) {
                if (bundle2 == null) {
                    bundle2 = null;
                }
                return false;
            }
            if (bundle == null || bundle2 != null) {
                if (bundle != null) {
                    if (bundle.size() != bundle2.size()) {
                        return false;
                    }
                    for (String str : bundle.keySet()) {
                        if (!com.bumptech.glide.c.x(bundle.getString(str), bundle2.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f30602h == authorizationRequest.f30602h && this.f30607m == authorizationRequest.f30607m && this.f30603i == authorizationRequest.f30603i && com.bumptech.glide.c.x(this.f30601g, authorizationRequest.f30601g) && com.bumptech.glide.c.x(this.f30604j, authorizationRequest.f30604j) && com.bumptech.glide.c.x(this.f30605k, authorizationRequest.f30605k) && com.bumptech.glide.c.x(this.f30606l, authorizationRequest.f30606l)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30600f, this.f30601g, Boolean.valueOf(this.f30602h), Boolean.valueOf(this.f30607m), Boolean.valueOf(this.f30603i), this.f30604j, this.f30605k, this.f30606l, this.f30608n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.L2(parcel, 1, this.f30600f, false);
        bs1.c.I2(parcel, 2, this.f30601g, false);
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30602h ? 1 : 0);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30603i ? 1 : 0);
        bs1.c.H2(parcel, 5, this.f30604j, i13, false);
        bs1.c.I2(parcel, 6, this.f30605k, false);
        bs1.c.I2(parcel, 7, this.f30606l, false);
        bs1.c.O2(parcel, 8, 4);
        parcel.writeInt(this.f30607m ? 1 : 0);
        bs1.c.A2(parcel, 9, this.f30608n);
        bs1.c.N2(parcel, M2);
    }
}
