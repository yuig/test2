package ni1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final g2 f90688j = new g2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g2 f90689k = new g2(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g2 f90690l = new g2(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g2 f90691m = new g2(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g2 f90692n = new g2(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g2 f90693o = new g2(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g2 f90694p = new g2(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90695i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(int i13) {
        super(2);
        this.f90695i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f90695i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f2(subResult, 0));
                createLens.h(new f2(subResult, 1));
                List list = subResult.f82214c;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new u((bk1.o1) it.next()));
                }
                createLens.b(arrayList);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f2(subResult, 2));
                createLens.h(new f2(subResult, 3));
                List list2 = subResult.f82214c;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ep.b.A(it2.next());
                    Intrinsics.checkNotNullParameter(null, "wrapped");
                    arrayList2.add(new v());
                }
                createLens.b(arrayList2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f2(subResult, 4));
                createLens.h(new f2(subResult, 5));
                List list3 = subResult.f82214c;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new w((dk1.e) it3.next()));
                }
                createLens.b(arrayList3);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f2(subResult, 6));
                createLens.h(new f2(subResult, 7));
                List list4 = subResult.f82214c;
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new x((ek1.e1) it4.next()));
                }
                createLens.b(arrayList4);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f2(subResult, 8));
                createLens.h(new f2(subResult, 9));
                List list5 = subResult.f82214c;
                ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(new y((fk1.m) it5.next()));
                }
                createLens.b(arrayList5);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f2(subResult, 10));
                createLens.h(new f2(subResult, 11));
                List list6 = subResult.f82214c;
                ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(list6, 10));
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(new z((gk1.n0) it6.next()));
                }
                createLens.b(arrayList6);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new f2(subResult, 12));
                createLens.h(new f2(subResult, 13));
                List list7 = subResult.f82214c;
                ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(list7, 10));
                Iterator it7 = list7.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(new a0((hk1.q) it7.next()));
                }
                createLens.b(arrayList7);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f90695i) {
            case 0:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            case 1:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            case 2:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            case 3:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            case 4:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            case 5:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            default:
                b((l82.e) obj, (l82.c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
