package c91;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f26981r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f26982s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f26981r = dVar;
        this.f26982s = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f26981r, this.f26982s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((jk.b) ((at1.d) this.f26981r.f26983a.get()).f20447l.getValue()).c(e0.b(this.f26982s));
        return Unit.f80348a;
    }
}
