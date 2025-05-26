package ads_mobile_sdk;

import ao2.j0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import ql2.s;

/* loaded from: classes2.dex */
public final class dv1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hv1 f4461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv1(hv1 hv1Var, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f4461b = hv1Var;
        this.f4462c = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        dv1 dv1Var = new dv1(this.f4461b, this.f4462c, cVar);
        dv1Var.f4460a = obj;
        return dv1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dv1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f4460a;
        hv1 hv1Var = this.f4461b;
        IntRange q13 = s.q(0, this.f4462c);
        hv1 hv1Var2 = this.f4461b;
        ArrayList arrayList = new ArrayList(g0.q(q13, 10));
        ql2.k it = q13.iterator();
        while (it.f104109c) {
            it.b();
            arrayList.add(kotlin.jvm.internal.j.z(j0Var, hv1Var2.f6106b, null, new cv1(hv1Var2, null), 2));
        }
        hv1Var.f6111g = arrayList;
        return Unit.f80348a;
    }
}
