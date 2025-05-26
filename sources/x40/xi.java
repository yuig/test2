package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xi {

    /* renamed from: a, reason: collision with root package name */
    public final String f133712a;

    /* renamed from: b, reason: collision with root package name */
    public final wi f133713b;

    public xi(String str, wi wiVar) {
        this.f133712a = str;
        this.f133713b = wiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return Intrinsics.d(this.f133712a, xiVar.f133712a) && Intrinsics.d(this.f133713b, xiVar.f133713b);
    }

    public final int hashCode() {
        String str = this.f133712a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        wi wiVar = this.f133713b;
        return hashCode + (wiVar != null ? wiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Edge(cursor=" + this.f133712a + ", node=" + this.f133713b + ")";
    }
}
