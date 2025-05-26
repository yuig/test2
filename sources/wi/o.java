package wi;

import kh2.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends kh2.w {

    /* renamed from: a, reason: collision with root package name */
    public final n f129975a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129976b;

    public o(n code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f129975a = code;
        this.f129976b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f129975a == oVar.f129975a && Intrinsics.d(this.f129976b, oVar.f129976b) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        return j1.t(this.f129975a.hashCode() * 31, this.f129976b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FullScreenContentError(code=");
        sb3.append(this.f129975a);
        sb3.append(", message=");
        return a.a.p(sb3, this.f129976b, ", mediationAdError=null)");
    }
}
