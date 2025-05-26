package ao2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class z1 extends kotlin.jvm.internal.p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f20244a = new z1();

    public z1() {
        super(3, a2.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a2 a2Var = (a2) obj;
        lo2.i iVar = (lo2.i) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a2.f20111a;
        a2Var.getClass();
        while (true) {
            Object obj4 = a2.f20111a.get(a2Var);
            if (!(obj4 instanceof l1)) {
                ((lo2.h) iVar).f84192e = Unit.f80348a;
                break;
            }
            if (a2Var.Z(obj4) >= 0) {
                ((lo2.h) iVar).f84190c = m0.R(a2Var, true, new v1(a2Var, iVar, 1));
                break;
            }
        }
        return Unit.f80348a;
    }
}
