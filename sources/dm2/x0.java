package dm2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.q1;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0 f55540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ am2.f f55541j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, am2.f fVar) {
        super(0);
        this.f55540i = y0Var;
        this.f55541j = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y0 y0Var = this.f55540i;
        on2.u uVar = y0Var.E;
        am2.f fVar = this.f55541j;
        bm2.i annotations = ((bm2.b) fVar).getAnnotations();
        z zVar = (z) this.f55541j;
        am2.c c13 = zVar.c();
        Intrinsics.checkNotNullExpressionValue(c13, "getKind(...)");
        Object obj = y0Var.F;
        am2.w0 b13 = ((p) obj).b();
        Intrinsics.checkNotNullExpressionValue(b13, "getSource(...)");
        y0 y0Var2 = new y0(uVar, y0Var.F, fVar, y0Var, annotations, c13, b13);
        y0.H.getClass();
        nn2.u uVar2 = (nn2.u) obj;
        q1 d2 = uVar2.r0() == null ? null : q1.d(uVar2.u0());
        if (d2 == null) {
            return null;
        }
        d dVar = zVar.f55571j;
        d d13 = dVar != null ? dVar.d(d2) : null;
        List i03 = zVar.i0();
        Intrinsics.checkNotNullExpressionValue(i03, "getContextReceiverParameters(...)");
        List list = i03;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).d(d2));
        }
        g gVar = (g) obj;
        List k13 = gVar.k();
        List x13 = y0Var.x();
        pn2.b0 b0Var = y0Var.f55568g;
        Intrinsics.f(b0Var);
        y0Var2.y0(null, d13, arrayList, k13, x13, b0Var, am2.c0.FINAL, gVar.f55419f);
        return y0Var2;
    }
}
