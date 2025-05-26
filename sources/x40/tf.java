package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tf implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133383a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133384b;

    public tf(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133383a = __typename;
        this.f133384b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133384b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        return Intrinsics.d(this.f133383a, tfVar.f133383a) && Intrinsics.d(this.f133384b, tfVar.f133384b);
    }

    public final int hashCode() {
        int hashCode = this.f133383a.hashCode() * 31;
        Boolean bool = this.f133384b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133383a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133384b, ")");
    }
}
