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
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f128630r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e1 f128631s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, e1 e1Var, bl2.c cVar) {
        super(2, cVar);
        this.f128630r = kVar;
        this.f128631s = e1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f128630r, this.f128631s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k kVar = this.f128630r;
        kVar.getClass();
        e1 e1Var = this.f128631s;
        String str = ((e1Var instanceof e0) || (e1Var instanceof o0)) ? "DISMISSED_CLAIMED_ACCOUNTS_BANNER" : null;
        if (str != null) {
            o oVar = kVar.f128664o;
            if (!((lb0.b) oVar).b(str)) {
                m c13 = ((lb0.b) oVar).c();
                c13.putBoolean(str, true);
                c13.commit();
            }
        }
        return Unit.f80348a;
    }
}
