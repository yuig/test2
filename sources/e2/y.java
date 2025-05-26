package e2;

import ao2.j0;
import do2.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56918r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f56919s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f56920t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f56920t = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y yVar = new y(this.f56920t, cVar);
        yVar.f56919s = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56918r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f56919s;
            z zVar = this.f56920t;
            f2 f2Var = ((o1.l) zVar.f56921n).f92764a;
            o1.f fVar = new o1.f(4, zVar, j0Var);
            this.f56918r = 1;
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
