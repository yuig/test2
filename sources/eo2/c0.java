package eo2;

import ao2.p1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes4.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public p1 f59742r;

    /* renamed from: s, reason: collision with root package name */
    public int f59743s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f59744t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ do2.i f59745u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ do2.i f59746v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ do2.j f59747w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kl2.l f59748x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(do2.i iVar, do2.i iVar2, do2.j jVar, kl2.l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f59745u = iVar;
        this.f59746v = iVar2;
        this.f59747w = jVar;
        this.f59748x = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c0 c0Var = new c0(this.f59745u, this.f59746v, this.f59747w, this.f59748x, cVar);
        c0Var.f59744t = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        co2.b0 b0Var;
        p1 p1Var;
        CoroutineContext plus;
        Unit unit;
        z zVar;
        CancellationException cancellationException;
        CancellationException cancellationException2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59743s;
        try {
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p1Var = this.f59742r;
                b0Var = (co2.b0) this.f59744t;
                try {
                    ue.c.H(obj);
                    cancellationException2 = null;
                } catch (AbortFlowException e13) {
                    e = e13;
                } catch (Throwable th3) {
                    th = th3;
                    cancellationException = null;
                    b0Var.cancel(cancellationException);
                    throw th;
                }
                b0Var.cancel(cancellationException2);
                return Unit.f80348a;
            }
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f59744t;
            co2.y o23 = dl2.b.o2(j0Var, 0, new b0(this.f59745u, null), 3);
            p1 b13 = ao2.m0.b();
            o23.b(new w(b13, 0));
            try {
                CoroutineContext coroutineContext = j0Var.getCoroutineContext();
                Object b14 = ho2.y.b(coroutineContext);
                plus = j0Var.getCoroutineContext().plus(b13);
                unit = Unit.f80348a;
                zVar = new z(this.f59746v, coroutineContext, b14, o23, this.f59747w, this.f59748x, b13, null);
                this.f59744t = o23;
                this.f59742r = b13;
                this.f59743s = 1;
            } catch (AbortFlowException e14) {
                e = e14;
                b0Var = o23;
                p1Var = b13;
            } catch (Throwable th4) {
                th = th4;
                b0Var = o23;
                cancellationException = null;
                b0Var.cancel(cancellationException);
                throw th;
            }
            if (kg.n.l(plus, unit, ho2.y.b(plus), zVar, this) == aVar) {
                return aVar;
            }
            b0Var = o23;
            cancellationException2 = null;
            b0Var.cancel(cancellationException2);
            return Unit.f80348a;
            if (e.f80509a != p1Var) {
                throw e;
            }
            cancellationException2 = null;
            b0Var.cancel(cancellationException2);
            return Unit.f80348a;
        } catch (Throwable th5) {
            th = th5;
            cancellationException = null;
            b0Var.cancel(cancellationException);
            throw th;
        }
    }
}
