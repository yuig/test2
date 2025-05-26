package ok;

import a.f2;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class u implements t, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f95444a;

    public u(f2 f2Var) {
        this.f95444a = f2Var;
    }

    @Override // ok.t
    public final Object apply(Object obj) {
        return this.f95444a;
    }

    @Override // ok.t
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return kh2.g0.m(this.f95444a, ((u) obj).f95444a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f95444a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + this.f95444a + ")";
    }
}
