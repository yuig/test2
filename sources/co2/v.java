package co2;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f28351r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f28352s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f28353t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28354u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f28353t = c0Var;
        this.f28354u = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v vVar = new v(this.f28353t, this.f28354u, cVar);
        vVar.f28352s = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f28351r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                c0 c0Var = this.f28353t;
                Object obj2 = this.f28354u;
                xk2.q qVar = xk2.s.f135225b;
                this.f28351r = 1;
                if (c0Var.o(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m13 = Unit.f80348a;
            xk2.q qVar2 = xk2.s.f135225b;
        } catch (Throwable th3) {
            xk2.q qVar3 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        return new t((m13 instanceof xk2.r) ^ true ? Unit.f80348a : new r(xk2.s.a(m13)));
    }
}
