package w31;

import rm1.q;
import u32.f;
import u50.k0;
import x31.r;

/* loaded from: classes5.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f127916a = new b();

    @Override // x31.a
    public final r a() {
        return e.Favorites;
    }

    @Override // w31.c
    public final f b() {
        return f.FAVORITED;
    }

    @Override // x31.a
    public final k0 d() {
        return bs1.c.j2(new String[0], oz1.e.filter_favorites);
    }

    @Override // x31.a
    public final q e() {
        return q.STAR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -595164432;
    }

    public final String toString() {
        return "Favorites";
    }
}
