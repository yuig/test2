package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f111028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111029b;

    public d(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f111028a = message;
        this.f111029b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f111029b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f111028a, dVar.f111028a) && Intrinsics.d(this.f111029b, dVar.f111029b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f111028a;
    }

    public final int hashCode() {
        int hashCode = this.f111028a.hashCode() * 31;
        String str = this.f111029b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f111028a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f111029b, ")");
    }
}
