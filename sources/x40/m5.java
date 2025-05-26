package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m5 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132808b;

    public m5(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132807a = message;
        this.f132808b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132808b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return Intrinsics.d(this.f132807a, m5Var.f132807a) && Intrinsics.d(this.f132808b, m5Var.f132808b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132807a;
    }

    public final int hashCode() {
        int hashCode = this.f132807a.hashCode() * 31;
        String str = this.f132808b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132807a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132808b, ")");
    }
}
