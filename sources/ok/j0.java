package ok;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j0 implements g0, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f95434a;

    public j0(Object obj) {
        this.f95434a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return kh2.g0.m(this.f95434a, ((j0) obj).f95434a);
        }
        return false;
    }

    @Override // ok.g0
    public final Object get() {
        return this.f95434a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f95434a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f95434a + ")";
    }
}
