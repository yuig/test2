package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24578r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24579s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f24580t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Function0 function0, bl2.c cVar) {
        super(2, cVar);
        this.f24580t = function0;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c2 c2Var = new c2(this.f24580t, cVar);
        c2Var.f24579s = obj;
        return c2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24578r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f24579s;
            b2 b2Var = new b2(0, this.f24580t);
            this.f24578r = 1;
            if (m1.n3.d(wVar, null, null, b2Var, this, 7) == aVar) {
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
