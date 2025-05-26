package vn0;

import il0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.c0;
import sk0.u;
import tk0.f0;

/* loaded from: classes5.dex */
public final class j extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f126260j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f126261k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126262i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(2);
        this.f126262i = i13;
    }

    public final void b(l82.e createLens, c0 subResult) {
        switch (this.f126262i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new r(subResult, 22));
                createLens.h(new r(subResult, 23));
                List list = subResult.f82214c;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new e((u) it.next()));
                }
                createLens.b(arrayList);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new r(subResult, 24));
                createLens.h(new r(subResult, 25));
                List list2 = subResult.f82214c;
                ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new f((f0) it2.next()));
                }
                createLens.b(arrayList2);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f126262i) {
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
