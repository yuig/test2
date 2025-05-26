package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f21663a;

    public u0(String str) {
        this.f21663a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            return Intrinsics.d(this.f21663a, ((u0) obj).f21663a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21663a.hashCode();
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f21663a, ')');
    }
}
