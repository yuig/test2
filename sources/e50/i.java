package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f57362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57363b;

    public i(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f57362a = message;
        this.f57363b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f57363b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f57362a, iVar.f57362a) && Intrinsics.d(this.f57363b, iVar.f57363b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f57362a;
    }

    public final int hashCode() {
        int hashCode = this.f57362a.hashCode() * 31;
        String str = this.f57363b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f57362a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f57363b, ")");
    }
}
