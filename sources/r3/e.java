package r3;

import j1.q0;
import java.util.HashSet;
import jk.r;
import s3.a2;
import s3.k0;
import s3.n;
import t3.c0;
import u2.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a2 f106071a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.e f106072b = new k2.e(new s3.d[16]);

    /* renamed from: c, reason: collision with root package name */
    public final k2.e f106073c = new k2.e(new c[16]);

    /* renamed from: d, reason: collision with root package name */
    public final k2.e f106074d = new k2.e(new k0[16]);

    /* renamed from: e, reason: collision with root package name */
    public final k2.e f106075e = new k2.e(new c[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f106076f;

    public e(a2 a2Var) {
        this.f106071a = a2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(p pVar, c cVar, HashSet hashSet) {
        p pVar2 = pVar.f120042a;
        if (!pVar2.f120054m) {
            r.y("visitSubtreeIf called on an unattached node");
            throw null;
        }
        k2.e eVar = new k2.e(new p[16]);
        p pVar3 = pVar2.f120047f;
        if (pVar3 == null) {
            com.bumptech.glide.c.e(eVar, pVar2);
        } else {
            eVar.b(pVar3);
        }
        while (eVar.m()) {
            p pVar4 = (p) eVar.o(eVar.f78184c - 1);
            if ((pVar4.f120045d & 32) != 0) {
                for (p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f120047f) {
                    if ((pVar5.f120044c & 32) != 0) {
                        ?? r63 = 0;
                        n nVar = pVar5;
                        while (nVar != 0) {
                            if (nVar instanceof f) {
                                f fVar = (f) nVar;
                                if (fVar instanceof s3.d) {
                                    s3.d dVar = (s3.d) fVar;
                                    if ((dVar.f110754n instanceof d) && dVar.f110756p.contains(cVar)) {
                                        hashSet.add(fVar);
                                    }
                                }
                                if (!(!fVar.F().u(cVar))) {
                                    break;
                                }
                            } else if ((nVar.f120044c & 32) != 0 && (nVar instanceof n)) {
                                p pVar6 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r63 = r63;
                                while (pVar6 != null) {
                                    if ((pVar6.f120044c & 32) != 0) {
                                        i13++;
                                        r63 = r63;
                                        if (i13 == 1) {
                                            nVar = pVar6;
                                        } else {
                                            if (r63 == 0) {
                                                r63 = new k2.e(new p[16]);
                                            }
                                            if (nVar != 0) {
                                                r63.b(nVar);
                                                nVar = 0;
                                            }
                                            r63.b(pVar6);
                                        }
                                    }
                                    pVar6 = pVar6.f120047f;
                                    nVar = nVar;
                                    r63 = r63;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r63);
                        }
                    }
                }
            }
            com.bumptech.glide.c.e(eVar, pVar4);
        }
    }

    public final void a() {
        if (this.f106076f) {
            return;
        }
        this.f106076f = true;
        q0 q0Var = new q0(this, 22);
        k2.e eVar = ((c0) this.f106071a).f115900p0;
        if (eVar.i(q0Var)) {
            return;
        }
        eVar.b(q0Var);
    }
}
