package s3;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final k2.e f110998a = new k2.e(new k0[16]);

    /* renamed from: b, reason: collision with root package name */
    public k0[] f110999b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static void a(k0 k0Var) {
        v0 v0Var = k0Var.f110838z;
        int i13 = 0;
        if (v0Var.f110969c == g0.Idle && !v0Var.f110971e && !v0Var.f110970d && !k0Var.I && k0Var.H()) {
            u2.p pVar = k0Var.f110837y.f110808e;
            if ((pVar.f120045d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
                while (pVar != null) {
                    if ((pVar.f120044c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
                        n nVar = pVar;
                        ?? r63 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof s) {
                                s sVar = (s) nVar;
                                sVar.E(com.bumptech.glide.c.S0(sVar, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
                            } else if ((nVar.f120044c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 && (nVar instanceof n)) {
                                u2.p pVar2 = nVar.f110843o;
                                int i14 = 0;
                                nVar = nVar;
                                r63 = r63;
                                while (pVar2 != null) {
                                    if ((pVar2.f120044c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
                                        i14++;
                                        r63 = r63;
                                        if (i14 == 1) {
                                            nVar = pVar2;
                                        } else {
                                            if (r63 == 0) {
                                                r63 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r63.b(nVar);
                                                nVar = 0;
                                            }
                                            r63.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f120047f;
                                    nVar = nVar;
                                    r63 = r63;
                                }
                                if (i14 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r63);
                        }
                    }
                    if ((pVar.f120045d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0) {
                        break;
                    } else {
                        pVar = pVar.f120047f;
                    }
                }
            }
        }
        k0Var.H = false;
        k2.e y13 = k0Var.y();
        int i15 = y13.f78184c;
        if (i15 > 0) {
            Object[] objArr = y13.f78182a;
            do {
                a((k0) objArr[i13]);
                i13++;
            } while (i13 < i15);
        }
    }

    public final void b(k0 k0Var) {
        k2.e eVar = this.f110998a;
        eVar.h();
        eVar.b(k0Var);
        k0Var.H = true;
    }
}
