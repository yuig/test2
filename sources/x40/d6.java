package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d6 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132212b;

    public d6(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132211a = message;
        this.f132212b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132212b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return Intrinsics.d(this.f132211a, d6Var.f132211a) && Intrinsics.d(this.f132212b, d6Var.f132212b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132211a;
    }

    public final int hashCode() {
        int hashCode = this.f132211a.hashCode() * 31;
        String str = this.f132212b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132211a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132212b, ")");
    }
}
