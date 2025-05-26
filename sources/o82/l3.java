package o82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d2 f93659r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gx.e f93660s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(d2 d2Var, gx.e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f93659r = d2Var;
        this.f93660s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l3(this.f93659r, this.f93660s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d2 d2Var = this.f93659r;
        if (d2Var instanceof c2) {
            c2 c2Var = (c2) d2Var;
            List list = c2Var.f93549a;
            Object obj2 = c2Var.f93550b;
            gx.e eVar = this.f93660s;
            eVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k3 k3Var = (k3) ((Function2) eVar.f66247c).invoke((l82.i0) it.next(), obj2);
                if (k3Var != null) {
                    arrayList.add(k3Var);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                k3 k3Var2 = (k3) it2.next();
                nx.d1 d1Var = (nx.d1) eVar.f66246b;
                zy.n0 contextProvider = k3Var2.f93650c;
                d1Var.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                String id3 = k3Var2.f93648a;
                Intrinsics.checkNotNullParameter(id3, "id");
                String trackingParams = k3Var2.f93649b;
                Intrinsics.checkNotNullParameter(trackingParams, "trackingParams");
                nx.e1 m13 = bk.f.m(contextProvider, id3);
                if (m13 != null) {
                    d1Var.f92387b.put(m13, trackingParams);
                }
            }
        }
        return Unit.f80348a;
    }
}
