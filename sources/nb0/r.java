package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90319r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f90320s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f90320s = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f90320s, cVar);
        rVar.f90319r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((d6.b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f90320s.invoke((d6.b) this.f90319r);
        return Unit.f80348a;
    }
}
