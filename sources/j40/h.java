package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74606b;

    public h(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f74605a = message;
        this.f74606b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f74606b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f74605a, hVar.f74605a) && Intrinsics.d(this.f74606b, hVar.f74606b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f74605a;
    }

    public final int hashCode() {
        int hashCode = this.f74605a.hashCode() * 31;
        String str = this.f74606b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f74605a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f74606b, ")");
    }
}
