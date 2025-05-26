package fa;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f61471r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f61472s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f61472s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f61472s, cVar);
        dVar.f61471r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
        throw null;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        throw null;
    }
}
