package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23304a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23305b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23306c;

    /* renamed from: d, reason: collision with root package name */
    public final f30 f23307d;

    public r(boolean z13, boolean z14, f30 f30Var, int i13) {
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        f30Var = (i13 & 8) != 0 ? null : f30Var;
        this.f23304a = z13;
        this.f23305b = z14;
        this.f23306c = currentTimeMillis;
        this.f23307d = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f23304a == rVar.f23304a && this.f23305b == rVar.f23305b && this.f23306c == rVar.f23306c && Intrinsics.d(this.f23307d, rVar.f23307d);
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f23306c, ep.b.e(this.f23305b, Boolean.hashCode(this.f23304a) * 31, 31), 31);
        f30 f30Var = this.f23307d;
        return c13 + (f30Var == null ? 0 : f30Var.hashCode());
    }

    public final long i() {
        return this.f23306c;
    }

    public final boolean j() {
        return this.f23304a;
    }

    public final f30 k() {
        return this.f23307d;
    }

    public final boolean l() {
        return this.f23305b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AcknowledgeDeepLinkActionWithResult(deeplinkSucceeded=");
        sb3.append(this.f23304a);
        sb3.append(", shouldLog=");
        sb3.append(this.f23305b);
        sb3.append(", clickThroughStartTimestamp=");
        sb3.append(this.f23306c);
        sb3.append(", pinToOpen=");
        return jq.b.e(sb3, this.f23307d, ")");
    }
}
