package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h9 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132496b;

    public h9(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132495a = message;
        this.f132496b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132496b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return Intrinsics.d(this.f132495a, h9Var.f132495a) && Intrinsics.d(this.f132496b, h9Var.f132496b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132495a;
    }

    public final int hashCode() {
        int hashCode = this.f132495a.hashCode() * 31;
        String str = this.f132496b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132495a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132496b, ")");
    }
}
