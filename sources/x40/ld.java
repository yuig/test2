package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ld implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132752b;

    public ld(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132751a = message;
        this.f132752b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132752b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return false;
        }
        ld ldVar = (ld) obj;
        return Intrinsics.d(this.f132751a, ldVar.f132751a) && Intrinsics.d(this.f132752b, ldVar.f132752b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132751a;
    }

    public final int hashCode() {
        int hashCode = this.f132751a.hashCode() * 31;
        String str = this.f132752b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132751a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132752b, ")");
    }
}
