package j41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.t0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f74647j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f74648k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f74649l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f74650m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f74651n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f74652o = new f(5);

    /* renamed from: p, reason: collision with root package name */
    public static final f f74653p = new f(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74654i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f74654i = i13;
    }

    public final un1.c b(un1.c it) {
        switch (this.f74654i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return un1.c.y(it, null, null, 0, fm1.c.GONE, false, null, null, 0, null, false, 524223);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74654i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 1:
                cm1.d it2 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return cm1.d.e(it2, yl1.b.f(it2.f28012a, null, false, null, null, null, null, null, null, t0.profile_creator_hub_button, null, 767), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 2:
                Intrinsics.checkNotNullParameter((Navigation) obj, "$this$null");
                return Unit.f80348a;
            case 3:
                return b((un1.c) obj);
            case 4:
                return b((un1.c) obj);
            case 5:
                rn1.a it3 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return rn1.a.y(it3, null, vn1.c.DEFAULT, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097141);
            default:
                rm1.d it4 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return rm1.d.e(it4, null, rm1.c.DEFAULT, null, 0, null, 29);
        }
    }
}
