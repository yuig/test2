package od1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f94127j = new h0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f94128k = new h0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h0 f94129l = new h0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94130i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i13) {
        super(2);
        this.f94130i = i13;
    }

    public final void b(l82.e createLens, l82.c0 subResult) {
        switch (this.f94130i) {
            case 0:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                a.c.x(subResult, 28, createLens);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new x91.g0(subResult, 7));
                createLens.h(new x91.g0(subResult, 8));
                a.c.x(subResult, 29, createLens);
                break;
            default:
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                List list = subResult.f82214c;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new v((zy.k0) it.next()));
                }
                createLens.b(arrayList);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f94130i) {
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
