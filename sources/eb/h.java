package eb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final db.b f58192a;

    /* renamed from: b, reason: collision with root package name */
    public final g f58193b;

    /* renamed from: c, reason: collision with root package name */
    public final e f58194c;

    public h(db.b bounds, g type, e state) {
        Intrinsics.checkNotNullParameter(bounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f58192a = bounds;
        this.f58193b = type;
        this.f58194c = state;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.b() == 0 && bounds.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
        if (bounds.f54260a != 0 && bounds.f54261b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
        }
    }

    public final boolean a() {
        g gVar = g.f58190c;
        g gVar2 = this.f58193b;
        if (Intrinsics.d(gVar2, gVar)) {
            return true;
        }
        if (Intrinsics.d(gVar2, g.f58189b)) {
            if (Intrinsics.d(this.f58194c, e.f58187c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(h.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        h hVar = (h) obj;
        return Intrinsics.d(this.f58192a, hVar.f58192a) && Intrinsics.d(this.f58193b, hVar.f58193b) && Intrinsics.d(this.f58194c, hVar.f58194c);
    }

    public final int hashCode() {
        return this.f58194c.hashCode() + ((this.f58193b.hashCode() + (this.f58192a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return h.class.getSimpleName() + " { " + this.f58192a + ", type=" + this.f58193b + ", state=" + this.f58194c + " }";
    }
}
