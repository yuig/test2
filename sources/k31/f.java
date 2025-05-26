package k31;

import a.cb;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f78245a = 88;

    /* renamed from: b, reason: collision with root package name */
    public final float f78246b = 0.6666667f;

    /* renamed from: c, reason: collision with root package name */
    public final float f78247c = 14;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n4.e.a(this.f78245a, fVar.f78245a) && Float.compare(this.f78246b, fVar.f78246b) == 0 && n4.e.a(this.f78247c, fVar.f78247c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f78247c) + a.a.a(this.f78246b, Float.hashCode(this.f78245a) * 31, 31);
    }

    public final String toString() {
        String b13 = n4.e.b(this.f78245a);
        String b14 = n4.e.b(this.f78247c);
        StringBuilder o13 = cb.o("IdeaPreviewDisplayStyle(width=", b13, ", aspectRatio=");
        o13.append(this.f78246b);
        o13.append(", cornerRadius=");
        o13.append(b14);
        o13.append(")");
        return o13.toString();
    }
}
