package el;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f59515a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f59516b;

    public p0(Class cls, Class cls2) {
        this.f59515a = cls;
        this.f59516b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p0Var.f59515a.equals(this.f59515a) && p0Var.f59516b.equals(this.f59516b);
    }

    public final int hashCode() {
        return Objects.hash(this.f59515a, this.f59516b);
    }

    public final String toString() {
        return this.f59515a.getSimpleName() + " with primitive type: " + this.f59516b.getSimpleName();
    }
}
