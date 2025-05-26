package lo2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import lb.l0;
import oi.o6;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f84168a = new a();

    public a() {
        super(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        i iVar = (i) obj2;
        long j13 = bVar.f84169a;
        if (j13 <= 0) {
            ((h) iVar).f84192e = Unit.f80348a;
        } else {
            o6 o6Var = new o6(iVar, bVar, 23);
            Intrinsics.g(iVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            h hVar = (h) iVar;
            CoroutineContext coroutineContext = hVar.f84188a;
            hVar.f84190c = l0.s0(coroutineContext).a(j13, o6Var, coroutineContext);
        }
        return Unit.f80348a;
    }
}
