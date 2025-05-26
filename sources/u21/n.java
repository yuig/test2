package u21;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y01.p1;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ uj2.b0 f120102r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f120103s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(uj2.b0 b0Var, o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f120102r = b0Var;
        this.f120103s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f120102r, this.f120103s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f120102r.l(wj2.c.a()).o(new a21.a(12, new p1(this.f120103s, 11)), new a21.a(13, m.f120101i));
        return Unit.f80348a;
    }
}
