package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f120417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120418b;

    public q0(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f120417a = message;
        this.f120418b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f120418b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f120417a, q0Var.f120417a) && Intrinsics.d(this.f120418b, q0Var.f120418b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f120417a;
    }

    public final int hashCode() {
        int hashCode = this.f120417a.hashCode() * 31;
        String str = this.f120418b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f120417a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f120418b, ")");
    }
}
