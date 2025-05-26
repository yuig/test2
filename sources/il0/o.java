package il0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import s90.i0;
import tk0.f0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f72536j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f72537k = new o(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72538i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(2);
        this.f72538i = i13;
    }

    public final void b(l82.e createLens, c0 subResult) {
        switch (this.f72538i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new i0(subResult, 28));
                createLens.h(new i0(subResult, 29));
                List list = subResult.f82214c;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new g((sk0.u) it.next()));
                }
                createLens.b(arrayList);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new r(subResult, 0));
                createLens.h(new r(subResult, 1));
                List list2 = subResult.f82214c;
                ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new h((f0) it2.next()));
                }
                createLens.b(arrayList2);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f72538i) {
            case 0:
                b((l82.e) obj, (c0) obj2);
                break;
            default:
                b((l82.e) obj, (c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
