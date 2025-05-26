package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lg implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132774a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132775b;

    public lg(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132774a = message;
        this.f132775b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132775b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg)) {
            return false;
        }
        lg lgVar = (lg) obj;
        return Intrinsics.d(this.f132774a, lgVar.f132774a) && Intrinsics.d(this.f132775b, lgVar.f132775b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132774a;
    }

    public final int hashCode() {
        int hashCode = this.f132774a.hashCode() * 31;
        String str = this.f132775b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132774a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132775b, ")");
    }
}
