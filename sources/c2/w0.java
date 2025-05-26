package c2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: j, reason: collision with root package name */
    public static final w0 f25339j = new w0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final w0 f25340k = new w0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final w0 f25341l = new w0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final w0 f25342m = new w0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final w0 f25343n = new w0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final w0 f25344o = new w0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final w0 f25345p = new w0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final w0 f25346q = new w0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final w0 f25347r = new w0(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25348i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i13) {
        super(3);
        this.f25348i = i13;
    }

    public final j1.h0 b(j1.z1 z1Var, i2.o oVar) {
        switch (this.f25348i) {
            case 5:
                i2.s sVar = (i2.s) oVar;
                sVar.W(-32667848);
                j1.o2 r13 = j1.e.r(RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY, 0, null, 6);
                sVar.r(false);
                return r13;
            case 6:
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-611722692);
                j1.o2 r14 = j1.e.r(RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY, 0, null, 6);
                sVar2.r(false);
                return r14;
            case 7:
                i2.s sVar3 = (i2.s) oVar;
                sVar3.W(-130058045);
                j1.o2 r15 = j1.e.r(RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY, 0, null, 6);
                sVar3.r(false);
                return r15;
            default:
                i2.s sVar4 = (i2.s) oVar;
                sVar4.W(-1079955085);
                v2 v2Var = v2.Focused;
                v2 v2Var2 = v2.UnfocusedEmpty;
                j1.h0 r16 = z1Var.b(v2Var, v2Var2) ? j1.e.r(67, 0, j1.g0.f74072c, 2) : (z1Var.b(v2Var2, v2Var) || z1Var.b(v2.UnfocusedNotEmpty, v2Var2)) ? new j1.o2(83, 67, j1.g0.f74072c) : j1.e.q(0.0f, 0.0f, null, 7);
                sVar4.r(false);
                return r16;
        }
    }

    public final void e(i4 i4Var, i2.o oVar, int i13) {
        switch (this.f25348i) {
            case 2:
                if ((i13 & 6) == 0) {
                    i13 |= ((i2.s) oVar).h(i4Var) ? 4 : 2;
                }
                if ((i13 & 19) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                j1.g(i4Var, null, null, oVar, i13 & 14, 6);
                break;
            default:
                if ((i13 & 6) == 0) {
                    i13 |= ((i2.s) oVar).h(i4Var) ? 4 : 2;
                }
                if ((i13 & 19) == 18) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                j1.g(i4Var, null, null, oVar, i13 & 14, 6);
                break;
        }
    }

    public final void f(p1.f1 f1Var, i2.o oVar, int i13) {
        switch (this.f25348i) {
            case 0:
                if ((i13 & 17) == 16) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                break;
            default:
                if ((i13 & 17) == 16) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                break;
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f25348i) {
            case 0:
                f((p1.f1) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 1:
                f((p1.f1) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 2:
                e((i4) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 3:
                e((i4) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 4:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                i2.o oVar = (i2.o) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((i2.s) oVar).h(null) : ((i2.s) oVar).j(null) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                o4.a(null, false, null, 0L, 0L, 0L, 0.0f, oVar, intValue & 14, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
            case 5:
                ((Number) obj3).intValue();
                break;
            case 6:
                ((Number) obj3).intValue();
                break;
            case 7:
                ((Number) obj3).intValue();
                break;
            default:
                ((Number) obj3).intValue();
                break;
        }
        return b((j1.z1) obj, (i2.o) obj2);
    }
}
