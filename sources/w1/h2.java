package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public i2.q1 f127283r;

    /* renamed from: s, reason: collision with root package name */
    public int f127284s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127285t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f127286u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1.l f127287v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2.q1 q1Var, boolean z13, o1.l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f127285t = q1Var;
        this.f127286u = z13;
        this.f127287v = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h2(this.f127285t, this.f127286u, this.f127287v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        i2.q1 q1Var;
        i2.q1 q1Var2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127284s;
        if (i13 == 0) {
            ue.c.H(obj);
            q1Var = this.f127285t;
            o1.n nVar = (o1.n) q1Var.getValue();
            if (nVar != null) {
                o1.j oVar = this.f127286u ? new o1.o(nVar) : new o1.m(nVar);
                o1.l lVar = this.f127287v;
                if (lVar != null) {
                    this.f127283r = q1Var;
                    this.f127284s = 1;
                    if (lVar.a(oVar, this) == aVar) {
                        return aVar;
                    }
                    q1Var2 = q1Var;
                }
                q1Var.setValue(null);
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q1Var2 = this.f127283r;
        ue.c.H(obj);
        q1Var = q1Var2;
        q1Var.setValue(null);
        return Unit.f80348a;
    }
}
