package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rd implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133188b;

    public rd(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133187a = message;
        this.f133188b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133188b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return Intrinsics.d(this.f133187a, rdVar.f133187a) && Intrinsics.d(this.f133188b, rdVar.f133188b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133187a;
    }

    public final int hashCode() {
        int hashCode = this.f133187a.hashCode() * 31;
        String str = this.f133188b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133187a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133188b, ")");
    }
}
