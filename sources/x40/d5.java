package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d5 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132209a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132210b;

    public d5(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132209a = message;
        this.f132210b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132210b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return Intrinsics.d(this.f132209a, d5Var.f132209a) && Intrinsics.d(this.f132210b, d5Var.f132210b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132209a;
    }

    public final int hashCode() {
        int hashCode = this.f132209a.hashCode() * 31;
        String str = this.f132210b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132209a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132210b, ")");
    }
}
