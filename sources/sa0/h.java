package sa0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112171r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f112172s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f112172s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f112172s, cVar);
        hVar.f112171r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((u62.c) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f112172s.a(new e((u62.c) this.f112171r));
        return Unit.f80348a;
    }
}
