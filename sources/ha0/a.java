package ha0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f68361r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, bl2.c cVar) {
        super(2, cVar);
        this.f68361r = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f68361r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        r41.k kVar = r41.k.f106176a;
        r41.k.f106176a.d(this.f68361r, r41.b.Unknown);
        return Unit.f80348a;
    }
}
