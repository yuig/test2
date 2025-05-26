package com.facebook;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import df.k1;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "com/bugsnag/android/a0", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class AuthenticationToken implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f29858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29859b;

    /* renamed from: c, reason: collision with root package name */
    public final AuthenticationTokenHeader f29860c;

    /* renamed from: d, reason: collision with root package name */
    public final AuthenticationTokenClaims f29861d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29862e;

    public AuthenticationToken(String token, String expectedNonce) {
        List split$default;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        k1.b(token, "token");
        k1.b(expectedNonce, "expectedNonce");
        split$default = StringsKt__StringsKt.split$default(token, new String[]{"."}, false, 0, 6, null);
        if (split$default.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str = (String) split$default.get(0);
        String str2 = (String) split$default.get(1);
        String str3 = (String) split$default.get(2);
        this.f29858a = token;
        this.f29859b = expectedNonce;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str);
        this.f29860c = authenticationTokenHeader;
        this.f29861d = new AuthenticationTokenClaims(str2, expectedNonce);
        try {
            String h10 = lf.a.h(authenticationTokenHeader.f29885c);
            if (h10 != null) {
                if (lf.a.o(lf.a.g(h10), str + '.' + str2, str3)) {
                    this.f29862e = str3;
                    return;
                }
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        throw new IllegalArgumentException("Invalid Signature".toString());
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f29858a);
        jSONObject.put("expected_nonce", this.f29859b);
        AuthenticationTokenHeader authenticationTokenHeader = this.f29860c;
        authenticationTokenHeader.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(JwsHeader.ALGORITHM, authenticationTokenHeader.f29883a);
        jSONObject2.put(Header.TYPE, authenticationTokenHeader.f29884b);
        jSONObject2.put(JwsHeader.KEY_ID, authenticationTokenHeader.f29885c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f29861d.a());
        jSONObject.put("signature", this.f29862e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return Intrinsics.d(this.f29858a, authenticationToken.f29858a) && Intrinsics.d(this.f29859b, authenticationToken.f29859b) && Intrinsics.d(this.f29860c, authenticationToken.f29860c) && Intrinsics.d(this.f29861d, authenticationToken.f29861d) && Intrinsics.d(this.f29862e, authenticationToken.f29862e);
    }

    public final int hashCode() {
        return this.f29862e.hashCode() + ((this.f29861d.hashCode() + ((this.f29860c.hashCode() + cb.d(this.f29859b, cb.d(this.f29858a, 527, 31), 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f29858a);
        dest.writeString(this.f29859b);
        dest.writeParcelable(this.f29860c, i13);
        dest.writeParcelable(this.f29861d, i13);
        dest.writeString(this.f29862e);
    }

    public AuthenticationToken(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        k1.e(readString, "token");
        this.f29858a = readString;
        String readString2 = parcel.readString();
        k1.e(readString2, "expectedNonce");
        this.f29859b = readString2;
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.f29860c = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f29861d = (AuthenticationTokenClaims) readParcelable2;
                String readString3 = parcel.readString();
                k1.e(readString3, "signature");
                this.f29862e = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
