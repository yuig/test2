package ea1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o0 f58091j = new o0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o0 f58092k = new o0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final o0 f58093l = new o0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final o0 f58094m = new o0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final o0 f58095n = new o0(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58096i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i13) {
        super(1);
        this.f58096i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f58096i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58096i) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(rm1.q.WORKFLOW_STATUS_WARNING);
                break;
            case 1:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(f58091j);
                bind.a(rm1.c.DARK);
                break;
            case 2:
                wm1.k0 bind2 = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                wm1.y startItem = new wm1.y(rm1.q.HISTORY);
                bind2.getClass();
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind2.f130311b = startItem;
                break;
        }
        return b((yl1.b) obj);
    }
}
