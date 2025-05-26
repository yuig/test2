package m4;

import kh2.w;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f85809c = new q(w.Q(0), w.Q(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f85810a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85811b;

    public q(long j13, long j14) {
        this.f85810a = j13;
        this.f85811b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return n4.m.a(this.f85810a, qVar.f85810a) && n4.m.a(this.f85811b, qVar.f85811b);
    }

    public final int hashCode() {
        n4.n[] nVarArr = n4.m.f89188b;
        return Long.hashCode(this.f85811b) + (Long.hashCode(this.f85810a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) n4.m.d(this.f85810a)) + ", restLine=" + ((Object) n4.m.d(this.f85811b)) + ')';
    }
}
