package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ao2.m0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import gi.b0;
import gi.j1;
import gi.k1;
import gi.l1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    public final PublicKeyCredentialType f31147f;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f31148g;

    /* renamed from: h, reason: collision with root package name */
    public final List f31149h;

    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        b0.i(2, l1.f65090a, l1.f65091b);
        CREATOR = new lh.a(26);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        k1 k1Var = j1.f65077b;
        k1 l13 = j1.l(bArr, bArr.length);
        com.bumptech.glide.d.t(str);
        try {
            this.f31147f = PublicKeyCredentialType.fromString(str);
            this.f31148g = l13;
            this.f31149h = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f31147f.equals(publicKeyCredentialDescriptor.f31147f) || !com.bumptech.glide.c.x(this.f31148g, publicKeyCredentialDescriptor.f31148g)) {
            return false;
        }
        List list = this.f31149h;
        List list2 = publicKeyCredentialDescriptor.f31149h;
        if (list == null && list2 == null) {
            return true;
        }
        return list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31147f, this.f31148g, this.f31149h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31147f);
        String s13 = m0.s(this.f31148g.n());
        return a.a.p(a.a.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", s13, ", \n transports="), String.valueOf(this.f31149h), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 2, this.f31147f.toString(), false);
        bs1.c.B2(parcel, 3, this.f31148g.n(), false);
        bs1.c.L2(parcel, 4, this.f31149h, false);
        bs1.c.N2(parcel, M2);
    }
}
