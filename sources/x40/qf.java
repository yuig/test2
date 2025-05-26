package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qf implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133122a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133123b;

    public qf(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133122a = __typename;
        this.f133123b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133123b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return Intrinsics.d(this.f133122a, qfVar.f133122a) && Intrinsics.d(this.f133123b, qfVar.f133123b);
    }

    public final int hashCode() {
        int hashCode = this.f133122a.hashCode() * 31;
        Boolean bool = this.f133123b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133122a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133123b, ")");
    }
}
