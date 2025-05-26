package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21737a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21738b;

    public p0(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f21737a = message;
        this.f21738b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f21738b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f21737a, p0Var.f21737a) && Intrinsics.d(this.f21738b, p0Var.f21738b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f21737a;
    }

    public final int hashCode() {
        int hashCode = this.f21737a.hashCode() * 31;
        String str = this.f21738b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f21737a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f21738b, ")");
    }
}
