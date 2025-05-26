package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f21598a;

    public j(l0 l0Var) {
        this.f21598a = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        l0 l0Var = this.f21598a;
        j jVar = (j) obj;
        if (!Intrinsics.d(l0Var.f21603a, jVar.f21598a.f21603a)) {
            return false;
        }
        if (!l0Var.f21604b.d(jVar.f21598a.f21604b)) {
            return false;
        }
        if (!Intrinsics.d(l0Var.f21605c, jVar.f21598a.f21605c)) {
            return false;
        }
        l0 l0Var2 = jVar.f21598a;
        if (l0Var.f21606d != l0Var2.f21606d) {
            return false;
        }
        if (l0Var.f21607e != l0Var2.f21607e) {
            return false;
        }
        if (!kh2.s0.B(l0Var.f21608f, l0Var2.f21608f)) {
            return false;
        }
        if (!Intrinsics.d(l0Var.f21609g, jVar.f21598a.f21609g)) {
            return false;
        }
        l0 l0Var3 = jVar.f21598a;
        if (l0Var.f21610h != l0Var3.f21610h) {
            return false;
        }
        if (l0Var.f21611i != l0Var3.f21611i) {
            return false;
        }
        long j13 = l0Var.f21612j;
        return n4.a.h(j13) == n4.a.h(jVar.f21598a.f21612j) && n4.a.g(j13) == n4.a.g(jVar.f21598a.f21612j);
    }

    public final int hashCode() {
        l0 l0Var = this.f21598a;
        int hashCode = l0Var.f21603a.hashCode() * 31;
        q0 q0Var = l0Var.f21604b;
        g0 g0Var = q0Var.f21648a;
        g0Var.getClass();
        n4.n[] nVarArr = n4.m.f89188b;
        int hashCode2 = Long.hashCode(g0Var.f21576b) * 31;
        g4.l lVar = g0Var.f21577c;
        int i13 = (hashCode2 + (lVar != null ? lVar.f63474a : 0)) * 31;
        g4.j jVar = g0Var.f21578d;
        int hashCode3 = (i13 + (jVar != null ? Integer.hashCode(jVar.f63465a) : 0)) * 31;
        g4.k kVar = g0Var.f21579e;
        int hashCode4 = (hashCode3 + (kVar != null ? Integer.hashCode(kVar.f63466a) : 0)) * 31;
        g4.e eVar = g0Var.f21580f;
        int hashCode5 = (hashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = g0Var.f21581g;
        int c13 = a.a.c(g0Var.f21582h, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        m4.a aVar = g0Var.f21583i;
        int hashCode6 = (c13 + (aVar != null ? Float.hashCode(aVar.f85783a) : 0)) * 31;
        m4.p pVar = g0Var.f21584j;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        i4.c cVar = g0Var.f21585k;
        int hashCode8 = (hashCode7 + (cVar != null ? cVar.f71504a.hashCode() : 0)) * 31;
        int i14 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        int c14 = a.a.c(g0Var.f21586l, hashCode8, 31);
        y yVar = g0Var.f21589o;
        int hashCode9 = (q0Var.f21649b.hashCode() + ((c14 + (yVar != null ? yVar.hashCode() : 0)) * 31)) * 31;
        z zVar = q0Var.f21650c;
        int hashCode10 = (l0Var.f21611i.hashCode() + ((l0Var.f21610h.hashCode() + ((l0Var.f21609g.hashCode() + ep.b.b(l0Var.f21608f, ep.b.e(l0Var.f21607e, (ep.b.c(l0Var.f21605c, (hashCode9 + (zVar != null ? zVar.hashCode() : 0) + hashCode) * 31, 31) + l0Var.f21606d) * 31, 31), 31)) * 31)) * 31)) * 31;
        long j13 = l0Var.f21612j;
        return Integer.hashCode(n4.a.g(j13)) + ((Integer.hashCode(n4.a.h(j13)) + hashCode10) * 31);
    }
}
