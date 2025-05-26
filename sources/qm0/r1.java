package qm0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final r1 f104336j = new r1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r1 f104337k = new r1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final r1 f104338l = new r1(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104339i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(int i13) {
        super(2);
        this.f104339i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f104339i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 14));
                createLens.h(new il0.r(subResult, 15));
                List list = subResult.f82214c;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new e1((sk0.u) it.next()));
                }
                createLens.b(arrayList);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 16));
                createLens.h(new il0.r(subResult, 17));
                a.c.x(subResult, 5, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new il0.r(subResult, 18));
                createLens.h(new il0.r(subResult, 19));
                a.c.x(subResult, 6, createLens);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f104339i) {
            case 0:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            case 1:
                b((l82.e) obj, (l82.c0) obj2);
                break;
            default:
                b((l82.e) obj, (l82.c0) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
