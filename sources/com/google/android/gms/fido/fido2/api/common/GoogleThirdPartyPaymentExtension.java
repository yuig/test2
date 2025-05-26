package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new lh.a(20);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31125f;

    public GoogleThirdPartyPaymentExtension(boolean z13) {
        this.f31125f = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GoogleThirdPartyPaymentExtension) {
            return this.f31125f == ((GoogleThirdPartyPaymentExtension) obj).f31125f;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31125f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31125f ? 1 : 0);
        bs1.c.N2(parcel, M2);
    }
}
