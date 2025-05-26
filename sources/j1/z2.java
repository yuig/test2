package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final t f74340a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f74341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74342c;

    public z2(t tVar, c0 c0Var, int i13) {
        this.f74340a = tVar;
        this.f74341b = c0Var;
        this.f74342c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return Intrinsics.d(this.f74340a, z2Var.f74340a) && Intrinsics.d(this.f74341b, z2Var.f74341b) && this.f74342c == z2Var.f74342c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f74342c) + ((this.f74341b.hashCode() + (this.f74340a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f74340a + ", easing=" + this.f74341b + ", arcMode=" + ((Object) ("ArcMode(value=" + this.f74342c + ')')) + ')';
    }
}
