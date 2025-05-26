package j1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class c extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f74019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f74020s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Object obj, bl2.c cVar) {
        super(1, cVar);
        this.f74019r = dVar;
        this.f74020s = obj;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new c(this.f74019r, this.f74020s, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d dVar = this.f74019r;
        d.b(dVar);
        Object a13 = d.a(dVar, this.f74020s);
        dVar.f74028c.f74169b.setValue(a13);
        dVar.f74030e.setValue(a13);
        return Unit.f80348a;
    }
}
