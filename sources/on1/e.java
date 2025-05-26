package on1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96733i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f96716j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f96717k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f96718l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f96719m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f96720n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f96721o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f96722p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f96723q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f96724r = new e(8);

    /* renamed from: s, reason: collision with root package name */
    public static final e f96725s = new e(9);

    /* renamed from: t, reason: collision with root package name */
    public static final e f96726t = new e(10);

    /* renamed from: u, reason: collision with root package name */
    public static final e f96727u = new e(11);

    /* renamed from: v, reason: collision with root package name */
    public static final e f96728v = new e(12);

    /* renamed from: w, reason: collision with root package name */
    public static final e f96729w = new e(13);

    /* renamed from: x, reason: collision with root package name */
    public static final e f96730x = new e(14);

    /* renamed from: y, reason: collision with root package name */
    public static final e f96731y = new e(15);

    /* renamed from: z, reason: collision with root package name */
    public static final e f96732z = new e(16);
    public static final e A = new e(17);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f96733i = i13;
    }

    public final b b(b it) {
        switch (this.f96733i) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, false, false, fm1.c.GONE, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, false, false, fm1.c.VISIBLE, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f96733i;
        switch (i13) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f96712e;
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f96713f;
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff3.f96714g);
            case 3:
                i it = (i) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                return Unit.f80348a;
            case 4:
                i it2 = (i) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                return Unit.f80348a;
            case 5:
                return b((b) obj);
            case 6:
                return b((b) obj);
            case 7:
                k it3 = (k) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return k.e(it3, null, null, fm1.c.VISIBLE, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                return Unit.f80348a;
            case 9:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = v.gestalt_switch_subtext;
                return Unit.f80348a;
            case 10:
                k checkAndApplyDiff4 = (k) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return checkAndApplyDiff4.f96745f;
            case 11:
                k checkAndApplyDiff5 = (k) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff5.f96746g);
            case 12:
                k checkAndApplyDiff6 = (k) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return checkAndApplyDiff6.f96743d;
            case 13:
                k checkAndApplyDiff7 = (k) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                return checkAndApplyDiff7.f96740a;
            case 14:
                k checkDiff = (k) obj;
                switch (i13) {
                    case 14:
                        Intrinsics.checkNotNullParameter(checkDiff, "$this$checkDiff");
                        return checkDiff.f96741b;
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff, "$this$checkDiff");
                        return checkDiff.f96742c;
                }
            case 15:
                k checkDiff2 = (k) obj;
                switch (i13) {
                    case 15:
                        Intrinsics.checkNotNullParameter(checkDiff2, "$this$checkDiff");
                        return checkDiff2.f96744e;
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff2, "$this$checkDiff");
                        return checkDiff2.f96744e;
                }
            case 16:
                k checkDiff3 = (k) obj;
                switch (i13) {
                    case 14:
                        Intrinsics.checkNotNullParameter(checkDiff3, "$this$checkDiff");
                        return checkDiff3.f96741b;
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff3, "$this$checkDiff");
                        return checkDiff3.f96742c;
                }
            default:
                k checkDiff4 = (k) obj;
                switch (i13) {
                    case 15:
                        Intrinsics.checkNotNullParameter(checkDiff4, "$this$checkDiff");
                        return checkDiff4.f96744e;
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff4, "$this$checkDiff");
                        return checkDiff4.f96744e;
                }
        }
    }
}
