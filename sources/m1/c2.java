package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f85306r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f85307s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85307s = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c2 c2Var = new c2(this.f85307s, cVar);
        c2Var.f85306r = obj;
        return c2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((l2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o2 o2Var = ((l2) this.f85306r).f85439a;
        o2.a(o2Var, o2Var.f85500h, this.f85307s, 1);
        return Unit.f80348a;
    }
}
