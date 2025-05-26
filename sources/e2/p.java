package e2;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56887r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f56888s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f56888s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p pVar = new p(this.f56888s, cVar);
        pVar.f56887r = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return kotlin.jvm.internal.j.z((j0) this.f56887r, null, null, new o(this.f56888s, null), 3);
    }
}
