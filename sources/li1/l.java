package li1;

import ao2.f0;
import ao2.j0;
import jc0.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import zy.d0;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f83563r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f83564s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f83565t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f83566u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f83567v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, p pVar, j0 j0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f83564s = mVar;
        this.f83565t = pVar;
        this.f83566u = j0Var;
        this.f83567v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f83564s, this.f83565t, this.f83566u, this.f83567v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f83563r;
        u50.r rVar = this.f83567v;
        j0 j0Var = this.f83566u;
        p pVar = this.f83565t;
        m mVar = this.f83564s;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                mVar.f83569b.d(new s(true, 0));
                f0 f0Var = mVar.f83573f;
                k kVar = new k(mVar, null);
                this.f83563r = 1;
                if (kotlin.jvm.internal.j.M(this, f0Var, kVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            gb2.f fVar = gb2.f.f64747a;
            gb2.f.c(new gb2.i(((o) pVar).f83576a, wa2.p.STATE_HIDDEN_WEIGHT_LOSS_AD, wa2.o.BOTH));
            ((d0) mVar.f83574g.getValue()).e(j0Var, m.j(mVar, (o) pVar, true), rVar);
        } catch (Throwable unused) {
            mVar.f83570c.h(nw.c.weight_loss_opt_out_error_toast_message);
            ((d0) mVar.f83574g.getValue()).e(j0Var, m.j(mVar, (o) pVar, false), rVar);
        }
        return Unit.f80348a;
    }
}
