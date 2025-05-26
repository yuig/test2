package q3;

import kotlin.jvm.internal.Intrinsics;
import s3.i2;
import s3.j2;

/* loaded from: classes2.dex */
public final class k0 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f102226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102227b;

    public k0(l0 l0Var, Object obj) {
        this.f102226a = l0Var;
        this.f102227b = obj;
    }

    @Override // q3.l1
    public final int a() {
        s3.k0 k0Var = (s3.k0) this.f102226a.f102239j.get(this.f102227b);
        if (k0Var != null) {
            return k0Var.o().size();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.foundation.lazy.layout.z0] */
    /* JADX WARN: Type inference failed for: r7v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // q3.l1
    public final void b(androidx.compose.foundation.lazy.layout.z0 z0Var) {
        s3.j1 j1Var;
        u2.p pVar;
        s3.k0 k0Var = (s3.k0) this.f102226a.f102239j.get(this.f102227b);
        if (k0Var == null || (j1Var = k0Var.f110837y) == null || (pVar = j1Var.f110808e) == null) {
            return;
        }
        u2.p pVar2 = pVar.f120042a;
        if (!pVar2.f120054m) {
            jk.r.y("visitSubtreeIf called on an unattached node");
            throw null;
        }
        k2.e eVar = new k2.e(new u2.p[16]);
        u2.p pVar3 = pVar2.f120047f;
        if (pVar3 == null) {
            com.bumptech.glide.c.e(eVar, pVar2);
        } else {
            eVar.b(pVar3);
        }
        while (eVar.m()) {
            u2.p pVar4 = (u2.p) eVar.o(eVar.f78184c - 1);
            if ((pVar4.f120045d & 262144) != 0) {
                for (u2.p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f120047f) {
                    if ((pVar5.f120044c & 262144) != 0) {
                        ?? r83 = 0;
                        s3.n nVar = pVar5;
                        while (nVar != 0) {
                            if (nVar instanceof j2) {
                                j2 j2Var = (j2) nVar;
                                i2 i2Var = Intrinsics.d("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", j2Var.l()) ? (i2) z0Var.invoke(j2Var) : i2.ContinueTraversal;
                                if (i2Var == i2.CancelTraversal) {
                                    return;
                                }
                                if (i2Var == i2.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((nVar.f120044c & 262144) != 0 && (nVar instanceof s3.n)) {
                                u2.p pVar6 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r83 = r83;
                                while (pVar6 != null) {
                                    if ((pVar6.f120044c & 262144) != 0) {
                                        i13++;
                                        r83 = r83;
                                        if (i13 == 1) {
                                            nVar = pVar6;
                                        } else {
                                            if (r83 == 0) {
                                                r83 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r83.b(nVar);
                                                nVar = 0;
                                            }
                                            r83.b(pVar6);
                                        }
                                    }
                                    pVar6 = pVar6.f120047f;
                                    nVar = nVar;
                                    r83 = r83;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r83);
                        }
                    }
                }
            }
            com.bumptech.glide.c.e(eVar, pVar4);
        }
    }

    @Override // q3.l1
    public final void c(int i13, long j13) {
        l0 l0Var = this.f102226a;
        s3.k0 k0Var = (s3.k0) l0Var.f102239j.get(this.f102227b);
        if (k0Var == null || !k0Var.G()) {
            return;
        }
        int size = k0Var.o().size();
        if (i13 < 0 || i13 >= size) {
            throw new IndexOutOfBoundsException("Index (" + i13 + ") is out of bound of [0, " + size + ')');
        }
        if (!(!k0Var.H())) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
        }
        s3.k0 k0Var2 = l0Var.f102230a;
        k0Var2.f110824l = true;
        ((t3.c0) s3.n0.a(k0Var)).v((s3.k0) k0Var.o().get(i13), j13);
        k0Var2.f110824l = false;
    }

    @Override // q3.l1
    public final void dispose() {
        l0 l0Var = this.f102226a;
        l0Var.h();
        s3.k0 k0Var = (s3.k0) l0Var.f102239j.remove(this.f102227b);
        if (k0Var != null) {
            if (l0Var.f102244o <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose".toString());
            }
            int indexOf = l0Var.f102230a.q().indexOf(k0Var);
            int size = l0Var.f102230a.q().size();
            int i13 = l0Var.f102244o;
            if (indexOf < size - i13) {
                throw new IllegalStateException("Item is not in pre-composed item range".toString());
            }
            l0Var.f102243n++;
            l0Var.f102244o = i13 - 1;
            int size2 = (l0Var.f102230a.q().size() - l0Var.f102244o) - l0Var.f102243n;
            l0Var.j(indexOf, size2, 1);
            l0Var.f(size2);
        }
    }
}
