package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gg implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132455b;

    public gg(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132454a = message;
        this.f132455b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132455b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj;
        return Intrinsics.d(this.f132454a, ggVar.f132454a) && Intrinsics.d(this.f132455b, ggVar.f132455b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132454a;
    }

    public final int hashCode() {
        int hashCode = this.f132454a.hashCode() * 31;
        String str = this.f132455b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132454a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132455b, ")");
    }
}
