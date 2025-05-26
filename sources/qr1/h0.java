package qr1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lqr1/h0;", "", "", "a", "Z", "b", "()Z", "password", "google", "c", "getFacebook", "facebook", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("password")
    private final boolean password = false;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("google")
    private final boolean google = false;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("facebook")
    private final boolean facebook = false;

    /* renamed from: a, reason: from getter */
    public final boolean getGoogle() {
        return this.google;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getPassword() {
        return this.password;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.password == h0Var.password && this.google == h0Var.google && this.facebook == h0Var.facebook;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.facebook) + ep.b.e(this.google, Boolean.hashCode(this.password) * 31, 31);
    }

    public final String toString() {
        boolean z13 = this.password;
        boolean z14 = this.google;
        boolean z15 = this.facebook;
        StringBuilder sb3 = new StringBuilder("UserSigninInfo(password=");
        sb3.append(z13);
        sb3.append(", google=");
        sb3.append(z14);
        sb3.append(", facebook=");
        return a.a.r(sb3, z15, ")");
    }
}
