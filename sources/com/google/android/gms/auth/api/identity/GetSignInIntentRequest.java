package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.r1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new vg.a(27);

    /* renamed from: f, reason: collision with root package name */
    public final String f30638f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30639g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30640h;

    /* renamed from: i, reason: collision with root package name */
    public final String f30641i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f30642j;

    /* renamed from: k, reason: collision with root package name */
    public final int f30643k;

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z13, int i13) {
        com.bumptech.glide.d.t(str);
        this.f30638f = str;
        this.f30639g = str2;
        this.f30640h = str3;
        this.f30641i = str4;
        this.f30642j = z13;
        this.f30643k = i13;
    }

    public static r1 e(GetSignInIntentRequest getSignInIntentRequest) {
        r1 r1Var = new r1();
        String str = getSignInIntentRequest.f30638f;
        com.bumptech.glide.d.t(str);
        r1Var.f16960d = str;
        r1Var.f16962f = getSignInIntentRequest.f30641i;
        r1Var.f16961e = getSignInIntentRequest.f30639g;
        r1Var.f16959c = getSignInIntentRequest.f30642j;
        r1Var.f16957a = getSignInIntentRequest.f30643k;
        String str2 = getSignInIntentRequest.f30640h;
        if (str2 != null) {
            r1Var.f16958b = str2;
        }
        return r1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return com.bumptech.glide.c.x(this.f30638f, getSignInIntentRequest.f30638f) && com.bumptech.glide.c.x(this.f30641i, getSignInIntentRequest.f30641i) && com.bumptech.glide.c.x(this.f30639g, getSignInIntentRequest.f30639g) && com.bumptech.glide.c.x(Boolean.valueOf(this.f30642j), Boolean.valueOf(getSignInIntentRequest.f30642j)) && this.f30643k == getSignInIntentRequest.f30643k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30638f, this.f30639g, this.f30641i, Boolean.valueOf(this.f30642j), Integer.valueOf(this.f30643k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, this.f30638f, false);
        bs1.c.I2(parcel, 2, this.f30639g, false);
        bs1.c.I2(parcel, 3, this.f30640h, false);
        bs1.c.I2(parcel, 4, this.f30641i, false);
        bs1.c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30642j ? 1 : 0);
        bs1.c.O2(parcel, 6, 4);
        parcel.writeInt(this.f30643k);
        bs1.c.N2(parcel, M2);
    }
}
