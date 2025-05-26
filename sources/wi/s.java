package wi;

import kh2.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends kh2.w {

    /* renamed from: a, reason: collision with root package name */
    public final int f129984a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129985b;

    /* renamed from: c, reason: collision with root package name */
    public final String f129986c;

    public s(int i13, String message, String domain) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f129984a = i13;
        this.f129985b = message;
        this.f129986c = domain;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f129984a == sVar.f129984a && Intrinsics.d(this.f129985b, sVar.f129985b) && Intrinsics.d(this.f129986c, sVar.f129986c);
    }

    public final int hashCode() {
        return this.f129986c.hashCode() + j1.t(Integer.hashCode(this.f129984a) * 31, this.f129985b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MediationAdError(code=");
        sb3.append(this.f129984a);
        sb3.append(", message=");
        sb3.append(this.f129985b);
        sb3.append(", domain=");
        return a.a.p(sb3, this.f129986c, ")");
    }
}
