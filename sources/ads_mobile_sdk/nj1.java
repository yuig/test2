package ads_mobile_sdk;

import ao2.j0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import nm.s;

/* loaded from: classes2.dex */
public final class nj1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nm.q f8833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oj1 f8834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(nm.q qVar, oj1 oj1Var, bl2.c cVar) {
        super(2, cVar);
        this.f8833b = qVar;
        this.f8834c = oj1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        nj1 nj1Var = new nj1(this.f8833b, this.f8834c, cVar);
        nj1Var.f8832a = obj;
        return nj1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nj1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f8832a;
        nm.q qVar = this.f8833b;
        oj1 oj1Var = this.f8834c;
        ArrayList arrayList = new ArrayList(g0.q(qVar, 10));
        Iterator it = qVar.f91364a.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.jvm.internal.j.d(j0Var, null, new mj1((s) it.next(), oj1Var, null), 3));
        }
        return arrayList;
    }
}
