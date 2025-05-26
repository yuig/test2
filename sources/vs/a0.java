package vs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f126468a;

    public a0(String info2) {
        Intrinsics.checkNotNullParameter(info2, "info");
        this.f126468a = info2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f126468a, ((a0) obj).f126468a);
    }

    public final int hashCode() {
        return this.f126468a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CopyDebugInfo(info="), this.f126468a, ")");
    }
}
