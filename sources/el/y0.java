package el;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f59556a;

    /* renamed from: b, reason: collision with root package name */
    public final ml.a f59557b;

    public y0(Class cls, ml.a aVar) {
        this.f59556a = cls;
        this.f59557b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return y0Var.f59556a.equals(this.f59556a) && y0Var.f59557b.equals(this.f59557b);
    }

    public final int hashCode() {
        return Objects.hash(this.f59556a, this.f59557b);
    }

    public final String toString() {
        return this.f59556a.getSimpleName() + ", object identifier: " + this.f59557b;
    }
}
