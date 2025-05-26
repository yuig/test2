package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21713b;

    public h0(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f21712a = message;
        this.f21713b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f21713b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f21712a, h0Var.f21712a) && Intrinsics.d(this.f21713b, h0Var.f21713b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f21712a;
    }

    public final int hashCode() {
        int hashCode = this.f21712a.hashCode() * 31;
        String str = this.f21713b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f21712a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f21713b, ")");
    }
}
