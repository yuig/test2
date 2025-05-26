package e2;

import ao2.j0;
import do2.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56852r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f56853s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.k f56854t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f56855u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o1.k kVar, w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f56854t = kVar;
        this.f56855u = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g gVar = new g(this.f56854t, this.f56855u, cVar);
        gVar.f56853s = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56852r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f56853s;
            f2 f2Var = ((o1.l) this.f56854t).f92764a;
            o1.f fVar = new o1.f(3, this.f56855u, j0Var);
            this.f56852r = 1;
            f2Var.getClass();
            if (f2.j(f2Var, fVar, this) == aVar) {
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
