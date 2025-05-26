package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s6 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133240b;

    public s6(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133239a = message;
        this.f133240b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133240b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return Intrinsics.d(this.f133239a, s6Var.f133239a) && Intrinsics.d(this.f133240b, s6Var.f133240b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133239a;
    }

    public final int hashCode() {
        int hashCode = this.f133239a.hashCode() * 31;
        String str = this.f133240b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133239a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133240b, ")");
    }
}
