package y91;

import ao2.j0;
import bl2.c;
import dl2.j;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p91.y;
import s60.d;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f138283r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f138284s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, r rVar, c cVar) {
        super(2, cVar);
        this.f138283r = str;
        this.f138284s = rVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new b(this.f138283r, this.f138284s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        t d2 = new d(new s60.c(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63)).d(this.f138283r);
        r rVar = this.f138284s;
        d2.o(new y(10, new p70.a(rVar, 21)), new y(11, new p70.a(rVar, 22)));
        return Unit.f80348a;
    }
}
