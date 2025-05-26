package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132915b;

    public o0(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132914a = message;
        this.f132915b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132915b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f132914a, o0Var.f132914a) && Intrinsics.d(this.f132915b, o0Var.f132915b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132914a;
    }

    public final int hashCode() {
        int hashCode = this.f132914a.hashCode() * 31;
        String str = this.f132915b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132914a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132915b, ")");
    }
}
