package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t7 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133333a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133334b;

    public t7(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133333a = __typename;
        this.f133334b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133334b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return Intrinsics.d(this.f133333a, t7Var.f133333a) && Intrinsics.d(this.f133334b, t7Var.f133334b);
    }

    public final int hashCode() {
        int hashCode = this.f133333a.hashCode() * 31;
        Boolean bool = this.f133334b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133333a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133334b, ")");
    }
}
