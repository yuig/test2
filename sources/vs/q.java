package vs;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f126503j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f126504k = new q(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q f126505l = new q(2);

    /* renamed from: m, reason: collision with root package name */
    public static final q f126506m = new q(3);

    /* renamed from: n, reason: collision with root package name */
    public static final q f126507n = new q(4);

    /* renamed from: o, reason: collision with root package name */
    public static final q f126508o = new q(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126509i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(1);
        this.f126509i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f126509i;
        switch (i13) {
            case 0:
                cn1.d it = (cn1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return cn1.d.e(it, null, bs1.c.j2(new String[0], x0.search), rm1.q.SEARCH, null, null, null, null, null, null, null, null, 524263);
            case 1:
                ln1.l bind = (ln1.l) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.d(fm1.c.GONE);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.d(fm1.c.GONE);
                        break;
                }
                return Unit.f80348a;
            case 2:
                ln1.l bind2 = (ln1.l) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d(fm1.c.GONE);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d(fm1.c.GONE);
                        break;
                }
                return Unit.f80348a;
            case 3:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 3:
                        th3.printStackTrace();
                        break;
                    default:
                        th3.printStackTrace();
                        break;
                }
                return Unit.f80348a;
            case 4:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 3:
                        th4.printStackTrace();
                        break;
                    default:
                        th4.printStackTrace();
                        break;
                }
                return Unit.f80348a;
            default:
                Pair item = (Pair) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                return item.f80346a + ": " + item.f80347b;
        }
    }
}
