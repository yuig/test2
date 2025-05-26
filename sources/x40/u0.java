package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133399b;

    public u0(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133398a = message;
        this.f133399b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133399b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f133398a, u0Var.f133398a) && Intrinsics.d(this.f133399b, u0Var.f133399b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133398a;
    }

    public final int hashCode() {
        int hashCode = this.f133398a.hashCode() * 31;
        String str = this.f133399b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133398a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133399b, ")");
    }
}
