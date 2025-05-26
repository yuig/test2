package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u5 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133415b;

    public u5(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133414a = message;
        this.f133415b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133415b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return Intrinsics.d(this.f133414a, u5Var.f133414a) && Intrinsics.d(this.f133415b, u5Var.f133415b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133414a;
    }

    public final int hashCode() {
        int hashCode = this.f133414a.hashCode() * 31;
        String str = this.f133415b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133414a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133415b, ")");
    }
}
