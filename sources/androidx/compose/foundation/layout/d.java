package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import p1.u;
import u2.q;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final n4.b f17180a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17181b;

    public d(n4.b bVar, long j13) {
        this.f17180a = bVar;
        this.f17181b = j13;
    }

    @Override // p1.u
    public final q a(q qVar, u2.e eVar) {
        return qVar.j(new BoxChildDataElement(eVar, false));
    }

    @Override // p1.u
    public final q b(q qVar) {
        return qVar.j(new BoxChildDataElement(u2.b.f120017e, true));
    }

    public final float c() {
        long j13 = this.f17181b;
        if (!n4.a.c(j13)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f17180a.f0(n4.a.g(j13));
    }

    public final float d() {
        long j13 = this.f17181b;
        if (!n4.a.d(j13)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f17180a.f0(n4.a.h(j13));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f17180a, dVar.f17180a) && n4.a.b(this.f17181b, dVar.f17181b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f17181b) + (this.f17180a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f17180a + ", constraints=" + ((Object) n4.a.k(this.f17181b)) + ')';
    }
}
