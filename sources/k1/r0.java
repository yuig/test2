package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77990r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.l f77991s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.j f77992t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.x0 f77993u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o1.l lVar, o1.j jVar, ao2.x0 x0Var, bl2.c cVar) {
        super(2, cVar);
        this.f77991s = lVar;
        this.f77992t = jVar;
        this.f77993u = x0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r0(this.f77991s, this.f77992t, this.f77993u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77990r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f77990r = 1;
            if (this.f77991s.a(this.f77992t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        ao2.x0 x0Var = this.f77993u;
        if (x0Var != null) {
            x0Var.dispose();
        }
        return Unit.f80348a;
    }
}
