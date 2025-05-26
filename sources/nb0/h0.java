package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f90225r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90225r = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h0(this.f90225r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p0 p0Var = this.f90225r;
        p0Var.f90310f.clear();
        ((lb0.b) p0Var.j()).o("ALREADY_MIGRATED", false);
        p0Var.f90311g = false;
        return Unit.f80348a;
    }
}
