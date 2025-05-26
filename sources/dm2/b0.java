package dm2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55392i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f55393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(o oVar, int i13) {
        super(0);
        this.f55392i = i13;
        this.f55393j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f55392i;
        o oVar = this.f55393j;
        switch (i13) {
            case 0:
                c0 c0Var = (c0) oVar;
                i0 i0Var = c0Var.f55401c;
                if (i0Var.f55437i) {
                    return Boolean.valueOf(dl2.b.H1((n) i0Var.f55439k.getValue(), c0Var.f55402d));
                }
                am2.z.a(i0Var);
                throw null;
            case 1:
                c0 c0Var2 = (c0) oVar;
                i0 i0Var2 = c0Var2.f55401c;
                if (i0Var2.f55437i) {
                    return dl2.b.k2((n) i0Var2.f55439k.getValue(), c0Var2.f55402d);
                }
                am2.z.a(i0Var2);
                throw null;
            case 2:
                c0 c0Var3 = (c0) oVar;
                on2.l lVar = c0Var3.f55404f;
                rl2.u[] uVarArr = c0.f55400h;
                if (((Boolean) lb.l0.B0(lVar, uVarArr[1])).booleanValue()) {
                    return in2.m.f72874b;
                }
                List list = (List) lb.l0.B0(c0Var3.f55403e, uVarArr[0]);
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((am2.i0) it.next()).w());
                }
                i0 i0Var3 = c0Var3.f55401c;
                ym2.c cVar = c0Var3.f55402d;
                return re2.f.d(CollectionsKt.m0(new v0(i0Var3, cVar), arrayList), "package view scope for " + cVar + " in " + i0Var3.getName());
            default:
                i0 i0Var4 = (i0) oVar;
                g0 g0Var = i0Var4.f55435g;
                if (g0Var == null) {
                    StringBuilder sb3 = new StringBuilder("Dependencies of module ");
                    String str = i0Var4.getName().f139478a;
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                    sb3.append(str);
                    sb3.append(" were not set before querying module content");
                    throw new AssertionError(sb3.toString());
                }
                if (!i0Var4.f55437i) {
                    am2.z.a(i0Var4);
                    throw null;
                }
                List list2 = g0Var.f55422a;
                list2.contains(i0Var4);
                List list3 = list2;
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    ((i0) it2.next()).getClass();
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    am2.j0 j0Var = ((i0) it3.next()).f55436h;
                    Intrinsics.f(j0Var);
                    arrayList2.add(j0Var);
                }
                return new n(arrayList2, "CompositeProvider@ModuleDescriptor for " + i0Var4.getName());
        }
    }
}
