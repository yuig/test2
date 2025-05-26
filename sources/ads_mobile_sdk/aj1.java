package ads_mobile_sdk;

import ao2.j0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import nm.s;

/* loaded from: classes2.dex */
public final class aj1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nm.q f2429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dj1 f2430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj1(dj1 dj1Var, nm.q qVar, bl2.c cVar, boolean z13) {
        super(2, cVar);
        this.f2429b = qVar;
        this.f2430c = dj1Var;
        this.f2431d = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        aj1 aj1Var = new aj1(this.f2430c, this.f2429b, cVar, this.f2431d);
        aj1Var.f2428a = obj;
        return aj1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((aj1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f2428a;
        nm.q qVar = this.f2429b;
        dj1 dj1Var = this.f2430c;
        boolean z13 = this.f2431d;
        ArrayList arrayList = new ArrayList(g0.q(qVar, 10));
        Iterator it = qVar.f91364a.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.jvm.internal.j.d(j0Var, null, new zi1(dj1Var, (s) it.next(), z13, null), 3));
        }
        return arrayList;
    }
}
