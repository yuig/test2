package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: classes4.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55997r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55998s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ co2.b0 f55999t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.j0 j0Var, co2.b0 b0Var, bl2.c cVar) {
        super(2, cVar);
        this.f55998s = j0Var;
        this.f55999t = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x xVar = new x(this.f55998s, this.f55999t, cVar);
        xVar.f55997r = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create(new co2.t(((co2.t) obj).f28348a), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Object obj2 = ((co2.t) this.f55997r).f28348a;
        boolean z13 = obj2 instanceof co2.s;
        kotlin.jvm.internal.j0 j0Var = this.f55998s;
        if (!z13) {
            j0Var.f80434a = obj2;
        }
        if (z13) {
            Throwable a13 = co2.t.a(obj2);
            if (a13 != null) {
                throw a13;
            }
            this.f55999t.cancel(new ChildCancelledException());
            j0Var.f80434a = eo2.j0.f59785c;
        }
        return Unit.f80348a;
    }
}
