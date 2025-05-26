package jh1;

import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f76223r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f76224s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f76224s = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f76224s, cVar);
        cVar2.f76223r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((pb1.a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        pb1.a aVar2 = (pb1.a) this.f76223r;
        int i13 = f.f76229p0;
        this.f76224s.W7(aVar2);
        return Unit.f80348a;
    }
}
