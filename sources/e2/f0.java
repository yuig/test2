package e2;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56849r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f56850s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j1.n f56851t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, j1.n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f56850s = g0Var;
        this.f56851t = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f0(this.f56850s, this.f56851t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56849r;
        if (i13 == 0) {
            ue.c.H(obj);
            j1.d dVar = (j1.d) this.f56850s.f56858c;
            Float f13 = new Float(0.0f);
            this.f56849r = 1;
            if (j1.d.c(dVar, f13, this.f56851t, this) == aVar) {
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
