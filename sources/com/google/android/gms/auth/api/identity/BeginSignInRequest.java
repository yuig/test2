package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    public final PasswordRequestOptions f30615f;

    /* renamed from: g, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f30616g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30617h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30618i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30619j;

    /* renamed from: k, reason: collision with root package name */
    public final PasskeysRequestOptions f30620k;

    /* renamed from: l, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f30621l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f30622m;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new c();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f30623f;

        /* renamed from: g, reason: collision with root package name */
        public final String f30624g;

        /* renamed from: h, reason: collision with root package name */
        public final String f30625h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f30626i;

        /* renamed from: j, reason: collision with root package name */
        public final String f30627j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList f30628k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f30629l;

        public GoogleIdTokenRequestOptions(String str, String str2, String str3, List list, boolean z13, boolean z14, boolean z15) {
            boolean z16 = true;
            if (z14 && z15) {
                z16 = false;
            }
            com.bumptech.glide.d.i("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z16);
            this.f30623f = z13;
            if (z13) {
                com.bumptech.glide.d.u(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f30624g = str;
            this.f30625h = str2;
            this.f30626i = z14;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f30628k = arrayList;
            this.f30627j = str3;
            this.f30629l = z15;
        }

        public static a e() {
            a aVar = new a();
            aVar.f30666a = false;
            aVar.f30667b = null;
            aVar.f30668c = null;
            aVar.f30669d = true;
            aVar.f30670e = null;
            aVar.f30671f = null;
            aVar.f30672g = false;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f30623f == googleIdTokenRequestOptions.f30623f && com.bumptech.glide.c.x(this.f30624g, googleIdTokenRequestOptions.f30624g) && com.bumptech.glide.c.x(this.f30625h, googleIdTokenRequestOptions.f30625h) && this.f30626i == googleIdTokenRequestOptions.f30626i && com.bumptech.glide.c.x(this.f30627j, googleIdTokenRequestOptions.f30627j) && com.bumptech.glide.c.x(this.f30628k, googleIdTokenRequestOptions.f30628k) && this.f30629l == googleIdTokenRequestOptions.f30629l;
        }

        public final int hashCode() {
            Boolean valueOf = Boolean.valueOf(this.f30623f);
            Boolean valueOf2 = Boolean.valueOf(this.f30626i);
            Boolean valueOf3 = Boolean.valueOf(this.f30629l);
            return Arrays.hashCode(new Object[]{valueOf, this.f30624g, this.f30625h, valueOf2, this.f30627j, this.f30628k, valueOf3});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            int M2 = bs1.c.M2(parcel, 20293);
            bs1.c.O2(parcel, 1, 4);
            parcel.writeInt(this.f30623f ? 1 : 0);
            bs1.c.I2(parcel, 2, this.f30624g, false);
            bs1.c.I2(parcel, 3, this.f30625h, false);
            bs1.c.O2(parcel, 4, 4);
            parcel.writeInt(this.f30626i ? 1 : 0);
            bs1.c.I2(parcel, 5, this.f30627j, false);
            bs1.c.J2(parcel, 6, this.f30628k);
            bs1.c.O2(parcel, 7, 4);
            parcel.writeInt(this.f30629l ? 1 : 0);
            bs1.c.N2(parcel, M2);
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new d();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f30630f;

        /* renamed from: g, reason: collision with root package name */
        public final String f30631g;

        public PasskeyJsonRequestOptions(String str, boolean z13) {
            if (z13) {
                com.bumptech.glide.d.t(str);
            }
            this.f30630f = z13;
            this.f30631g = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f30630f == passkeyJsonRequestOptions.f30630f && com.bumptech.glide.c.x(this.f30631g, passkeyJsonRequestOptions.f30631g);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f30630f), this.f30631g});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            int M2 = bs1.c.M2(parcel, 20293);
            bs1.c.O2(parcel, 1, 4);
            parcel.writeInt(this.f30630f ? 1 : 0);
            bs1.c.I2(parcel, 2, this.f30631g, false);
            bs1.c.N2(parcel, M2);
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new e();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f30632f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f30633g;

        /* renamed from: h, reason: collision with root package name */
        public final String f30634h;

        public PasskeysRequestOptions(boolean z13, byte[] bArr, String str) {
            if (z13) {
                com.bumptech.glide.d.t(bArr);
                com.bumptech.glide.d.t(str);
            }
            this.f30632f = z13;
            this.f30633g = bArr;
            this.f30634h = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f30632f == passkeysRequestOptions.f30632f && Arrays.equals(this.f30633g, passkeysRequestOptions.f30633g) && Objects.equals(this.f30634h, passkeysRequestOptions.f30634h);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f30633g) + (Objects.hash(Boolean.valueOf(this.f30632f), this.f30634h) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            int M2 = bs1.c.M2(parcel, 20293);
            bs1.c.O2(parcel, 1, 4);
            parcel.writeInt(this.f30632f ? 1 : 0);
            bs1.c.B2(parcel, 2, this.f30633g, false);
            bs1.c.I2(parcel, 3, this.f30634h, false);
            bs1.c.N2(parcel, M2);
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new f();

        /* renamed from: f, reason: collision with root package name */
        public final boolean f30635f;

        public PasswordRequestOptions(boolean z13) {
            this.f30635f = z13;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f30635f == ((PasswordRequestOptions) obj).f30635f;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f30635f)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            int M2 = bs1.c.M2(parcel, 20293);
            bs1.c.O2(parcel, 1, 4);
            parcel.writeInt(this.f30635f ? 1 : 0);
            bs1.c.N2(parcel, M2);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z13, int i13, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z14) {
        com.bumptech.glide.d.t(passwordRequestOptions);
        this.f30615f = passwordRequestOptions;
        com.bumptech.glide.d.t(googleIdTokenRequestOptions);
        this.f30616g = googleIdTokenRequestOptions;
        this.f30617h = str;
        this.f30618i = z13;
        this.f30619j = i13;
        this.f30620k = passkeysRequestOptions == null ? new PasskeysRequestOptions(false, null, null) : passkeysRequestOptions;
        this.f30621l = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(null, false) : passkeyJsonRequestOptions;
        this.f30622m = z14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return com.bumptech.glide.c.x(this.f30615f, beginSignInRequest.f30615f) && com.bumptech.glide.c.x(this.f30616g, beginSignInRequest.f30616g) && com.bumptech.glide.c.x(this.f30620k, beginSignInRequest.f30620k) && com.bumptech.glide.c.x(this.f30621l, beginSignInRequest.f30621l) && com.bumptech.glide.c.x(this.f30617h, beginSignInRequest.f30617h) && this.f30618i == beginSignInRequest.f30618i && this.f30619j == beginSignInRequest.f30619j && this.f30622m == beginSignInRequest.f30622m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30615f, this.f30616g, this.f30620k, this.f30621l, this.f30617h, Boolean.valueOf(this.f30618i), Integer.valueOf(this.f30619j), Boolean.valueOf(this.f30622m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f30615f, i13, false);
        bs1.c.H2(parcel, 2, this.f30616g, i13, false);
        bs1.c.I2(parcel, 3, this.f30617h, false);
        bs1.c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30618i ? 1 : 0);
        bs1.c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30619j);
        bs1.c.H2(parcel, 6, this.f30620k, i13, false);
        bs1.c.H2(parcel, 7, this.f30621l, i13, false);
        bs1.c.O2(parcel, 8, 4);
        parcel.writeInt(this.f30622m ? 1 : 0);
        bs1.c.N2(parcel, M2);
    }
}
