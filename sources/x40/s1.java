package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133222a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133223b;

    public s1(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133222a = __typename;
        this.f133223b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133223b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Intrinsics.d(this.f133222a, s1Var.f133222a) && Intrinsics.d(this.f133223b, s1Var.f133223b);
    }

    public final int hashCode() {
        int hashCode = this.f133222a.hashCode() * 31;
        Boolean bool = this.f133223b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133222a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133223b, ")");
    }
}
