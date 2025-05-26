package hp0;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zy.l0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f69845j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f69846k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f69847l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f69848m = new k(3);

    /* renamed from: n, reason: collision with root package name */
    public static final k f69849n = new k(4);

    /* renamed from: o, reason: collision with root package name */
    public static final k f69850o = new k(5);

    /* renamed from: p, reason: collision with root package name */
    public static final k f69851p = new k(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69852i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f69852i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69852i) {
            case 0:
                in1.b it = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                hn1.n nVar = it.f72831d;
                int i13 = eo1.c.space_0;
                nVar.getClass();
                return in1.b.e(it, null, false, new hn1.n(i13, i13, i13, i13), 7);
            case 1:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return om1.c.e(it2, rm1.q.CANCEL, om1.e.MD, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1016);
            case 2:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof gb2.i ? m0.F(list, gb2.i.class) : q0.f80391a;
            case 3:
                Intrinsics.checkNotNullParameter((List) obj, "it");
                return Boolean.valueOf(!r10.isEmpty());
            case 4:
                List it3 = (List) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return (gb2.i) d7.b.j0(it3);
            case 5:
                return Unit.f80348a;
            default:
                e0 it4 = (e0) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                l0 pinalyticsState = it4.f69829a;
                Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
                String tappedPinItemId = it4.f69830b;
                Intrinsics.checkNotNullParameter(tappedPinItemId, "tappedPinItemId");
                return new e0(pinalyticsState, tappedPinItemId, it4.f69831c, false);
        }
    }
}
