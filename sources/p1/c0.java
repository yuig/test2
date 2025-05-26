package p1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 extends d {

    /* renamed from: c, reason: collision with root package name */
    public final u2.c f98490c;

    public c0(u2.c cVar) {
        this.f98490c = cVar;
    }

    @Override // p1.d
    public final int e(int i13, n4.k kVar) {
        return ((u2.g) this.f98490c).a(0, i13, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f98490c, ((c0) obj).f98490c);
    }

    public final int hashCode() {
        return Float.hashCode(((u2.g) this.f98490c).f120032a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f98490c + ')';
    }
}
