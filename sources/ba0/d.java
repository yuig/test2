package ba0;

import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m62.f0;
import u50.r;
import y90.i;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22333r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f22334s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f22334s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f22334s, cVar);
        dVar.f22333r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f22334s.a(new i((f0) this.f22333r));
        return Unit.f80348a;
    }
}
