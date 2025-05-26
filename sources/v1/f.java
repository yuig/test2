package v1;

import b3.j0;
import b3.m0;
import b3.x0;
import kl2.l;
import n4.k;

/* loaded from: classes2.dex */
public final class f implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f123826a;

    public f(l lVar) {
        this.f123826a = lVar;
    }

    @Override // b3.x0
    public final m0 a(long j13, k kVar, n4.b bVar) {
        b3.k h10 = androidx.compose.ui.graphics.a.h();
        this.f123826a.invoke(h10, new a3.f(j13), kVar);
        h10.c();
        return new j0(h10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return (fVar != null ? fVar.f123826a : null) == this.f123826a;
    }

    public final int hashCode() {
        return this.f123826a.hashCode();
    }
}
