package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f136762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136763b;

    public q(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f136762a = message;
        this.f136763b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f136763b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f136762a, qVar.f136762a) && Intrinsics.d(this.f136763b, qVar.f136763b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f136762a;
    }

    public final int hashCode() {
        int hashCode = this.f136762a.hashCode() * 31;
        String str = this.f136763b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f136762a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f136763b, ")");
    }
}
