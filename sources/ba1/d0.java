package ba1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e0 f22353r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f22354s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f22353r = e0Var;
        this.f22354s = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d0(this.f22353r, this.f22354s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        e0 e0Var = this.f22353r;
        e0Var.f22359c.a(e0Var.f22357a.a(this.f22354s.f22376a));
        return Unit.f80348a;
    }
}
