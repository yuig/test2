package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59820r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f59821s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.j f59822t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(do2.j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f59822t = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r0 r0Var = new r0(this.f59822t, cVar);
        r0Var.f59821s = obj;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create(obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59820r;
        if (i13 == 0) {
            ue.c.H(obj);
            Object obj2 = this.f59821s;
            this.f59820r = 1;
            if (this.f59822t.emit(obj2, this) == aVar) {
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
