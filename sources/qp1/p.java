package qp1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f104817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104818b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f104819c;

    /* renamed from: d, reason: collision with root package name */
    public final String f104820d;

    /* renamed from: e, reason: collision with root package name */
    public final u50.i0 f104821e;

    public /* synthetic */ p(u50.k0 k0Var) {
        this(false, "", false, "", k0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f104817a == pVar.f104817a && Intrinsics.d(this.f104818b, pVar.f104818b) && this.f104819c == pVar.f104819c && Intrinsics.d(this.f104820d, pVar.f104820d) && Intrinsics.d(this.f104821e, pVar.f104821e);
    }

    public final int hashCode() {
        return this.f104821e.hashCode() + cb.d(this.f104820d, ep.b.e(this.f104819c, cb.d(this.f104818b, Boolean.hashCode(this.f104817a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnAuthenticationError(isA2BEnabled=");
        sb3.append(this.f104817a);
        sb3.append(", error=");
        sb3.append(this.f104818b);
        sb3.append(", isAccessDenied=");
        sb3.append(this.f104819c);
        sb3.append(", errorMessage=");
        sb3.append(this.f104820d);
        sb3.append(", message=");
        return jq.b.k(sb3, this.f104821e, ")");
    }

    public p(boolean z13, String error, boolean z14, String errorMessage, u50.i0 message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f104817a = z13;
        this.f104818b = error;
        this.f104819c = z14;
        this.f104820d = errorMessage;
        this.f104821e = message;
    }
}
