package a2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f422a;

    /* renamed from: b, reason: collision with root package name */
    public b4.g f423b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f424c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f425d = null;

    public f(b4.g gVar, b4.g gVar2) {
        this.f422a = gVar;
        this.f423b = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f422a, fVar.f422a) && Intrinsics.d(this.f423b, fVar.f423b) && this.f424c == fVar.f424c && Intrinsics.d(this.f425d, fVar.f425d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f424c, (this.f423b.hashCode() + (this.f422a.hashCode() * 31)) * 31, 31);
        d dVar = this.f425d;
        return e13 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f422a) + ", substitution=" + ((Object) this.f423b) + ", isShowingSubstitution=" + this.f424c + ", layoutCache=" + this.f425d + ')';
    }
}
