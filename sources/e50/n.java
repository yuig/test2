package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f57395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57396b;

    public n(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f57395a = message;
        this.f57396b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f57396b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f57395a, nVar.f57395a) && Intrinsics.d(this.f57396b, nVar.f57396b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f57395a;
    }

    public final int hashCode() {
        int hashCode = this.f57395a.hashCode() * 31;
        String str = this.f57396b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f57395a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f57396b, ")");
    }
}
