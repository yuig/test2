package u81;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.h0;
import u50.k0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121027i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f121028j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(boolean z13, int i13) {
        super(1);
        this.f121027i = i13;
        this.f121028j = z13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f121027i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, null, null, this.f121028j, 0, 991);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(this.f121028j), null, false, 0, 1015);
        }
    }

    public final on1.b e(on1.b it) {
        switch (this.f121027i) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, this.f121028j, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, this.f121028j, true, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
            case 27:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, this.f121028j, true, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, this.f121028j, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }

    public final rn1.a f(rn1.a it) {
        int i13 = this.f121027i;
        boolean z13 = this.f121028j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, new rm1.d(new rm1.f(rm1.q.ARROW_DOWN, rm1.i.XS), null, d7.b.Z(z13), 0, null, 26), null, false, 0, null, null, null, null, null, false, null, null, 2096895);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    public final yl1.b h(yl1.b it) {
        int i13 = this.f121027i;
        boolean z13 = this.f121028j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, null, this.f121028j, null, null, null, null, null, null, 0, null, 1021);
    }

    public final void i(ln1.l bind) {
        int i13 = this.f121027i;
        boolean z13 = this.f121028j;
        switch (i13) {
            case 9:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(d7.b.Z(z13));
                break;
            case 10:
            case 11:
            case 12:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(d7.b.Z(z13));
                break;
            case 13:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(z13 ? ln1.e.LOADING : ln1.e.LOADED);
                bind.f84048e = z13 ? fm1.c.VISIBLE : fm1.c.GONE;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(z13 ? ln1.e.LOADING : ln1.e.LOADED);
                bind.f84048e = z13 ? fm1.c.VISIBLE : fm1.c.GONE;
                break;
            case 15:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(d7.b.Z(z13));
                break;
            case 16:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(z13 ? ln1.e.LOADING : ln1.e.LOADED);
                bind.f84048e = z13 ? fm1.c.VISIBLE : fm1.c.GONE;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f121027i;
        boolean z13 = this.f121028j;
        switch (i13) {
            case 0:
                return b((om1.c) obj);
            case 1:
                return f((rn1.a) obj);
            case 2:
                return b((om1.c) obj);
            case 3:
                return h((yl1.b) obj);
            case 4:
                bm1.v bind = (bm1.v) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bm1.n selectedState = !z13 ? bm1.n.UNSELECTED : bm1.n.SELECTED;
                bind.getClass();
                Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                bind.f23525b = selectedState;
                bm1.b buttonType = new bm1.b(!z13 ? bs1.c.j2(new String[0], x0.add) : bs1.c.j2(new String[0], x0.added));
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                bind.f23526c = buttonType;
                return Unit.f80348a;
            case 5:
                return h((yl1.b) obj);
            case 6:
                return h((yl1.b) obj);
            case 7:
                return f((rn1.a) obj);
            case 8:
                return h((yl1.b) obj);
            case 9:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 10:
                return e((on1.b) obj);
            case 11:
                v91.a it = (v91.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return v91.a.e(it, false, null, new k0(z13 ? b52.c.feature_enabled : b52.c.feature_disabled), this.f121028j, 3);
            case 12:
                v91.u it2 = (v91.u) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return v91.u.b(it2, z13);
            case 13:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 14:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 15:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 16:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 17:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 18:
                return f((rn1.a) obj);
            case 19:
                return f((rn1.a) obj);
            case 20:
                return f((rn1.a) obj);
            case 21:
                return h((yl1.b) obj);
            case 22:
                pb1.a it3 = (pb1.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return pb1.a.e(it3, z13, z13 ? yn1.f.DEFAULT : yn1.f.ERROR, !z13, 8);
            case 23:
                return h((yl1.b) obj);
            case 24:
                ao1.b it4 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return ao1.b.e(it4, null, null, !z13 ? bs1.c.j2(new String[0], c52.e.settings_parental_passcode_required_helper_text) : h0.f120562a, null, z13 ? yn1.f.DEFAULT : yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 25:
                return h((yl1.b) obj);
            case 26:
                return e((on1.b) obj);
            case 27:
                return e((on1.b) obj);
            case 28:
                return h((yl1.b) obj);
            default:
                return e((on1.b) obj);
        }
    }
}
