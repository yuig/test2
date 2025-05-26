package u2;

import a.cb;

/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f120033a;

    public h(float f13) {
        this.f120033a = f13;
    }

    public final int a(int i13, int i14) {
        return cb.b(1, this.f120033a, (i14 - i13) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f120033a, ((h) obj).f120033a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f120033a);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("Vertical(bias="), this.f120033a, ')');
    }
}
