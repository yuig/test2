package d92;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f54160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f54161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54162c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f54163d;

    public m(String error, boolean z13, String errorMessage, u50.i0 message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f54160a = error;
        this.f54161b = z13;
        this.f54162c = errorMessage;
        this.f54163d = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f54160a, mVar.f54160a) && this.f54161b == mVar.f54161b && Intrinsics.d(this.f54162c, mVar.f54162c) && Intrinsics.d(this.f54163d, mVar.f54163d);
    }

    public final int hashCode() {
        return this.f54163d.hashCode() + cb.d(this.f54162c, ep.b.e(this.f54161b, this.f54160a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnAuthenticationError(error=");
        sb3.append(this.f54160a);
        sb3.append(", isAccessDenied=");
        sb3.append(this.f54161b);
        sb3.append(", errorMessage=");
        sb3.append(this.f54162c);
        sb3.append(", message=");
        return jq.b.k(sb3, this.f54163d, ")");
    }

    public /* synthetic */ m(String str, u50.k0 k0Var) {
        this("", false, str, k0Var);
    }
}
