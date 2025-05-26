package o82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93569i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h2 f93570j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y0 f93571k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q1 f93572l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(h2 h2Var, y0 y0Var, q1 q1Var, int i13) {
        super(1);
        this.f93569i = i13;
        this.f93570j = h2Var;
        this.f93571k = y0Var;
        this.f93572l = q1Var;
    }

    public final y0 b(y0 it) {
        t tVar = t.f93712e;
        int i13 = this.f93569i;
        int i14 = 0;
        q1 q1Var = this.f93572l;
        h2 h2Var = this.f93570j;
        y0 y0Var = this.f93571k;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                List list = y0Var.f93756a;
                h2Var.getClass();
                ArrayList H0 = CollectionsKt.H0(h2.h(list));
                j1 j1Var = (j1) q1Var;
                H0.add(j1Var.f93636b, H0.remove(j1Var.f93635a));
                Unit unit = Unit.f80348a;
                return y0.f(it, h2.g(h2Var, H0), tVar, 4);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                z zVar = ((i1) q1Var).f93618a;
                List list2 = y0Var.f93756a;
                h2Var.getClass();
                return y0.f(it, h2.g(h2Var, zVar.a(h2.h(list2))), null, 6);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                List list3 = y0Var.f93756a;
                h2Var.getClass();
                ArrayList h10 = h2.h(list3);
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(h10, 10));
                Iterator it2 = h10.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    l82.i0 i0Var = (l82.i0) next;
                    p pVar = h2Var.f93611c;
                    p1 p1Var = (p1) q1Var;
                    if (Intrinsics.d(pVar.a(i14, i0Var), pVar.a(i14, p1Var.f93687a))) {
                        i0Var = p1Var.f93687a;
                    }
                    arrayList.add(i0Var);
                    i14 = i15;
                }
                return y0.f(it, h2.g(h2Var, arrayList), tVar, 4);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                List list4 = y0Var.f93756a;
                h2Var.getClass();
                ArrayList H02 = CollectionsKt.H0(h2.h(list4));
                o1 o1Var = (o1) q1Var;
                o1Var.getClass();
                H02.set(0, o1Var.f93682a);
                Unit unit2 = Unit.f80348a;
                return y0.f(it, h2.g(h2Var, H02), tVar, 4);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List list5 = y0Var.f93756a;
                h2Var.getClass();
                ArrayList h13 = h2.h(list5);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = h13.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    int i16 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    p pVar2 = h2Var.f93611c;
                    if (!Intrinsics.d(pVar2.a(i14, (l82.i0) next2), pVar2.a(i14, ((l1) q1Var).f93654a))) {
                        arrayList2.add(next2);
                    }
                    i14 = i16;
                }
                return y0.f(it, h2.g(h2Var, arrayList2), tVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f93569i) {
        }
        return b((y0) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(h2 h2Var, q1 q1Var, y0 y0Var) {
        super(1);
        this.f93569i = 2;
        this.f93570j = h2Var;
        this.f93572l = q1Var;
        this.f93571k = y0Var;
    }
}
