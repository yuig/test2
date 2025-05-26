package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133130b;

    public r(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133129a = message;
        this.f133130b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133130b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f133129a, rVar.f133129a) && Intrinsics.d(this.f133130b, rVar.f133130b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133129a;
    }

    public final int hashCode() {
        int hashCode = this.f133129a.hashCode() * 31;
        String str = this.f133130b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133129a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133130b, ")");
    }
}
