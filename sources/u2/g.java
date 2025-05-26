package u2;

import a.cb;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f120032a;

    public g(float f13) {
        this.f120032a = f13;
    }

    public final int a(int i13, int i14, n4.k kVar) {
        float f13 = (i14 - i13) / 2.0f;
        n4.k kVar2 = n4.k.Ltr;
        float f14 = this.f120032a;
        if (kVar != kVar2) {
            f14 *= -1;
        }
        return cb.b(1, f14, f13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f120032a, ((g) obj).f120032a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f120032a);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("Horizontal(bias="), this.f120032a, ')');
    }
}
