package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21710a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21711b;

    public h(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f21710a = message;
        this.f21711b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f21711b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f21710a, hVar.f21710a) && Intrinsics.d(this.f21711b, hVar.f21711b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f21710a;
    }

    public final int hashCode() {
        int hashCode = this.f21710a.hashCode() * 31;
        String str = this.f21711b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f21710a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f21711b, ")");
    }
}
