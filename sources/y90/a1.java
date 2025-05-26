package y90;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138125i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f138126j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f138127k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i13, Object obj, Object obj2) {
        super(0);
        this.f138125i = i13;
        this.f138126j = obj;
        this.f138127k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        androidx.lifecycle.k kVar;
        int i13 = this.f138125i;
        Object obj = this.f138126j;
        Object obj2 = this.f138127k;
        switch (i13) {
            case 0:
                m290invoke();
                break;
            case 1:
                Function0 function0 = (Function0) obj;
                if (function0 == null || (r0 = (u6.c) function0.invoke()) == null) {
                    androidx.lifecycle.u1 u1Var = (androidx.lifecycle.u1) ((xk2.k) obj2).getValue();
                    kVar = u1Var instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var : null;
                    if (kVar == null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                androidx.lifecycle.u1 u1Var2 = (androidx.lifecycle.u1) ((xk2.k) obj2).getValue();
                kVar = u1Var2 instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) u1Var2 : null;
                if (kVar == null || (r0 = kVar.getDefaultViewModelProviderFactory()) == null) {
                    androidx.lifecycle.p1 defaultViewModelProviderFactory = ((Fragment) obj).getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    break;
                }
                break;
            case 3:
                m290invoke();
                break;
            default:
                m290invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m290invoke() {
        int i13 = this.f138125i;
        Object obj = this.f138127k;
        Object obj2 = this.f138126j;
        switch (i13) {
            case 0:
                x xVar = ((d1) obj2).f138167e;
                if (xVar != null) {
                    m62.a model = ((b1) obj).f138133v;
                    if (model != null) {
                        Intrinsics.checkNotNullParameter(model, "model");
                        p pVar = new p(new m62.h0(model));
                        int i14 = d0.f138146w0;
                        xVar.f138265a.a8(pVar);
                        return;
                    }
                    Intrinsics.r("item");
                    throw null;
                }
                return;
            case 3:
                o1 o1Var = ((p1) obj2).f138218g;
                m62.i iVar = ((l1) obj).f138201v;
                if (iVar == null) {
                    Intrinsics.r("item");
                    throw null;
                }
                o1Var.g(iVar);
                return;
            default:
                a2 a2Var = ((c2) obj2).f138141e;
                m62.k1 k1Var = ((b2) obj).f138135v;
                if (k1Var == null) {
                    Intrinsics.r("item");
                    throw null;
                }
                a2Var.i(k1Var);
                return;
        }
    }
}
