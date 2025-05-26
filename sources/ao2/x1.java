package ao2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class x1 extends kotlin.jvm.internal.p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f20232a = new x1();

    public x1() {
        super(3, a2.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
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
                if (!(obj4 instanceof z)) {
                    obj4 = b2.b(obj4);
                }
                ((lo2.h) iVar).f84192e = obj4;
            } else if (a2Var.Z(obj4) >= 0) {
                ((lo2.h) iVar).f84190c = m0.R(a2Var, true, new v1(a2Var, iVar, 0));
                break;
            }
        }
        return Unit.f80348a;
    }
}
