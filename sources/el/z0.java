package el;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f59558a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f59559b;

    public z0(Class cls, Class cls2) {
        this.f59558a = cls;
        this.f59559b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return z0Var.f59558a.equals(this.f59558a) && z0Var.f59559b.equals(this.f59559b);
    }

    public final int hashCode() {
        return Objects.hash(this.f59558a, this.f59559b);
    }

    public final String toString() {
        return this.f59558a.getSimpleName() + " with serialization type: " + this.f59559b.getSimpleName();
    }
}
