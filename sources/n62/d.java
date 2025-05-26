package n62;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m62.a1;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f89345r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f89346s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f89346s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f89346s, cVar);
        dVar.f89345r = ((Number) obj).floatValue();
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create(Float.valueOf(((Number) obj).floatValue()), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f89346s.f89362k.invoke(new a1(this.f89345r));
        return Unit.f80348a;
    }
}
