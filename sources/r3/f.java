package r3;

import jk.r;
import s3.j1;
import s3.k0;
import s3.m;
import s3.n;
import u2.p;

/* loaded from: classes.dex */
public interface f extends h, m {
    default ig1.b F() {
        return b.f106069b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [r3.f, s3.m] */
    @Override // r3.h
    default Object c(i iVar) {
        j1 j1Var;
        p pVar = ((p) this).f120042a;
        boolean z13 = pVar.f120054m;
        if (!z13) {
            r.x("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z13) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        p pVar2 = pVar.f120046e;
        k0 U0 = com.bumptech.glide.c.U0(this);
        while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 32) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f120044c & 32) != 0) {
                        n nVar = pVar2;
                        ?? r43 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof f) {
                                f fVar = (f) nVar;
                                if (fVar.F().u(iVar)) {
                                    return fVar.F().J(iVar);
                                }
                            } else if ((nVar.f120044c & 32) != 0 && (nVar instanceof n)) {
                                p pVar3 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r43 = r43;
                                while (pVar3 != null) {
                                    if ((pVar3.f120044c & 32) != 0) {
                                        i13++;
                                        r43 = r43;
                                        if (i13 == 1) {
                                            nVar = pVar3;
                                        } else {
                                            if (r43 == 0) {
                                                r43 = new k2.e(new p[16]);
                                            }
                                            if (nVar != 0) {
                                                r43.b(nVar);
                                                nVar = 0;
                                            }
                                            r43.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f120047f;
                                    nVar = nVar;
                                    r43 = r43;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r43);
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        return iVar.f106070a.invoke();
    }
}
