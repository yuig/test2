package fk1;

import en1.b0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r52.d0;
import u52.b1;
import wt1.c0;
import wt1.y;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62373i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f62374j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(List list, int i13) {
        super(1);
        this.f62373i = i13;
        this.f62374j = list;
    }

    public final c0 b(androidx.recyclerview.widget.w it) {
        int i13 = this.f62373i;
        List list = this.f62374j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return new y(it, list);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b0 b0Var;
        Integer num = null;
        int i13 = this.f62373i;
        List list = this.f62374j;
        switch (i13) {
            case 0:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.getClass();
                return d.e(list);
            case 1:
                gk1.l it2 = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return gk1.l.e(it2, null, new gk1.h(list), null, 5);
            case 2:
                hk1.g it3 = (hk1.g) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                it3.getClass();
                return hk1.g.e(list);
            case 3:
                return b((androidx.recyclerview.widget.w) obj);
            case 4:
                return b((androidx.recyclerview.widget.w) obj);
            case 5:
                return b((androidx.recyclerview.widget.w) obj);
            case 6:
                rn1.k bind = (rn1.k) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(list);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(list);
                        break;
                }
                return Unit.f80348a;
            case 7:
                rn1.k bind2 = (rn1.k) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(list);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(list);
                        break;
                }
                return Unit.f80348a;
            case 8:
                en1.d it4 = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!list.isEmpty()) {
                    List<Pair> list2 = list;
                    ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                    for (Pair pair : list2) {
                        arrayList.add(new sl1.e((String) pair.f80346a, (String) pair.f80347b, num, 12));
                    }
                    b0Var = new en1.e(arrayList, list.size());
                } else {
                    b0Var = en1.m.f59689a;
                }
                return en1.d.e(it4, null, null, null, false, b0Var, null, false, 0, 479);
            case 9:
                yl1.b it5 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return yl1.b.f(it5, null, false, d7.b.Z(list.size() > 3), null, null, null, null, null, 0, null, 1019);
            case 10:
                d0 it6 = (d0) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return d0.b(it6, null, null, this.f62374j, null, 95);
            case 11:
                b1 it7 = (b1) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return b1.b(it7, null, null, null, this.f62374j, 767);
            case 12:
                h62.h it8 = (h62.h) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                list.add(0, it8.b());
                return Unit.f80348a;
            case 13:
                Map update = (Map) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List<k62.c> list3 = list;
                int a13 = y0.a(g0.q(list3, 10));
                if (a13 < 16) {
                    a13 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
                for (k62.c cVar : list3) {
                    linkedHashMap.put(cVar.f78424a.b(), cVar.f78424a);
                }
                update.putAll(linkedHashMap);
                return Unit.f80348a;
            case 14:
                rn1.a it9 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return rn1.a.y(it9, null, null, this.f62374j, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                list.add(th3);
                return Unit.f80348a;
        }
    }
}
