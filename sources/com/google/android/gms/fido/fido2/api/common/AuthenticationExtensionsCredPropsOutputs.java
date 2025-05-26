package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new vh.f(9);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31091f;

    public AuthenticationExtensionsCredPropsOutputs(boolean z13) {
        this.f31091f = z13;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f31091f == ((AuthenticationExtensionsCredPropsOutputs) obj).f31091f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31091f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31091f ? 1 : 0);
        bs1.c.N2(parcel, M2);
    }
}
