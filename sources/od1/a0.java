package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final pd1.f f94107a;

    public a0(pd1.f fVar) {
        this.f94107a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f94107a, ((a0) obj).f94107a);
    }

    public final int hashCode() {
        pd1.f fVar = this.f94107a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "OneBarModuleSideEffectRequest(args=" + this.f94107a + ")";
    }
}
