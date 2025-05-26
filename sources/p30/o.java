package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f98747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98748b;

    public o(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f98747a = message;
        this.f98748b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f98748b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f98747a, oVar.f98747a) && Intrinsics.d(this.f98748b, oVar.f98748b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f98747a;
    }

    public final int hashCode() {
        int hashCode = this.f98747a.hashCode() * 31;
        String str = this.f98748b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f98747a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f98748b, ")");
    }
}
