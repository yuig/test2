package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new vh.f(21);

    /* renamed from: f, reason: collision with root package name */
    public final String f31115f;

    public FidoAppIdExtension(String str) {
        com.bumptech.glide.d.t(str);
        this.f31115f = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f31115f.equals(((FidoAppIdExtension) obj).f31115f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31115f});
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FidoAppIdExtension{appid='"), this.f31115f, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 2, this.f31115f, false);
        bs1.c.N2(parcel, M2);
    }
}
