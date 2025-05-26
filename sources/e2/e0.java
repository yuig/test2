package e2;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56845r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f56846s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f56847t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j1.n f56848u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, float f13, j1.n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f56846s = g0Var;
        this.f56847t = f13;
        this.f56848u = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e0(this.f56846s, this.f56847t, this.f56848u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56845r;
        if (i13 == 0) {
            ue.c.H(obj);
            j1.d dVar = (j1.d) this.f56846s.f56858c;
            Float f13 = new Float(this.f56847t);
            this.f56845r = 1;
            if (j1.d.c(dVar, f13, this.f56848u, this) == aVar) {
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
