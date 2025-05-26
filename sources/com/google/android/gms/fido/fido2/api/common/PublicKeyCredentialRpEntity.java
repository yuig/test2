package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new lh.a(29);

    /* renamed from: f, reason: collision with root package name */
    public final String f31162f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31163g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31164h;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        com.bumptech.glide.d.t(str);
        this.f31162f = str;
        com.bumptech.glide.d.t(str2);
        this.f31163g = str2;
        this.f31164h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return com.bumptech.glide.c.x(this.f31162f, publicKeyCredentialRpEntity.f31162f) && com.bumptech.glide.c.x(this.f31163g, publicKeyCredentialRpEntity.f31163g) && com.bumptech.glide.c.x(this.f31164h, publicKeyCredentialRpEntity.f31164h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31162f, this.f31163g, this.f31164h});
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb3.append(this.f31162f);
        sb3.append("', \n name='");
        sb3.append(this.f31163g);
        sb3.append("', \n icon='");
        return a.a.p(sb3, this.f31164h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 2, this.f31162f, false);
        bs1.c.I2(parcel, 3, this.f31163g, false);
        bs1.c.I2(parcel, 4, this.f31164h, false);
        bs1.c.N2(parcel, M2);
    }
}
