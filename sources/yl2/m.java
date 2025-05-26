package yl2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final l f139378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139379b;

    public m(l kind, int i13) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f139378a = kind;
        this.f139379b = i13;
    }

    public final l a() {
        return this.f139378a;
    }

    public final int b() {
        return this.f139379b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f139378a, mVar.f139378a) && this.f139379b == mVar.f139379b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139379b) + (this.f139378a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("KindWithArity(kind=");
        sb3.append(this.f139378a);
        sb3.append(", arity=");
        return cb.l(sb3, this.f139379b, ')');
    }
}
