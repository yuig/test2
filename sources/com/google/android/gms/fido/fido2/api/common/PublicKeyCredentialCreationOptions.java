package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import ao2.m0;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new lh.a(24);

    /* renamed from: f, reason: collision with root package name */
    public final PublicKeyCredentialRpEntity f31134f;

    /* renamed from: g, reason: collision with root package name */
    public final PublicKeyCredentialUserEntity f31135g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f31136h;

    /* renamed from: i, reason: collision with root package name */
    public final List f31137i;

    /* renamed from: j, reason: collision with root package name */
    public final Double f31138j;

    /* renamed from: k, reason: collision with root package name */
    public final List f31139k;

    /* renamed from: l, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f31140l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f31141m;

    /* renamed from: n, reason: collision with root package name */
    public final TokenBinding f31142n;

    /* renamed from: o, reason: collision with root package name */
    public final AttestationConveyancePreference f31143o;

    /* renamed from: p, reason: collision with root package name */
    public final AuthenticationExtensions f31144p;

    /* renamed from: q, reason: collision with root package name */
    public final String f31145q;

    /* renamed from: r, reason: collision with root package name */
    public final ResultReceiver f31146r;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d2, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.f31146r = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions e13 = e(new JSONObject(str2));
                this.f31134f = e13.f31134f;
                this.f31135g = e13.f31135g;
                this.f31136h = e13.f31136h;
                this.f31137i = e13.f31137i;
                this.f31138j = e13.f31138j;
                this.f31139k = e13.f31139k;
                this.f31140l = e13.f31140l;
                this.f31141m = e13.f31141m;
                this.f31142n = e13.f31142n;
                this.f31143o = e13.f31143o;
                this.f31144p = e13.f31144p;
                this.f31145q = str2;
                return;
            } catch (JSONException e14) {
                throw new IllegalArgumentException(e14);
            }
        }
        com.bumptech.glide.d.t(publicKeyCredentialRpEntity);
        this.f31134f = publicKeyCredentialRpEntity;
        com.bumptech.glide.d.t(publicKeyCredentialUserEntity);
        this.f31135g = publicKeyCredentialUserEntity;
        com.bumptech.glide.d.t(bArr);
        this.f31136h = bArr;
        com.bumptech.glide.d.t(list);
        this.f31137i = list;
        this.f31138j = d2;
        this.f31139k = list2;
        this.f31140l = authenticatorSelectionCriteria;
        this.f31141m = num;
        this.f31142n = tokenBinding;
        if (str != null) {
            try {
                this.f31143o = AttestationConveyancePreference.fromString(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e15) {
                throw new IllegalArgumentException(e15);
            }
        } else {
            this.f31143o = null;
        }
        this.f31144p = authenticationExtensions;
        this.f31145q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions e(org.json.JSONObject r31) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.e(org.json.JSONObject):com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (com.bumptech.glide.c.x(this.f31134f, publicKeyCredentialCreationOptions.f31134f) && com.bumptech.glide.c.x(this.f31135g, publicKeyCredentialCreationOptions.f31135g) && Arrays.equals(this.f31136h, publicKeyCredentialCreationOptions.f31136h) && com.bumptech.glide.c.x(this.f31138j, publicKeyCredentialCreationOptions.f31138j)) {
            List list = this.f31137i;
            List list2 = publicKeyCredentialCreationOptions.f31137i;
            if (list.containsAll(list2) && list2.containsAll(list)) {
                List list3 = this.f31139k;
                List list4 = publicKeyCredentialCreationOptions.f31139k;
                if (((list3 == null && list4 == null) || (list3 != null && list4 != null && list3.containsAll(list4) && list4.containsAll(list3))) && com.bumptech.glide.c.x(this.f31140l, publicKeyCredentialCreationOptions.f31140l) && com.bumptech.glide.c.x(this.f31141m, publicKeyCredentialCreationOptions.f31141m) && com.bumptech.glide.c.x(this.f31142n, publicKeyCredentialCreationOptions.f31142n) && com.bumptech.glide.c.x(this.f31143o, publicKeyCredentialCreationOptions.f31143o) && com.bumptech.glide.c.x(this.f31144p, publicKeyCredentialCreationOptions.f31144p) && com.bumptech.glide.c.x(this.f31145q, publicKeyCredentialCreationOptions.f31145q)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31134f, this.f31135g, Integer.valueOf(Arrays.hashCode(this.f31136h)), this.f31137i, this.f31138j, this.f31139k, this.f31140l, this.f31141m, this.f31142n, this.f31143o, this.f31144p, this.f31145q});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31134f);
        String valueOf2 = String.valueOf(this.f31135g);
        String s13 = m0.s(this.f31136h);
        String valueOf3 = String.valueOf(this.f31137i);
        String valueOf4 = String.valueOf(this.f31139k);
        String valueOf5 = String.valueOf(this.f31140l);
        String valueOf6 = String.valueOf(this.f31142n);
        String valueOf7 = String.valueOf(this.f31143o);
        String valueOf8 = String.valueOf(this.f31144p);
        StringBuilder w13 = a.a.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a.a.B(w13, s13, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w13.append(this.f31138j);
        w13.append(", \n excludeList=");
        w13.append(valueOf4);
        w13.append(", \n authenticatorSelection=");
        w13.append(valueOf5);
        w13.append(", \n requestId=");
        w13.append(this.f31141m);
        w13.append(", \n tokenBinding=");
        w13.append(valueOf6);
        w13.append(", \n attestationConveyancePreference=");
        return a.a.q(w13, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 2, this.f31134f, i13, false);
        bs1.c.H2(parcel, 3, this.f31135g, i13, false);
        bs1.c.B2(parcel, 4, this.f31136h, false);
        bs1.c.L2(parcel, 5, this.f31137i, false);
        bs1.c.C2(parcel, 6, this.f31138j);
        bs1.c.L2(parcel, 7, this.f31139k, false);
        bs1.c.H2(parcel, 8, this.f31140l, i13, false);
        bs1.c.F2(parcel, 9, this.f31141m);
        bs1.c.H2(parcel, 10, this.f31142n, i13, false);
        AttestationConveyancePreference attestationConveyancePreference = this.f31143o;
        bs1.c.I2(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), false);
        bs1.c.H2(parcel, 12, this.f31144p, i13, false);
        bs1.c.I2(parcel, 13, this.f31145q, false);
        bs1.c.H2(parcel, 14, this.f31146r, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
