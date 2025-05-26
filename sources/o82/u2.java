package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class u2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93726r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v2 f93727s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var, bl2.c cVar) {
        super(2, cVar);
        this.f93727s = v2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u2(this.f93727s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93726r;
        if (i13 == 0) {
            ue.c.H(obj);
            v2 v2Var = this.f93727s;
            do2.i U8 = v2Var.U8();
            y1.b bVar = new y1.b(v2Var, 18);
            this.f93726r = 1;
            if (U8.collect(bVar, this) == aVar) {
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
