package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n9 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132881b;

    public n9(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132880a = message;
        this.f132881b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132881b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return Intrinsics.d(this.f132880a, n9Var.f132880a) && Intrinsics.d(this.f132881b, n9Var.f132881b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132880a;
    }

    public final int hashCode() {
        int hashCode = this.f132880a.hashCode() * 31;
        String str = this.f132881b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132880a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132881b, ")");
    }
}
