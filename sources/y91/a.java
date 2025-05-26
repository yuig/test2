package y91;

import ao2.j0;
import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r41.k;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f138282r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, c cVar) {
        super(2, cVar);
        this.f138282r = str;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f138282r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k kVar = k.f106176a;
        k.f106176a.d(this.f138282r, r41.b.Unknown);
        return Unit.f80348a;
    }
}
