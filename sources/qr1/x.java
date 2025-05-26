package qr1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lqr1/x;", "", "", "a", "Z", "()Z", "isGoogleEligible", "b", "isLinkValid", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("is_google_eligible")
    private final boolean isGoogleEligible = false;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("is_link_valid")
    private final boolean isLinkValid = false;

    /* renamed from: a, reason: from getter */
    public final boolean getIsGoogleEligible() {
        return this.isGoogleEligible;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.isGoogleEligible == xVar.isGoogleEligible && this.isLinkValid == xVar.isLinkValid;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLinkValid) + (Boolean.hashCode(this.isGoogleEligible) * 31);
    }

    public final String toString() {
        return "PasswordResetUserStatus(isGoogleEligible=" + this.isGoogleEligible + ", isLinkValid=" + this.isLinkValid + ")";
    }
}
