package u90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import v90.q;
import x62.p;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121184r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f121185s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f121185s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f121185s, cVar);
        fVar.f121184r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f121185s.a(new q((p) this.f121184r));
        return Unit.f80348a;
    }
}
