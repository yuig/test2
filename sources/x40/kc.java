package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kc implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132675b;

    public kc(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132674a = message;
        this.f132675b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132675b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj;
        return Intrinsics.d(this.f132674a, kcVar.f132674a) && Intrinsics.d(this.f132675b, kcVar.f132675b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132674a;
    }

    public final int hashCode() {
        int hashCode = this.f132674a.hashCode() * 31;
        String str = this.f132675b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132674a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132675b, ")");
    }
}
