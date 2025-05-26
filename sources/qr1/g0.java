package qr1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0005¨\u0006\u000f"}, d2 = {"Lqr1/g0;", "", "", "a", "Z", "()Z", "connectedToGPlus", "b", "getConnectedGoogle", "connectedGoogle", "c", "hasPassword", "d", "getStrictEmailStatus", "strictEmailStatus", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("connected_to_gplus")
    private final boolean connectedToGPlus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("connected_to_google")
    private final boolean connectedGoogle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("has_password")
    private final boolean hasPassword;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("strict_email_status")
    private final boolean strictEmailStatus = false;

    public g0(boolean z13, boolean z14, boolean z15) {
        this.connectedToGPlus = z13;
        this.connectedGoogle = z14;
        this.hasPassword = z15;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getConnectedToGPlus() {
        return this.connectedToGPlus;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasPassword() {
        return this.hasPassword;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.connectedToGPlus == g0Var.connectedToGPlus && this.connectedGoogle == g0Var.connectedGoogle && this.hasPassword == g0Var.hasPassword && this.strictEmailStatus == g0Var.strictEmailStatus;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.strictEmailStatus) + ep.b.e(this.hasPassword, ep.b.e(this.connectedGoogle, Boolean.hashCode(this.connectedToGPlus) * 31, 31), 31);
    }

    public final String toString() {
        return "UserLoginData(connectedToGPlus=" + this.connectedToGPlus + ", connectedGoogle=" + this.connectedGoogle + ", hasPassword=" + this.hasPassword + ", strictEmailStatus=" + this.strictEmailStatus + ")";
    }
}
