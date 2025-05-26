package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f120425a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120426b;

    public u0(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f120425a = message;
        this.f120426b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f120426b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f120425a, u0Var.f120425a) && Intrinsics.d(this.f120426b, u0Var.f120426b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f120425a;
    }

    public final int hashCode() {
        int hashCode = this.f120425a.hashCode() * 31;
        String str = this.f120426b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f120425a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f120426b, ")");
    }
}
