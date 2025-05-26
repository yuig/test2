package px1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f101631j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f101632k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f101633l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f101634m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f101635n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f101636o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f101637p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f101638q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f101639r = new e(8);

    /* renamed from: s, reason: collision with root package name */
    public static final e f101640s = new e(9);

    /* renamed from: t, reason: collision with root package name */
    public static final e f101641t = new e(10);

    /* renamed from: u, reason: collision with root package name */
    public static final e f101642u = new e(11);

    /* renamed from: v, reason: collision with root package name */
    public static final e f101643v = new e(12);

    /* renamed from: w, reason: collision with root package name */
    public static final e f101644w = new e(13);

    /* renamed from: x, reason: collision with root package name */
    public static final e f101645x = new e(14);

    /* renamed from: y, reason: collision with root package name */
    public static final e f101646y = new e(15);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101647i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f101647i = i13;
    }

    public final on1.k b(on1.k it) {
        switch (this.f101647i) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, true, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, false, true, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f101647i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DISABLED, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DISABLED, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101647i;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter((zx.g) obj, "it");
                break;
            case 3:
                ((Number) obj).longValue();
                break;
            case 4:
                Intrinsics.checkNotNullParameter((zx.f) obj, "it");
                break;
            case 5:
                ((Boolean) obj).getClass();
                break;
            case 6:
                ((Number) obj).longValue();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                q it2 = (q) obj;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    case 14:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                break;
            case 14:
                q it3 = (q) obj;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    case 14:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                }
                break;
            default:
                q it4 = (q) obj;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                    case 14:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
