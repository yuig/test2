package wa1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb0.m;
import lb0.o;
import va1.e0;
import va1.e1;
import va1.o0;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f128635r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e1 f128636s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, e1 e1Var, bl2.c cVar) {
        super(2, cVar);
        this.f128635r = kVar;
        this.f128636s = e1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f128635r, this.f128636s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k kVar = this.f128635r;
        kVar.getClass();
        e1 e1Var = this.f128636s;
        String str = ((e1Var instanceof e0) || (e1Var instanceof o0)) ? "FIRST_SEEN_CLAIMED_ACCOUNTS_BANNER" : null;
        if (str != null) {
            o oVar = kVar.f128664o;
            if (!((lb0.b) oVar).b(str)) {
                m c13 = ((lb0.b) oVar).c();
                c13.putLong(str, System.currentTimeMillis());
                c13.commit();
            }
        }
        return Unit.f80348a;
    }
}
