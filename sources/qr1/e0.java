package qr1;

import a.cb;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lqr1/e0;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ssoId", "c", "ssoIdToken", "ssoEmail", "d", "getSsoUserName", "ssoUserName", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class e0 implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("sso_id")
    @NotNull
    private final String ssoId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("sso_id_token")
    @NotNull
    private final String ssoIdToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("sso_email")
    @NotNull
    private final String ssoEmail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("sso_user_name")
    @NotNull
    private final String ssoUserName;

    /* renamed from: a, reason: from getter */
    public final String getSsoEmail() {
        return this.ssoEmail;
    }

    /* renamed from: b, reason: from getter */
    public final String getSsoId() {
        return this.ssoId;
    }

    /* renamed from: c, reason: from getter */
    public final String getSsoIdToken() {
        return this.ssoIdToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.ssoId, e0Var.ssoId) && Intrinsics.d(this.ssoIdToken, e0Var.ssoIdToken) && Intrinsics.d(this.ssoEmail, e0Var.ssoEmail) && Intrinsics.d(this.ssoUserName, e0Var.ssoUserName);
    }

    public final int hashCode() {
        return this.ssoUserName.hashCode() + cb.d(this.ssoEmail, cb.d(this.ssoIdToken, this.ssoId.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.ssoId;
        String str2 = this.ssoIdToken;
        return a.a.q(a.a.w("SSOTokenExchangeResponse(ssoId=", str, ", ssoIdToken=", str2, ", ssoEmail="), this.ssoEmail, ", ssoUserName=", this.ssoUserName, ")");
    }
}
