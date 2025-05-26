package n70;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o82.y0;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final l0 f89623j = new l0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l0 f89624k = new l0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i13) {
        super(2);
        this.f89625i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.f89625i) {
            case 0:
                l82.e createLens = (l82.e) obj;
                l82.c0 subResult = (l82.c0) obj2;
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                Iterator it = ((y0) ((o82.a0) subResult.f82212a).f93524a.get(0)).f93756a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((o82.u0) obj3).f93721a instanceof o70.b) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                o82.u0 u0Var = (o82.u0) obj3;
                Object obj4 = u0Var != null ? u0Var.f93721a : null;
                createLens.f(new hs.a(27, subResult, obj4 instanceof o70.b ? (o70.b) obj4 : null));
                createLens.h(new ns.f0(subResult, 8));
                createLens.c(new ns.g0(subResult, 4));
                return Unit.f80348a;
            default:
                ((Number) obj).intValue();
                o70.d item = (o70.d) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof o70.a ? ((o70.a) item).f93223a.getId() : item instanceof o70.c ? ((o70.c) item).f93227a.getId() : String.valueOf(item.hashCode());
        }
    }
}
