package qr1;

import a.cb;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u0018"}, d2 = {"Lqr1/d0;", "Ljava/io/Serializable;", "", "a", "Z", "e", "()Z", "isSSO", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "authorizationUri", "c", "d", "redirectUri", "getIssuer", "issuer", "existingUser", "f", "getExistingUserIsSSO", "existingUserIsSSO", "g", "exchangeCodeToTokenInfoUrl", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class d0 implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("is_sso")
    private final boolean isSSO;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("authorization_uri")
    @NotNull
    private final String authorizationUri;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("redirect_uri")
    @NotNull
    private final String redirectUri;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("issuer")
    @NotNull
    private final String issuer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("existing_user")
    private final boolean existingUser;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("existing_user_is_sso")
    private final boolean existingUserIsSSO;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("exchange_code_to_token_info_url")
    @NotNull
    private final String exchangeCodeToTokenInfoUrl;

    /* renamed from: a, reason: from getter */
    public final String getAuthorizationUri() {
        return this.authorizationUri;
    }

    /* renamed from: b, reason: from getter */
    public final String getExchangeCodeToTokenInfoUrl() {
        return this.exchangeCodeToTokenInfoUrl;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getExistingUser() {
        return this.existingUser;
    }

    /* renamed from: d, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSSO() {
        return this.isSSO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.isSSO == d0Var.isSSO && Intrinsics.d(this.authorizationUri, d0Var.authorizationUri) && Intrinsics.d(this.redirectUri, d0Var.redirectUri) && Intrinsics.d(this.issuer, d0Var.issuer) && this.existingUser == d0Var.existingUser && this.existingUserIsSSO == d0Var.existingUserIsSSO && Intrinsics.d(this.exchangeCodeToTokenInfoUrl, d0Var.exchangeCodeToTokenInfoUrl);
    }

    public final int hashCode() {
        return this.exchangeCodeToTokenInfoUrl.hashCode() + ep.b.e(this.existingUserIsSSO, ep.b.e(this.existingUser, cb.d(this.issuer, cb.d(this.redirectUri, cb.d(this.authorizationUri, Boolean.hashCode(this.isSSO) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        boolean z13 = this.isSSO;
        String str = this.authorizationUri;
        String str2 = this.redirectUri;
        String str3 = this.issuer;
        boolean z14 = this.existingUser;
        boolean z15 = this.existingUserIsSSO;
        String str4 = this.exchangeCodeToTokenInfoUrl;
        StringBuilder sb3 = new StringBuilder("SSOInfo(isSSO=");
        sb3.append(z13);
        sb3.append(", authorizationUri=");
        sb3.append(str);
        sb3.append(", redirectUri=");
        a.a.B(sb3, str2, ", issuer=", str3, ", existingUser=");
        a.c.v(sb3, z14, ", existingUserIsSSO=", z15, ", exchangeCodeToTokenInfoUrl=");
        return a.a.p(sb3, str4, ")");
    }
}
