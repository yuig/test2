package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74611b;

    public m(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f74610a = message;
        this.f74611b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f74611b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f74610a, mVar.f74610a) && Intrinsics.d(this.f74611b, mVar.f74611b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f74610a;
    }

    public final int hashCode() {
        int hashCode = this.f74610a.hashCode() * 31;
        String str = this.f74611b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f74610a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f74611b, ")");
    }
}
