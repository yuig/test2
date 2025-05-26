package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class y0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y1 f127873r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f127874s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(y1 y1Var, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f127873r = y1Var;
        this.f127874s = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y0(this.f127873r, this.f127874s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f127873r.f127879g.e().a(new n(this.f127874s));
        return Unit.f80348a;
    }
}
