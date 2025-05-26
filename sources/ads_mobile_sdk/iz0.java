package ads_mobile_sdk;

import a.l0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class iz0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz0 f6593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(mz0 mz0Var, bl2.c cVar) {
        super(2, cVar);
        this.f6593b = mz0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new iz0(this.f6593b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new iz0(this.f6593b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6592a;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.x xVar = this.f6593b.f8453u;
            this.f6592a = 1;
            if (xVar.join(this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        mz0 mz0Var = this.f6593b;
        synchronized (mz0Var.f8450r) {
            arrayList = mz0Var.f8451s;
        }
        mz0 mz0Var2 = this.f6593b;
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xi.d dVar = (xi.d) it.next();
            l0 l0Var = cm0.f3958f;
            kotlin.jvm.internal.j.z(dl2.b.b(getContext().minusKey(zs2.f14913b).minusKey(ao2.g0.f20153a).minusKey(ao2.g0.f20154b)), null, null, new hz0(dVar, mz0Var2, null), 3);
            arrayList2.add(Unit.f80348a);
        }
        return Unit.f80348a;
    }
}
