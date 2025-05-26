package mm2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87743i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f87744j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(c0 c0Var, int i13) {
        super(0);
        this.f87743i = i13;
        this.f87744j = c0Var;
    }

    public final Set b() {
        int i13 = this.f87743i;
        c0 c0Var = this.f87744j;
        switch (i13) {
            case 1:
                return c0Var.h(in2.g.f72860n, null);
            case 2:
            default:
                return c0Var.o(in2.g.f72862p);
            case 3:
                return c0Var.i(in2.g.f72861o, null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f87743i;
        c0 c0Var = this.f87744j;
        switch (i13) {
            case 0:
                in2.g kindFilter = in2.g.f72858l;
                in2.n.f72875a.getClass();
                in2.k nameFilter = in2.k.f72872i;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
                Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
                hm2.e eVar = hm2.e.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (kindFilter.a(in2.g.f72857k)) {
                    for (ym2.g gVar : c0Var.h(kindFilter, nameFilter)) {
                        nameFilter.invoke(gVar);
                        wn2.k.b(c0Var.e(gVar, eVar), linkedHashSet);
                    }
                }
                boolean a13 = kindFilter.a(in2.g.f72854h);
                List list = kindFilter.f72865a;
                if (a13 && !list.contains(in2.c.f72844a)) {
                    for (ym2.g gVar2 : c0Var.i(kindFilter, nameFilter)) {
                        nameFilter.invoke(gVar2);
                        linkedHashSet.addAll(c0Var.a(gVar2, eVar));
                    }
                }
                if (kindFilter.a(in2.g.f72855i) && !list.contains(in2.c.f72844a)) {
                    for (ym2.g gVar3 : c0Var.o(kindFilter)) {
                        nameFilter.invoke(gVar3);
                        linkedHashSet.addAll(c0Var.d(gVar3, eVar));
                    }
                }
                break;
        }
        return b();
    }
}
