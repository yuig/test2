package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132422a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132423b;

    public g0(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132422a = message;
        this.f132423b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132423b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f132422a, g0Var.f132422a) && Intrinsics.d(this.f132423b, g0Var.f132423b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132422a;
    }

    public final int hashCode() {
        int hashCode = this.f132422a.hashCode() * 31;
        String str = this.f132423b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132422a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132423b, ")");
    }
}
