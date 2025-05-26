package ht1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements mt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f70327a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.c f70328b;

    /* renamed from: c, reason: collision with root package name */
    public final et1.d f70329c;

    /* renamed from: d, reason: collision with root package name */
    public Function1 f70330d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f70331e;

    /* renamed from: f, reason: collision with root package name */
    public mt1.d f70332f;

    /* renamed from: g, reason: collision with root package name */
    public et1.c f70333g;

    /* renamed from: h, reason: collision with root package name */
    public int f70334h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f70335i;

    public r(ArrayList subProducerFactories, id1.a mutablePipelineComponentProvider) {
        Intrinsics.checkNotNullParameter(subProducerFactories, "subProducerFactories");
        Intrinsics.checkNotNullParameter(mutablePipelineComponentProvider, "mutablePipelineComponentProvider");
        this.f70327a = mutablePipelineComponentProvider;
        et1.c cVar = (et1.c) mutablePipelineComponentProvider.get();
        this.f70328b = cVar;
        this.f70329c = ((et1.v0) cVar).f60109a;
        this.f70335i = CollectionsKt.H0(subProducerFactories);
        a();
    }

    public final void a() {
        if (this.f70332f != null) {
            LinkedList linkedList = new LinkedList();
            et1.c cVar = this.f70333g;
            if (cVar != null) {
                ((et1.v0) cVar).h(new jq1.b(linkedList, 3));
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((et1.u0) this.f70329c).c(it.next());
            }
        }
        this.f70332f = null;
        this.f70333g = null;
        ArrayList arrayList = this.f70335i;
        if (arrayList.isEmpty()) {
            Function0 function0 = this.f70331e;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Function1 function1 = (Function1) arrayList.remove(0);
        this.f70333g = (et1.c) this.f70327a.get();
        String e13 = a.a.e("Sub-producer [", this.f70334h, "]");
        et1.c cVar2 = this.f70333g;
        Intrinsics.f(cVar2);
        ((et1.v0) this.f70328b).a(cVar2, e13);
        this.f70334h++;
        et1.c cVar3 = this.f70333g;
        Intrinsics.f(cVar3);
        mt1.d dVar = (mt1.d) function1.invoke(cVar3);
        this.f70332f = dVar;
        Function1 function12 = this.f70330d;
        if (function12 != null) {
            Intrinsics.f(dVar);
            dVar.c(function12);
        }
        mt1.d dVar2 = this.f70332f;
        Intrinsics.f(dVar2);
        dVar2.d(new yj1.d(this, 22));
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f70330d = producePacketCallback;
        mt1.d dVar = this.f70332f;
        if (dVar != null) {
            dVar.c(producePacketCallback);
        }
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f70331e = doneProducingCallback;
        if (this.f70335i.isEmpty() && this.f70332f == null) {
            doneProducingCallback.invoke();
        }
    }

    public final String toString() {
        return "ConcatenatingProducer producerIndex [" + this.f70334h + "] currentProducer [" + this.f70332f + "] ";
    }
}
