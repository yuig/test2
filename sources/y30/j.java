package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g f136748a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136749b;

    public j(g gVar, String str) {
        this.f136748a = gVar;
        this.f136749b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f136748a, jVar.f136748a) && Intrinsics.d(this.f136749b, jVar.f136749b);
    }

    public final int hashCode() {
        g gVar = this.f136748a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        String str = this.f136749b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Edge(node=" + this.f136748a + ", cursor=" + this.f136749b + ")";
    }
}
