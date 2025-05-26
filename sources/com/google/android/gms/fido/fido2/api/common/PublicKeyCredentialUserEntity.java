package com.google.android.gms.fido.fido2.api.common;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ao2.m0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gi.j1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new vh.f(0);

    /* renamed from: f, reason: collision with root package name */
    public final j1 f31165f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31166g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31167h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31168i;

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        com.bumptech.glide.d.t(bArr);
        this.f31165f = j1.l(bArr, bArr.length);
        com.bumptech.glide.d.t(str);
        this.f31166g = str;
        this.f31167h = str2;
        com.bumptech.glide.d.t(str3);
        this.f31168i = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return com.bumptech.glide.c.x(this.f31165f, publicKeyCredentialUserEntity.f31165f) && com.bumptech.glide.c.x(this.f31166g, publicKeyCredentialUserEntity.f31166g) && com.bumptech.glide.c.x(this.f31167h, publicKeyCredentialUserEntity.f31167h) && com.bumptech.glide.c.x(this.f31168i, publicKeyCredentialUserEntity.f31168i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31165f, this.f31166g, this.f31167h, this.f31168i});
    }

    public final String toString() {
        StringBuilder o13 = cb.o("PublicKeyCredentialUserEntity{\n id=", m0.s(this.f31165f.n()), ", \n name='");
        o13.append(this.f31166g);
        o13.append("', \n icon='");
        o13.append(this.f31167h);
        o13.append("', \n displayName='");
        return a.a.p(o13, this.f31168i, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.B2(parcel, 2, this.f31165f.n(), false);
        bs1.c.I2(parcel, 3, this.f31166g, false);
        bs1.c.I2(parcel, 4, this.f31167h, false);
        bs1.c.I2(parcel, 5, this.f31168i, false);
        bs1.c.N2(parcel, M2);
    }
}
