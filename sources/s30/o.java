package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f111047a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111048b;

    public o(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f111047a = message;
        this.f111048b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f111048b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f111047a, oVar.f111047a) && Intrinsics.d(this.f111048b, oVar.f111048b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f111047a;
    }

    public final int hashCode() {
        int hashCode = this.f111047a.hashCode() * 31;
        String str = this.f111048b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f111047a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f111048b, ")");
    }
}
