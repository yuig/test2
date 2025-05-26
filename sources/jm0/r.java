package jm0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import lm0.h0;
import lm0.i0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final r f77000j = new r(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f77001k = new r(1);

    /* renamed from: l, reason: collision with root package name */
    public static final r f77002l = new r(2);

    /* renamed from: m, reason: collision with root package name */
    public static final r f77003m = new r(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77004i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13) {
        super(2);
        this.f77004i = i13;
    }

    public final void b(l82.e createLens, c0 subResult) {
        switch (this.f77004i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 6));
                createLens.h(new il0.r(subResult, 7));
                List list = subResult.f82214c;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new i0((sk0.u) it.next()));
                }
                createLens.b(arrayList);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 8));
                createLens.h(new il0.r(subResult, 9));
                a.c.x(subResult, 3, createLens);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 10));
                createLens.h(new il0.r(subResult, 11));
                List list2 = subResult.f82214c;
                ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new h0((um0.h0) it2.next()));
                }
                createLens.b(arrayList2);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 12));
                createLens.h(new il0.r(subResult, 13));
                a.c.x(subResult, 4, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f77004i) {
            case 0:
                b((l82.e) obj, (c0) obj2);
                break;
            case 1:
                b((l82.e) obj, (c0) obj2);
                break;
            case 2:
                b((l82.e) obj, (c0) obj2);
                break;
            default:
                b((l82.e) obj, (c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
