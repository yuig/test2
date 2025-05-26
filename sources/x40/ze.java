package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ze implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133825a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133826b;

    public ze(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133825a = message;
        this.f133826b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133826b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        return Intrinsics.d(this.f133825a, zeVar.f133825a) && Intrinsics.d(this.f133826b, zeVar.f133826b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133825a;
    }

    public final int hashCode() {
        int hashCode = this.f133825a.hashCode() * 31;
        String str = this.f133826b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133825a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133826b, ")");
    }
}
