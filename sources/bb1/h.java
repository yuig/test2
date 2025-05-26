package bb1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.l4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f22497j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f22498k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f22499l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f22500m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f22501n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f22502o = new h(5);

    /* renamed from: p, reason: collision with root package name */
    public static final h f22503p = new h(6);

    /* renamed from: q, reason: collision with root package name */
    public static final h f22504q = new h(7);

    /* renamed from: r, reason: collision with root package name */
    public static final h f22505r = new h(8);

    /* renamed from: s, reason: collision with root package name */
    public static final h f22506s = new h(9);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22507i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f22507i = i13;
    }

    public final Boolean b(Navigation it) {
        switch (this.f22507i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(Intrinsics.d(it.getF49939a(), (ScreenLocation) l4.f51097l.getValue()));
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f22507i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.next), false, null, null, null, null, null, null, 0, null, 1020);
            case 2:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], l52.c.settings_enable_mfa_verification_verify), false, null, null, null, null, null, null, 0, null, 1020);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.next), false, null, null, null, null, null, null, 0, null, 1020);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.next), false, null, null, null, null, null, null, 0, null, 1020);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.next), false, null, null, null, null, null, null, 0, null, 1020);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22507i) {
            case 0:
                return b((Navigation) obj);
            case 1:
                return e((yl1.b) obj);
            case 2:
                return b((Navigation) obj);
            case 3:
                return e((yl1.b) obj);
            case 4:
                return e((yl1.b) obj);
            case 5:
                return e((yl1.b) obj);
            case 6:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, new rm1.d(new rm1.f(rm1.q.ARROW_FORWARD), null, null, 0, null, 30), null, false, 0, null, null, null, null, null, false, null, null, 2096895);
            case 7:
                return e((yl1.b) obj);
            case 8:
                return e((yl1.b) obj);
            default:
                return b((Navigation) obj);
        }
    }
}
