package wt1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends tl1.i {

    /* renamed from: b, reason: collision with root package name */
    public final Object f131125b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f131127d;

    public q(Object obj, int i13, int i14) {
        super(1);
        this.f131125b = obj;
        this.f131126c = i13;
        this.f131127d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f131125b, qVar.f131125b) && this.f131126c == qVar.f131126c && this.f131127d == qVar.f131127d;
    }

    public final int hashCode() {
        Object obj = this.f131125b;
        return Integer.hashCode(this.f131127d) + ep.b.b(this.f131126c, (obj == null ? 0 : obj.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Payload(moved=");
        sb3.append(this.f131125b);
        sb3.append(", from=");
        sb3.append(this.f131126c);
        sb3.append(", to=");
        return a.a.n(sb3, this.f131127d, ")");
    }
}
