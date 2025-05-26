package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f85284r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f85285s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85285s = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a2 a2Var = new a2(this.f85285s, cVar);
        a2Var.f85284r = obj;
        return a2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((l2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o2 o2Var = ((l2) this.f85284r).f85439a;
        o2.a(o2Var, o2Var.f85500h, this.f85285s, 1);
        return Unit.f80348a;
    }
}
