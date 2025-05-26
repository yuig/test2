package y1;

import ao2.k2;
import ao2.o1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f136589r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f136590s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f136590s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f136590s, cVar);
        mVar.f136589r = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        boolean z13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ao2.j0 j0Var = (ao2.j0) this.f136589r;
        n nVar = this.f136590s;
        o1 o1Var = (o1) nVar.f136591a.getAndSet(null);
        AtomicReference atomicReference = nVar.f136591a;
        k2 z14 = kotlin.jvm.internal.j.z(j0Var, null, null, new l(o1Var, nVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, z14)) {
                z13 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z13 = false;
                break;
            }
        }
        return Boolean.valueOf(z13);
    }
}
