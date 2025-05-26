package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new lh.a(27);

    /* renamed from: f, reason: collision with root package name */
    public final PublicKeyCredentialType f31150f;

    /* renamed from: g, reason: collision with root package name */
    public final COSEAlgorithmIdentifier f31151g;

    public PublicKeyCredentialParameters(String str, int i13) {
        com.bumptech.glide.d.t(str);
        try {
            this.f31150f = PublicKeyCredentialType.fromString(str);
            try {
                this.f31151g = COSEAlgorithmIdentifier.a(i13);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e13) {
                throw new IllegalArgumentException(e13);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e14) {
            throw new IllegalArgumentException(e14);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f31150f.equals(publicKeyCredentialParameters.f31150f) && this.f31151g.equals(publicKeyCredentialParameters.f31151g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31150f, this.f31151g});
    }

    public final String toString() {
        return a.a.m("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f31150f), ", \n algorithm=", String.valueOf(this.f31151g), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 2, this.f31150f.toString(), false);
        bs1.c.F2(parcel, 3, Integer.valueOf(this.f31151g.f31114a.getAlgoValue()));
        bs1.c.N2(parcel, M2);
    }
}
