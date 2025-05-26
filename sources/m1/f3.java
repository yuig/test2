package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85341r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j1 f85342s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(j1 j1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85342s = j1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f3(this.f85342s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85341r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f85341r = 1;
            if (this.f85342s.a(this) == aVar) {
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
