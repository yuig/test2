package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85540r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85541s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f85542t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function2 f85543u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f85542t = uVar;
        this.f85543u = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f85542t, this.f85543u, cVar);
        rVar.f85541s = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((m1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85540r;
        u uVar = this.f85542t;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                m1 m1Var = (m1) this.f85541s;
                uVar.f85596d.setValue(Boolean.TRUE);
                Function2 function2 = this.f85543u;
                this.f85540r = 1;
                if (function2.invoke(m1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            uVar.f85596d.setValue(Boolean.FALSE);
            return Unit.f80348a;
        } catch (Throwable th3) {
            uVar.f85596d.setValue(Boolean.FALSE);
            throw th3;
        }
    }
}
