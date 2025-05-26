package m4;

import b3.s;
import b3.v0;
import b3.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f85784a;

    /* renamed from: b, reason: collision with root package name */
    public final float f85785b;

    public b(v0 v0Var, float f13) {
        this.f85784a = v0Var;
        this.f85785b = f13;
    }

    @Override // m4.o
    public final float a() {
        return this.f85785b;
    }

    @Override // m4.o
    public final long b() {
        int i13 = w.f21391o;
        return w.f21390n;
    }

    @Override // m4.o
    public final s c() {
        return this.f85784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85784a, bVar.f85784a) && Float.compare(this.f85785b, bVar.f85785b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f85785b) + (this.f85784a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BrushStyle(value=");
        sb3.append(this.f85784a);
        sb3.append(", alpha=");
        return d7.g.h(sb3, this.f85785b, ')');
    }
}
