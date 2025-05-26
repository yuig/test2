package wi;

import kh2.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends kh2.w {

    /* renamed from: a, reason: collision with root package name */
    public final q f129981a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129982b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f129983c;

    public r(q code, String message, b0 b0Var) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f129981a = code;
        this.f129982b = message;
        this.f129983c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f129981a == rVar.f129981a && Intrinsics.d(this.f129982b, rVar.f129982b) && Intrinsics.d(this.f129983c, rVar.f129983c);
    }

    public final int hashCode() {
        int t13 = j1.t(this.f129981a.hashCode() * 31, this.f129982b);
        b0 b0Var = this.f129983c;
        return t13 + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public final String toString() {
        return "LoadAdError(code=" + this.f129981a + ", message=" + this.f129982b + ", responseInfo=" + this.f129983c + ")";
    }
}
