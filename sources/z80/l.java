package z80;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.u1;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f141064r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u1 f141065s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, u1 u1Var, bl2.c cVar) {
        super(2, cVar);
        this.f141064r = mVar;
        this.f141065s = u1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f141064r, this.f141065s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        m mVar = this.f141064r;
        vh.a aVar2 = mVar.f141068c;
        u1 u1Var = this.f141065s;
        aVar2.a(u1Var, true);
        mVar.f141068c.c(u1Var.f106669a);
        return Unit.f80348a;
    }
}
