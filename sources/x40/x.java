package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133647a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133648b;

    public x(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133647a = message;
        this.f133648b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133648b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f133647a, xVar.f133647a) && Intrinsics.d(this.f133648b, xVar.f133648b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133647a;
    }

    public final int hashCode() {
        int hashCode = this.f133647a.hashCode() * 31;
        String str = this.f133648b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133647a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133648b, ")");
    }
}
