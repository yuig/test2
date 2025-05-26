package l82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f82225a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f82226b;

    /* renamed from: c, reason: collision with root package name */
    public final List f82227c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f82228d;

    public h0(d subStateTransformer, p1.v subStateExtractor, ArrayList subEventObservers, Function2 applySubResult) {
        Intrinsics.checkNotNullParameter(subStateTransformer, "subStateTransformer");
        Intrinsics.checkNotNullParameter(subStateExtractor, "subStateExtractor");
        Intrinsics.checkNotNullParameter(subEventObservers, "subEventObservers");
        Intrinsics.checkNotNullParameter(applySubResult, "applySubResult");
        this.f82225a = subStateTransformer;
        this.f82226b = subStateExtractor;
        this.f82227c = subEventObservers;
        this.f82228d = applySubResult;
    }

    public final void a(u50.s sVar, e eVar) {
        Pair pair = (Pair) this.f82226b.invoke(eVar.f82218a, eVar.f82219b);
        u50.o oVar = (u50.o) pair.f80346a;
        i0 i0Var = (i0) pair.f80347b;
        c0 f13 = this.f82225a.f(sVar, oVar, i0Var, new e(oVar, i0Var));
        this.f82228d.invoke(eVar, f13);
        List list = this.f82227c;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((m82.a) ((m82.b) it.next())).d(sVar, f13);
            }
        }
    }

    public final void b(e eVar) {
        this.f82228d.invoke(eVar, this.f82225a.c((i0) ((Pair) this.f82226b.invoke(eVar.f82218a, eVar.f82219b)).f80347b));
    }

    public final f0 c(u50.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new f0(this, event);
    }

    public final d0 d(u50.s... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new d0(events, this);
    }

    public final com.google.firebase.messaging.a0 e() {
        return new com.google.firebase.messaging.a0(this, 26);
    }
}
