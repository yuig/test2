package s3;

import i2.w3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t3.e4;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j */
    public static final h f110778j = new h(0);

    /* renamed from: k */
    public static final h f110779k = new h(3);

    /* renamed from: l */
    public static final h f110780l = new h(4);

    /* renamed from: m */
    public static final h f110781m = new h(5);

    /* renamed from: i */
    public final /* synthetic */ int f110782i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(2);
        this.f110782i = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f110782i) {
            case 0:
                ((Number) obj2).intValue();
                ((k) obj).getClass();
                break;
            case 1:
                ((k0) ((k) obj)).b0((n4.b) obj2);
                break;
            case 2:
                ((k0) ((k) obj)).c0((n4.k) obj2);
                break;
            case 3:
                ((k0) ((k) obj)).e0((q3.p0) obj2);
                break;
            case 4:
                ((k0) ((k) obj)).f0((u2.q) obj2);
                break;
            case 5:
                i2.d0 d0Var = (i2.d0) obj2;
                k0 k0Var = (k0) ((k) obj);
                k0Var.f110833u = d0Var;
                w3 w3Var = t3.f2.f115983f;
                q2.l lVar = (q2.l) d0Var;
                lVar.getClass();
                k0Var.b0((n4.b) bf.b.Y(lVar, w3Var));
                k0Var.c0((n4.k) bf.b.Y(lVar, t3.f2.f115989l));
                k0Var.g0((e4) bf.b.Y(lVar, t3.f2.f115994q));
                u2.p pVar = k0Var.f110837y.f110808e;
                if ((pVar.f120045d & 32768) != 0) {
                    while (pVar != null) {
                        if ((pVar.f120044c & 32768) != 0) {
                            n nVar = pVar;
                            ?? r23 = 0;
                            while (nVar != 0) {
                                if (nVar instanceof l) {
                                    u2.p pVar2 = ((u2.p) ((l) nVar)).f120042a;
                                    if (pVar2.f120054m) {
                                        r1.d(pVar2);
                                    } else {
                                        pVar2.f120051j = true;
                                    }
                                } else if ((nVar.f120044c & 32768) != 0 && (nVar instanceof n)) {
                                    u2.p pVar3 = nVar.f110843o;
                                    int i13 = 0;
                                    nVar = nVar;
                                    r23 = r23;
                                    while (pVar3 != null) {
                                        if ((pVar3.f120044c & 32768) != 0) {
                                            i13++;
                                            r23 = r23;
                                            if (i13 == 1) {
                                                nVar = pVar3;
                                            } else {
                                                if (r23 == 0) {
                                                    r23 = new k2.e(new u2.p[16]);
                                                }
                                                if (nVar != 0) {
                                                    r23.b(nVar);
                                                    nVar = 0;
                                                }
                                                r23.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f120047f;
                                        nVar = nVar;
                                        r23 = r23;
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                nVar = com.bumptech.glide.c.g(r23);
                            }
                        }
                        if ((pVar.f120045d & 32768) != 0) {
                            pVar = pVar.f120047f;
                        }
                    }
                }
                break;
            default:
                ((k0) ((k) obj)).g0((e4) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
