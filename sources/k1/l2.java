package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class l2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f77923i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ql2.h f77924j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f77925k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(float f13, ql2.g gVar, int i13) {
        super(1);
        this.f77923i = f13;
        this.f77924j = gVar;
        this.f77925k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float valueOf = Float.valueOf(this.f77923i);
        ql2.h hVar = this.f77924j;
        z3.f fVar = new z3.f(((Number) ql2.s.k(valueOf, hVar)).floatValue(), hVar, this.f77925k);
        rl2.u[] uVarArr = z3.w.f140760a;
        z3.x xVar = z3.t.f140735d;
        rl2.u uVar = z3.w.f140760a[1];
        xVar.a((z3.y) obj, fVar);
        return Unit.f80348a;
    }
}
