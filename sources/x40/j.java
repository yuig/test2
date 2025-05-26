package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132582b;

    public j(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132581a = message;
        this.f132582b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132582b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f132581a, jVar.f132581a) && Intrinsics.d(this.f132582b, jVar.f132582b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132581a;
    }

    public final int hashCode() {
        int hashCode = this.f132581a.hashCode() * 31;
        String str = this.f132582b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132581a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132582b, ")");
    }
}
