package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class f3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93593r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i3 f93594s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(i3 i3Var, bl2.c cVar) {
        super(2, cVar);
        this.f93594s = i3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f3(this.f93594s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93593r;
        if (i13 == 0) {
            ue.c.H(obj);
            i3 i3Var = this.f93594s;
            do2.i V = lb.l0.V(i3Var.U8());
            e3 e3Var = new e3(i3Var, null);
            this.f93593r = 1;
            if (lb.l0.I(V, e3Var, this) == aVar) {
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
