package qr1;

import com.pinterest.api.model.wy0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lqr1/d;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "v3AccessToken", "c", "v5AccessToken", "d", "v5RefreshToken", "Lcom/pinterest/api/model/wy0;", "Lcom/pinterest/api/model/wy0;", "()Lcom/pinterest/api/model/wy0;", "user", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("access_token")
    @NotNull
    private final String v3AccessToken;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("v5_access_token")
    private final String v5AccessToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("v5_refresh_token")
    private final String v5RefreshToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("user")
    private final wy0 user;

    public d(String v3AccessToken) {
        Intrinsics.checkNotNullParameter(v3AccessToken, "v3AccessToken");
        this.v3AccessToken = v3AccessToken;
        this.v5AccessToken = null;
        this.v5RefreshToken = null;
        this.user = null;
    }

    /* renamed from: a, reason: from getter */
    public final wy0 getUser() {
        return this.user;
    }

    /* renamed from: b, reason: from getter */
    public final String getV3AccessToken() {
        return this.v3AccessToken;
    }

    /* renamed from: c, reason: from getter */
    public final String getV5AccessToken() {
        return this.v5AccessToken;
    }

    /* renamed from: d, reason: from getter */
    public final String getV5RefreshToken() {
        return this.v5RefreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.v3AccessToken, dVar.v3AccessToken) && Intrinsics.d(this.v5AccessToken, dVar.v5AccessToken) && Intrinsics.d(this.v5RefreshToken, dVar.v5RefreshToken) && Intrinsics.d(this.user, dVar.user);
    }

    public final int hashCode() {
        int hashCode = this.v3AccessToken.hashCode() * 31;
        String str = this.v5AccessToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.v5RefreshToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wy0 wy0Var = this.user;
        return hashCode3 + (wy0Var != null ? wy0Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.v3AccessToken;
        String str2 = this.v5AccessToken;
        String str3 = this.v5RefreshToken;
        wy0 wy0Var = this.user;
        StringBuilder w13 = a.a.w("AuthenticationResult(v3AccessToken=", str, ", v5AccessToken=", str2, ", v5RefreshToken=");
        w13.append(str3);
        w13.append(", user=");
        w13.append(wy0Var);
        w13.append(")");
        return w13.toString();
    }
}
