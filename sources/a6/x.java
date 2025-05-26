package a6;

import do2.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f887r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f888s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f889t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f889t = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x xVar = new x(this.f889t, cVar);
        xVar.f888s = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f887r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j jVar = (do2.j) this.f888s;
            j0 j0Var = this.f889t;
            k0 k0Var = (k0) j0Var.f861g.getValue();
            if (!(k0Var instanceof b)) {
                j0Var.f863i.r(new n(k0Var));
            }
            t tVar = new t(k0Var, null);
            this.f887r = 1;
            lb.l0.a0(jVar);
            Object collect = j0Var.f861g.collect(new u0(new kotlin.jvm.internal.f0(), new v(jVar, 0), tVar), this);
            if (collect != cl2.a.COROUTINE_SUSPENDED) {
                collect = Unit.f80348a;
            }
            if (collect != aVar) {
                collect = Unit.f80348a;
            }
            if (collect != aVar) {
                collect = Unit.f80348a;
            }
            if (collect == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
