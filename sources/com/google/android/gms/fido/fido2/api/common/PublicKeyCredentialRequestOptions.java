package com.google.android.gms.fido.fido2.api.common;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import ao2.m0;
import gi.a2;
import gi.y1;
import gi.z1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new lh.a(28);

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f31152f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f31153g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31154h;

    /* renamed from: i, reason: collision with root package name */
    public final List f31155i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f31156j;

    /* renamed from: k, reason: collision with root package name */
    public final TokenBinding f31157k;

    /* renamed from: l, reason: collision with root package name */
    public final UserVerificationRequirement f31158l;

    /* renamed from: m, reason: collision with root package name */
    public final AuthenticationExtensions f31159m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f31160n;

    /* renamed from: o, reason: collision with root package name */
    public final ResultReceiver f31161o;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d2, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l13, String str3, ResultReceiver resultReceiver) {
        this.f31161o = resultReceiver;
        if (str3 != null) {
            ((a2) ((z1) y1.f65140b.f65141a.f65109a)).getClass();
            a2.f65046a.h();
            throw null;
        }
        com.bumptech.glide.d.t(bArr);
        this.f31152f = bArr;
        this.f31153g = d2;
        com.bumptech.glide.d.t(str);
        this.f31154h = str;
        this.f31155i = list;
        this.f31156j = num;
        this.f31157k = tokenBinding;
        this.f31160n = l13;
        if (str2 != null) {
            try {
                this.f31158l = UserVerificationRequirement.fromString(str2);
            } catch (zzbc e13) {
                throw new IllegalArgumentException(e13);
            }
        } else {
            this.f31158l = null;
        }
        this.f31159m = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (Arrays.equals(this.f31152f, publicKeyCredentialRequestOptions.f31152f) && com.bumptech.glide.c.x(this.f31153g, publicKeyCredentialRequestOptions.f31153g) && com.bumptech.glide.c.x(this.f31154h, publicKeyCredentialRequestOptions.f31154h)) {
            List list = this.f31155i;
            List list2 = publicKeyCredentialRequestOptions.f31155i;
            if (((list == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && com.bumptech.glide.c.x(this.f31156j, publicKeyCredentialRequestOptions.f31156j) && com.bumptech.glide.c.x(this.f31157k, publicKeyCredentialRequestOptions.f31157k) && com.bumptech.glide.c.x(this.f31158l, publicKeyCredentialRequestOptions.f31158l) && com.bumptech.glide.c.x(this.f31159m, publicKeyCredentialRequestOptions.f31159m) && com.bumptech.glide.c.x(this.f31160n, publicKeyCredentialRequestOptions.f31160n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31152f)), this.f31153g, this.f31154h, this.f31155i, this.f31156j, this.f31157k, this.f31158l, this.f31159m, this.f31160n});
    }

    public final String toString() {
        String s13 = m0.s(this.f31152f);
        String valueOf = String.valueOf(this.f31155i);
        String valueOf2 = String.valueOf(this.f31157k);
        String valueOf3 = String.valueOf(this.f31158l);
        String valueOf4 = String.valueOf(this.f31159m);
        StringBuilder o13 = cb.o("PublicKeyCredentialRequestOptions{\n challenge=", s13, ", \n timeoutSeconds=");
        o13.append(this.f31153g);
        o13.append(", \n rpId='");
        a.a.B(o13, this.f31154h, "', \n allowList=", valueOf, ", \n requestId=");
        o13.append(this.f31156j);
        o13.append(", \n tokenBinding=");
        o13.append(valueOf2);
        o13.append(", \n userVerification=");
        a.a.B(o13, valueOf3, ", \n authenticationExtensions=", valueOf4, ", \n longRequestId=");
        o13.append(this.f31160n);
        o13.append("}");
        return o13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.B2(parcel, 2, this.f31152f, false);
        bs1.c.C2(parcel, 3, this.f31153g);
        bs1.c.I2(parcel, 4, this.f31154h, false);
        bs1.c.L2(parcel, 5, this.f31155i, false);
        bs1.c.F2(parcel, 6, this.f31156j);
        bs1.c.H2(parcel, 7, this.f31157k, i13, false);
        UserVerificationRequirement userVerificationRequirement = this.f31158l;
        bs1.c.I2(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        bs1.c.H2(parcel, 9, this.f31159m, i13, false);
        bs1.c.G2(parcel, 10, this.f31160n);
        bs1.c.H2(parcel, 12, this.f31161o, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
