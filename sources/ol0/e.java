package ol0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.k0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f96357j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f96358k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f96359l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f96360m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f96361n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f96362o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f96363p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f96364q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f96365r = new e(8);

    /* renamed from: s, reason: collision with root package name */
    public static final e f96366s = new e(9);

    /* renamed from: t, reason: collision with root package name */
    public static final e f96367t = new e(10);

    /* renamed from: u, reason: collision with root package name */
    public static final e f96368u = new e(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96369i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f96369i = i13;
    }

    public final ao1.b b(ao1.b it) {
        switch (this.f96369i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, null, null, yn1.f.DEFAULT, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4192223);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, bs1.c.j2(new String[0], x0.unorganized_pins_edit_text_hint), null, yn1.f.DEFAULT, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }

    public final on1.b e(on1.b it) {
        switch (this.f96369i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, !it.f96708a, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, !it.f96708a, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, true, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, true, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }

    public final rn1.a f(rn1.a it) {
        switch (this.f96369i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], d70.g.board_secret_toggle), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], a70.c.board_personalization), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f96369i) {
            case 0:
                return b((ao1.b) obj);
            case 1:
                return b((ao1.b) obj);
            case 2:
                return f((rn1.a) obj);
            case 3:
                return f((rn1.a) obj);
            case 4:
                return e((on1.b) obj);
            case 5:
                return e((on1.b) obj);
            case 6:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
            case 7:
                return e((on1.b) obj);
            case 8:
                return e((on1.b) obj);
            case 9:
                return e((on1.b) obj);
            case 10:
                return e((on1.b) obj);
            default:
                vl1.p bind = (vl1.p) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i13 = a70.c.soft_deletion_alert_modal_callout_message;
                bind.getClass();
                bind.f126141b = new k0(i13);
                vl1.k variant = vl1.k.f126123d;
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f126144e = variant;
                bind.f126142c = false;
                return Unit.f80348a;
        }
    }
}
