package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k6 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132665a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132666b;

    public k6(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132665a = message;
        this.f132666b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132666b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return Intrinsics.d(this.f132665a, k6Var.f132665a) && Intrinsics.d(this.f132666b, k6Var.f132666b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132665a;
    }

    public final int hashCode() {
        int hashCode = this.f132665a.hashCode() * 31;
        String str = this.f132666b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132665a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132666b, ")");
    }
}
