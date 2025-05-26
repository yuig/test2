package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y6 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133727b;

    public y6(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133726a = message;
        this.f133727b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133727b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return Intrinsics.d(this.f133726a, y6Var.f133726a) && Intrinsics.d(this.f133727b, y6Var.f133727b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133726a;
    }

    public final int hashCode() {
        int hashCode = this.f133726a.hashCode() * 31;
        String str = this.f133727b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133726a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133727b, ")");
    }
}
