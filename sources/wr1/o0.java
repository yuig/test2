package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f130984a;

    /* renamed from: b, reason: collision with root package name */
    public final h32.i0 f130985b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130986c;

    public o0(h32.i0 pinalyticsContext, String emailOrUsername, boolean z13) {
        Intrinsics.checkNotNullParameter(emailOrUsername, "emailOrUsername");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f130984a = emailOrUsername;
        this.f130985b = pinalyticsContext;
        this.f130986c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f130984a, o0Var.f130984a) && Intrinsics.d(this.f130985b, o0Var.f130985b) && this.f130986c == o0Var.f130986c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130986c) + ((this.f130985b.hashCode() + (this.f130984a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LookUpUser(emailOrUsername=");
        sb3.append(this.f130984a);
        sb3.append(", pinalyticsContext=");
        sb3.append(this.f130985b);
        sb3.append(", isFromUserSearch=");
        return a.a.r(sb3, this.f130986c, ")");
    }
}
